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
import junit.framework.TestCase;

import com.rallydev.webservice.v1_14.domain.Release;
import com.rallydev.webservice.v1_14.domain.Workspace;

/**
 *
 * @author ste
 */
public class LanciaDeltaServiceTest
extends TestCase
implements Constants {
    
    public LanciaDeltaServiceTest(String testName) {
        super(testName);
    }

    @Override
    public void setUp() {
        System.setProperty(Constants.PROPERTY_HOST, Constants.RALLY_HOST_COMMUNITY);
    }

    public void testSingleton() throws Exception {
        //
        // LanciaDeltaService acts also as a singleton for the service instance.
        // Let's test that we  get always the same instance.
        //
        LanciaDeltaService service1 = LanciaDeltaService.getInstance();
        assertNotNull(service1);

        LanciaDeltaService service2 = LanciaDeltaService.getInstance();

        //
        // Note: assertEquals is not correct here since we whant to test the
        // two references are the same.
        //
        assertTrue(service1 == service2);
    }

    public void testGetRelease() throws Exception {
        final String TEST_RELEASE_NAME = "1.0";

        LanciaDeltaService service = LanciaDeltaService.getInstance();

        Release r = service.getRelease("none");

        assertNull(r);

        r = service.getRelease(TEST_RELEASE_NAME);

        assertEquals(TEST_RELEASE_NAME, r.getName());
    }

}
