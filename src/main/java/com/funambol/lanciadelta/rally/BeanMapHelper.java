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
import java.util.HashMap;
import java.util.Map;

import com.funambol.lanciadelta.LanciaDeltaBeanMap;
import com.rallydev.webservice.v1_14.domain.HierarchicalRequirement;
import com.rallydev.webservice.v1_14.domain.Iteration;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 *
 * @author ste
 */
public class BeanMapHelper implements Constants {

    public final static String DATE_FORMAT = "yyyy-MM-dd KK:mm:ss z";

    public final static SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

    public static final String CONVERTED_FROM = "convertedFrom";

    /**
     * Returns the map corresponding to the given objects based on the type of
     * the object. It sets also the property <i>CONVERTED_FROM</i> to make
     * explicit which conversion was applied.
     *
     * @param o the object to turn into a map
     *
     * @return the resulting map
     */
    public static Map<String, Object> getMap(Object o) {
        if (o instanceof Iteration) {
            return getMap((Iteration)o);
        } else if (o instanceof HierarchicalRequirement) {
            return getMap((HierarchicalRequirement)o);
        }

        return new LanciaDeltaBeanMap(o);
    }
    
    /**
     * Puts together all properties of Iteration and Iteration.getProject(); the
     * latter will be prefixed by <i>'project.'</i>. Plus, startDate and
     * endDate are converted into Strings with format YYYYMMDD hh:mm:ss Z
     *
     * @param i the iteration to turn into a map
     *
     * @return the resulting map
     */
    public static Map<String, Object> getMap(Iteration i) {
        Map<String, Object> map = new HashMap<String, Object>();

        LanciaDeltaBeanMap iterationMap =  new LanciaDeltaBeanMap(i);

        Date d = ((Calendar)iterationMap.get("startDate")).getTime();
        iterationMap.put("startDate", sdf.format(d));

        d = ((Calendar)iterationMap.get("endDate")).getTime();
        iterationMap.put("endDate", sdf.format(d));

        Calendar c = (Calendar)iterationMap.get("creationDate");
        if (c != null) {
            iterationMap.put("creationDate", sdf.format(c.getTime()));
        }

        LanciaDeltaBeanMap projectMap =
            new LanciaDeltaBeanMap("project", i.getProject());

        map.put(CONVERTED_FROM, ITERATION);
        map.putAll(iterationMap);
        map.putAll(projectMap);

        return map;
    }

    /**
     * Puts together all properties of a user story (a HierarchicalRequirement
     * object) and its sub properties; the latter will be prefixed by
     * <i>'project, iteration, parent.'</i>. Plus, all dates are converted into
     * strings with format YYYYMMDD hh:mm:ss Z
     *
     * @param s the user story to turn into a map
     *
     * @return the resulting map
     */
    public static Map<String, Object> getMap(HierarchicalRequirement s) {
        Map<String, Object> map = new HashMap<String, Object>();

        LanciaDeltaBeanMap storyMap =  new LanciaDeltaBeanMap(s);

        Calendar c = ((Calendar)storyMap.get("acceptedDate"));
        if (c != null) {
            storyMap.put("acceptedDate", sdf.format(c.getTime()));
        }
        
        c = ((Calendar)storyMap.get("lastUpdateDate"));
        if (c != null) {
            storyMap.put("lastUpdateDate", sdf.format(c.getTime()));
        }

        c = (Calendar)storyMap.get("creationDate");
        if (c != null) {
            storyMap.put("creationDate", sdf.format(c.getTime()));
        }

        map.put(CONVERTED_FROM, HIERARCHICAL_REQUIREMENT);
        map.putAll(storyMap);
        map.putAll(new LanciaDeltaBeanMap("project", s.getProject()));
        if (s.getIteration() != null) {
            map.putAll(new LanciaDeltaBeanMap("iteration", s.getIteration()));
        }
        if (s.getParent() != null) {
            map.putAll(new LanciaDeltaBeanMap("parent", s.getParent()));
        }
        if (s.getRelease() != null) {
            map.putAll(new LanciaDeltaBeanMap("release", s.getRelease()));
        }

        return map;
    }

}
