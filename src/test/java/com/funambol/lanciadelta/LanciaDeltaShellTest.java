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

package com.funambol.lanciadelta;

import com.funambol.lanciadelta.rally.LanciaDeltaService;
import bsh.Interpreter;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Properties;
import junit.framework.TestCase;

/**
 *
 * @author ste
 */
public class LanciaDeltaShellTest
extends TestCase
implements Constants {
    
    public LanciaDeltaShellTest(String testName) {
        super(testName);
    }

    public void testDummy() {
        
    }

    public void testRequiredProperties() throws Exception {
        //
        // When tests are executed, the below properties must be set so that all
        // other tests can be executed. Therefore, we need to explicitely remove
        // such properties before executing the test code below.
        //
        Properties p = System.getProperties();
        p.remove(PROPERTY_USERNAME);
        p.remove(PROPERTY_PASSWORD);
        p.remove(PROPERTY_HOST);

        try {
            new LanciaDeltaShell();
            fail();
        } catch (Exception e) {
            //
            // this is ok
            //
            String msg = e.getMessage();
            assertTrue(msg.indexOf(PROPERTY_USERNAME) >= 0);
        }

        System.setProperty(PROPERTY_USERNAME, "user");
        try {
            new LanciaDeltaShell();
            fail();
        } catch (Exception e) {
            //
            // this is ok
            //
            String msg = e.getMessage();
            assertTrue(msg.indexOf(PROPERTY_PASSWORD) >= 0);
        }

        System.setProperty(PROPERTY_PASSWORD, "password");

        new LanciaDeltaShell();
        assertEquals(System.getProperty(PROPERTY_HOST), RALLY_HOST_COMMUNITY);

        System.setProperty(PROPERTY_HOST, RALLY_HOST_ENTERPRISE);
        new LanciaDeltaShell();
        assertEquals(System.getProperty(PROPERTY_HOST), RALLY_HOST_ENTERPRISE);
    }

    public void testScriptFileOK() throws Exception {
        _testProperty(PROPERTY_SCRIPT, "target/test-classes/dummy.bsh");
    }

    public void testScriptFileKO() throws Exception {
        _testProperty(PROPERTY_SCRIPT, "nonexistingfile.bsh");
    }

    public void _testParserInitialization() throws Exception {
        LanciaDeltaShell shell = new LanciaDeltaShell();

        //
        // If the shell initializes correctly we should have a valid
        // RallyService object
        //
        Interpreter interpreter = shell.getInterpreter();

        //
        // do we have external commands
        //
        interpreter.eval("checkInstallation();");

        LanciaDeltaService service = (LanciaDeltaService)interpreter.get(RALLY_SERVICE_OBJECT);
        assertNotNull(service);
    }

    public void testIsInteractive() throws Exception {
        LanciaDeltaShell shell = new LanciaDeltaShell();

        assertTrue(shell.isInteractive());
    }

    public void testIsNotInteractive() throws Exception {
        System.setProperty(PROPERTY_SCRIPT, "dummy.bsh");
        LanciaDeltaShell shell = new LanciaDeltaShell();

        assertFalse(shell.isInteractive());
    }

    public void testExecuteCommandLineScript() throws Exception {
        System.setProperty(PROPERTY_SCRIPT, "target/test-classes/dummy.bsh");

        LanciaDeltaShell shell = new LanciaDeltaShell();

        Method m = LanciaDeltaShell.class.getDeclaredMethod("execute");
        m.setAccessible(true);
        m.invoke(shell);

        Interpreter interpreter = shell.getInterpreter();

        assertTrue((Boolean)interpreter.get("executed"));
    }

    // --------------------------------------------------------- Private methods
    
    private void _testProperty(final String key, final String value) throws Exception {
        System.setProperty(key, value);

        try {
            new LanciaDeltaShell();
        } finally {
            System.getProperties().remove(key);
        }

    }
}
