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
import com.rallydev.webservice.v1_10.domain.HierarchicalRequirement;
import com.rallydev.webservice.v1_10.domain.Iteration;
import com.rallydev.webservice.v1_10.domain.Project;
import java.util.Calendar;
import java.util.Map;
import junit.framework.TestCase;

/**
 *
 * @author ste
 */
public class BeanMapHelperTest extends TestCase {

    public final String PROJECT_NAME = "project 01";
    public final String PROJECT_NOTES = "project note1\nproject note2";
    public final String PROJECT_DESCRIPTION = "a project description";
    public final String PROJECT_OWNER = "The Owner";
    public final String PROJECT_STATE = "the state";

    public final String ITERATION_NAME = "iteration 01";
    public final String ITERATION_NOTES = "iteration note1\niteration note2";
    public final String ITERATION_STATE = "the state";
    public final String ITERATION_THEME = "the iteration theme";

    public final String STORY_NAME = "story 01";
    public final String STORY_FORMATTED_ID = "US001";
    public final String STORY_OWNER = "Owner";
    public final String STORY_PACKAGE = "package";
    public final String STORY_DESCRIPTION = "story description";
    public final String STORY_NOTES = "story note1\nstory note2";
    public final String STORY_STATE = "accepted";
    public final String STORY_BLOCKED = "false";
    public final double STORY_ESTIMATE = 5.0;

    public final String PARENT_NAME = "parent user story";
    public final String PARENT_FORMATTED_ID = "US01";


    private Calendar startDate;
    private Calendar endDate;
    
    public BeanMapHelperTest(String testName) {
        super(testName);

        startDate = Calendar.getInstance();
        endDate = Calendar.getInstance();
        endDate.setTimeInMillis(startDate.getTimeInMillis() + 1000*60*60*24*2);
    }

    public void testConvertObject() throws Exception {
        Map<String, Object> map = null;

        map = BeanMapHelper.getMap((Object)getIteration());
        assertEquals(Constants.ITERATION, map.get(BeanMapHelper.CONVERTED_FROM));
        
    }

    public void testConvertIteration() throws Exception {
        Iteration i = getIteration();

        Map<String, Object> map = BeanMapHelper.getMap(i);

        assertEquals(ITERATION_NAME, map.get("name"));
        assertEquals(ITERATION_NOTES, map.get("notes"));
        assertEquals(BeanMapHelper.sdf.format(startDate.getTime()), map.get("startDate"));
        assertEquals(BeanMapHelper.sdf.format(endDate.getTime()), map.get("endDate"));
        assertEquals(ITERATION_STATE, map.get("state"));
        assertEquals(ITERATION_THEME, map.get("theme"));

        assertEquals(PROJECT_NAME, map.get("project.name"));
        assertEquals(PROJECT_DESCRIPTION, map.get("project.description"));
        assertEquals(PROJECT_NOTES, map.get("project.notes"));
        assertEquals(PROJECT_OWNER, map.get("project.owner"));
        assertEquals(PROJECT_STATE, map.get("project.state"));
    }

    public void testConvertStory() throws Exception {
        HierarchicalRequirement s = getStory();

        Map<String, Object> map = BeanMapHelper.getMap(s);

        System.out.println(map);

        assertEquals(STORY_FORMATTED_ID, map.get("formattedID"));
        assertEquals(STORY_NAME, map.get("name"));
        assertEquals(STORY_OWNER, map.get("owner"));
        //
        // I do not know how to set the package...
        //
        //assertEquals(STORY_PACKAGE, map.get("package"));
        assertEquals(STORY_DESCRIPTION, map.get("description"));
        assertEquals(STORY_NOTES, map.get("notes"));
        assertEquals(STORY_STATE, map.get("scheduleState"));
        assertEquals(Boolean.parseBoolean(STORY_BLOCKED), ((Boolean)map.get("blocked")).booleanValue());
        assertEquals(STORY_ESTIMATE, ((Double)map.get("planEstimate")).doubleValue());
        assertEquals(PARENT_NAME, map.get("parent.name"));
        assertEquals(PARENT_FORMATTED_ID, map.get("parent.formattedID"));

        assertEquals(PROJECT_NAME, map.get("project.name"));
        assertEquals(ITERATION_NAME, map.get("iteration.name"));
    }
    
    private Iteration getIteration() {
        Iteration i = new Iteration();

        i.setName(ITERATION_NAME);
        i.setNotes(ITERATION_NOTES);
        i.setStartDate(startDate);
        i.setEndDate(endDate);
        i.setState(ITERATION_STATE);
        i.setTheme(ITERATION_THEME);
        
        i.setProject(getProject());

        return i;
    }

    private Project getProject() {
        Project p = new Project();

        p.setName(PROJECT_NAME);
        p.setDescription(PROJECT_DESCRIPTION);
        p.setNotes(PROJECT_NOTES);
        p.setOwner(PROJECT_OWNER);
        p.setState(PROJECT_STATE);

        return p;
    }

    private HierarchicalRequirement getStory() {
        HierarchicalRequirement s = new HierarchicalRequirement();

        s.setFormattedID(STORY_FORMATTED_ID);
        s.setName(STORY_NAME);
        s.setOwner(STORY_OWNER);
        s.setBlocked(false);
        s.setDescription(STORY_DESCRIPTION);
        s.setNotes(STORY_NOTES);
        s.setPlanEstimate(STORY_ESTIMATE);
        s.setAcceptedDate(endDate);
        s.setScheduleState(STORY_STATE);

        HierarchicalRequirement parent = new HierarchicalRequirement();
        parent.setFormattedID(PARENT_FORMATTED_ID);
        parent.setName(PARENT_NAME);

        s.setParent(parent);
        s.setProject(getProject());
        s.setIteration(getIteration());

        return s;
    }

}
