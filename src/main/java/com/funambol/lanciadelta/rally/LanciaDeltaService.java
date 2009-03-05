/*
 * Copyright (C) 2009
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Affero General Public License version 3 as published by
 * the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program; if not, see http://www.gnu.org/licenses or write to
 * the Free Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301 USA.
 *
 * The interactive user interfaces in modified source and object code versions
 * of this program must display Appropriate Legal Notices, as required under
 * Section 5 of the GNU Affero General Public License version 3.
 *
 * In accordance with Section 7(b) of the GNU Affero General Public License
 * version 3, these Appropriate Legal Notices must retain the display of the
 * "Derived from Travian world" logo. If the display of the logo is not
 * reasonably feasible for technical reasons, the Appropriate Legal Notices must
 * display the words "Derived from Travian world".
 */

package com.funambol.lanciadelta.rally;

import com.funambol.lanciadelta.Constants;
import com.funambol.lanciadelta.LanciaDeltaBeanMap;
import com.rallydev.webservice.v1_10.domain.Artifact;
import com.rallydev.webservice.v1_10.domain.DomainObject;
import com.rallydev.webservice.v1_10.domain.HierarchicalRequirement;
import com.rallydev.webservice.v1_10.domain.Iteration;
import com.rallydev.webservice.v1_10.domain.Project;
import com.rallydev.webservice.v1_10.domain.QueryResult;
import com.rallydev.webservice.v1_10.domain.Release;
import com.rallydev.webservice.v1_10.domain.Workspace;
import com.rallydev.webservice.v1_10.service.RallyService;
import com.rallydev.webservice.v1_10.service.RallyServiceServiceLocator;
import com.rallydev.webservice.v1_10.service.RallyServiceSoapBindingStub;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.rpc.Service;
import org.apache.axis.client.Stub;

/**
 *
 * @author ste
 */
public class LanciaDeltaService
extends RallyServiceSoapBindingStub
implements RallyService, Constants {

    private static LanciaDeltaService instance = null;

    private LanciaDeltaService(URL endpointURL, Service service)
    throws org.apache.axis.AxisFault {
         super(endpointURL, service);
    }

    // ---------------------------------------------------------- Public methods

    public Map<String, Object> object2Map(Iteration o) {
        return new LanciaDeltaBeanMap(o);
    }

    /**
     * Returns the iterations withe the given name.
     *
     * @param workspace the workspace into which make the search
     * @param name the iteration name
     *
     * @return the iterations with the given name
     *
     * @throws Exception in case of errors
     */
    public List<Iteration> getIterations(Workspace workspace, String name) 
    throws RallyException{
        final int PAGE = 50;
        ArrayList<Iteration> iterations = new ArrayList();

        QueryResult rs = null;
        boolean cont = true;
        long i = 1, tot = 0;
        do {
            try {
                rs = query(workspace, ITERATION, "(Name = " + name + ")", "", false, i, PAGE);
            
                DomainObject[] results = rs.getResults();
                tot = rs.getTotalResultCount();

                for (DomainObject r: results) {
                    Iteration iteration = new Iteration();
                    iteration.setRef(r.getRef());
                    iteration = (Iteration)read(iteration);
                    iterations.add(iteration);
                    ++i;
                }
            } catch (Exception e) {
                throw new RallyException("Error getting the iterations with name" + name, e);
            }
        } while (i<=tot);

        return iterations;

    }

    /**
     * Returns the user stories scheduled in the given iteration.
     * <br><b>
     * NOTE: we assume that there are not iterations with the same name in a
     * workspace.
     * </b>
     *
     * @param name of the iteration reference id
     * @param w Rally workspace
     *
     * @return the user stories scheduled in the given iteration
     *
     * @throws RallyException in case of errors
     */
    public List<Artifact> getIterationStories(Workspace w, String name)
    throws RallyException{
        final int PAGE = 10;

        List<Iteration> iterations = getIterations(w, name);

        if (iterations.size() == 0) {
            throw new RallyException("Iteration '" + name + "' not found");
        }

        final String QUERY = "(Iteration = " 
                           + iterations.get(0).getRef()
                           + ")"
                           ;

        List<Artifact> ret = new ArrayList<Artifact>();

        long i = 1, tot = 0;
        QueryResult rs = null;
        do {
            try {
                rs = query(w, HIERARCHICAL_REQUIREMENT, QUERY, "", true, i, PAGE);
            
                DomainObject[] results = rs.getResults();
                tot = rs.getTotalResultCount();

                for (DomainObject o: results) {
                    ret.add((Artifact)o);
                    ++i;
                }
            } catch (Exception e) {
                throw new RallyException("Error reading itertion stories for " + iterations.get(0).getRef(), e);
            }
        } while (i<=tot);

        return ret;
    }

    /**
     * Returns the user story with the given id.
     *
     * @param workspace the workspace into which make the search
     * @param id the user story id
     *
     * @return the user story with the given
     *
     * @throws RallyException in case of errors
     */
    public HierarchicalRequirement getStory(Workspace workspace, String id)
    throws RallyException{
        final int PAGE = 50;

        try {
            QueryResult rs = query(workspace, HIERARCHICAL_REQUIREMENT, "(FormattedID = " + id + ")", "", true, 1, PAGE);
            DomainObject[] results = rs.getResults();

            if ((results != null) && (results.length > 0)) {
                HierarchicalRequirement story = (HierarchicalRequirement)(results[0]);

                if (story.getParent() != null) {
                    story.setParent((HierarchicalRequirement)read(story.getParent()));
                }
                if (story.getProject() != null) {
                    story.setProject((Project)read(story.getProject()));
                }
                if (story.getIteration() != null) {
                    story.setIteration((Iteration)read(story.getIteration()));
                }
                if (story.getRelease() != null) {
                    story.setRelease((Release)read(story.getRelease()));
                }

                return story;
            }
        } catch (Exception e) {
            throw new RallyException(e);
        }

        throw new RallyException("No user story found with ID " + id);

    }

    // --------------------------------------------------------------- Singleton


    /**
     *
     * @return
     * @throws com.funambol.lanciadelta.rally.RallyException
     */
    public synchronized static LanciaDeltaService getInstance() throws RallyException {
        if (instance != null) {
            return instance;
        }

        return (instance = initializeRallyService());
    }

    /**
     * Initialize the session to access Rally services
     *
     * @throws java.lang.Exception
     */
    private static LanciaDeltaService initializeRallyService() throws RallyException {
        try {
            URL url = new URL(LanciaDeltaService.RALLY_SERVICE_URL);
            RallyService service = (new LanciaDeltaServiceLocator()).getRallyService(url);

            // set authentication information on the service
            Stub stub = (Stub) service;
            stub.setUsername(System.getProperty(PROPERTY_USERNAME));
            stub.setPassword(System.getProperty(PROPERTY_PASSWORD));

            // Configure the service to maintain an HTTP session cookie
            stub.setMaintainSession(true);

            return (LanciaDeltaService)service;
        } catch (Exception e) {
            throw new RallyException(e);
        }
    }

    // ----------------------------------------------- LanciaDeltaServiceLocator

    private static class LanciaDeltaServiceLocator extends RallyServiceServiceLocator {

        @Override
        public com.rallydev.webservice.v1_10.service.RallyService getRallyService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
            try {
                LanciaDeltaService _stub =
                    new LanciaDeltaService(portAddress, LanciaDeltaServiceLocator.this);
                _stub.setPortName(getRallyServiceWSDDServiceName());
                return _stub;
            }
            catch (org.apache.axis.AxisFault e) {
                return null;
            }
        }
    }
}
