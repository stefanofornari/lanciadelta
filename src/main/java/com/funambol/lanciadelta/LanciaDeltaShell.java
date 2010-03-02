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

import bsh.Interpreter;
import com.funambol.lanciadelta.rally.LanciaDeltaService;
import java.io.InputStreamReader;
import java.net.URL;
import org.apache.commons.lang.StringUtils;


/**
 * This is the command line main class that creates, initializes and launches
 * the BeanShell interpreter.
 *
 * @author ste
 */
public class LanciaDeltaShell
implements Constants {
    // ------------------------------------------------------------ Private data

    private Interpreter interpreter;

    private LanciaDeltaService service;

    private boolean interactive;

    // ------------------------------------------------------------ Constructors

    public LanciaDeltaShell() throws Exception {
        checkProperties();

        service = LanciaDeltaService.getInstance();

        interpreter = new Interpreter( 
            new InputStreamReader(System.in),
            System.out,
            System.err,
            true
        );
        interpreter.set(RALLY_SERVICE_OBJECT, service);
        interpreter.setShowResults(true);

        interpreter.eval("importCommands(\"/ext\");");
        interpreter.eval("initialize();");
    }
    
    // ---------------------------------------------------------- Public methods

    public Interpreter getInterpreter() {
        return interpreter;
    }

    public boolean isInteractive() {
        return interactive;
    }

    // -------------------------------------------------------------------- main

    public static void main(String[] args) throws Exception {
        LanciaDeltaShell shell = null;

        try {
            shell = new LanciaDeltaShell();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }

        shell.execute();
 
     }

    // --------------------------------------------------------- Private methods

    /**
     * Checks if the needed system properties has been defined
     * 
     * @throws java.lang.RuntimeException
     */
    private void checkProperties() throws RuntimeException, Exception {
        String value = System.getProperty(PROPERTY_USERNAME);

        if (StringUtils.isEmpty(value)) {
            throw new RuntimeException(getMissingPropertyMessage(PROPERTY_USERNAME));
        }

        value = System.getProperty(PROPERTY_PASSWORD);
        if (StringUtils.isEmpty(value)) {
            throw new RuntimeException(getMissingPropertyMessage(PROPERTY_PASSWORD));
        }

        value = System.getProperty(PROPERTY_HOST);
        if (StringUtils.isEmpty(value)) {
            System.setProperty(PROPERTY_HOST, RALLY_HOST_COMMUNITY);
        }

        value = System.getProperty(PROPERTY_SCRIPT);

        if (StringUtils.isEmpty(value)) {
            interactive = true;
        } else {
            new URL(value); // just to check it is a valid URL
            interactive = false;
        }
    }

    private String getMissingPropertyMessage(String p) {
        return "Missing " + p + ". Use -D" + p + "=<value>";
    }

    /**
     * Executes the script read from the standard input stream or given URL
     *
     */
    private void execute() throws Exception {
        if (isInteractive()) {
            while (true) {
                try {
                    getInterpreter().run();
                } catch (Exception e) {
                    System.err.println("ERR: " + e.getMessage());
                    System.err.println(">>>");
                    e.printStackTrace();
                    System.err.println("<<<");
                }
            }
        } else {
            URL url = new URL(System.getProperty(PROPERTY_SCRIPT));

            try {
                getInterpreter().eval(
                    new InputStreamReader(url.openStream())
                );
            } catch (Exception e) {
                System.err.println("ERR: " + e.getMessage());
                System.err.println(">>>");
                e.printStackTrace();
                System.err.println("<<<");
            }
        }
    }
}
