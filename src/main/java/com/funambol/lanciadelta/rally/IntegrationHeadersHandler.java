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
import java.util.Hashtable;
import org.apache.axis.AxisFault;
import org.apache.axis.MessageContext;
import org.apache.axis.handlers.BasicHandler;
import org.apache.axis.transport.http.HTTPConstants;

/**
 * This is an Axis chain handler that injects in the HTTP request the
 * integration headers required by Rally to identify an incoming integration.
 *
 * This handler is configured in the client-config.wsdd deployment descriptor.
 *
 * @author ste
 */
public class IntegrationHeadersHandler
extends BasicHandler
implements Constants {

    private static final String HEADER_OS =
            System.getProperty("os.name", "unknown os name") + " " +
            System.getProperty("os.version", "unknown os version") + " " +
            System.getProperty("os.arch", "unknown os arch");

    private static final String PLATFORM =
            System.getProperty("java.vendor", "unknown java vendor") + " " +
            System.getProperty("java.version", "unknown java version");

    public void invoke(MessageContext ctx) throws AxisFault {

        Hashtable httpHeaders =
                (Hashtable) ctx.getProperty(HTTPConstants.REQUEST_HEADERS);

        if (httpHeaders == null) {
            httpHeaders = new Hashtable();
            ctx.setProperty(HTTPConstants.REQUEST_HEADERS, httpHeaders);
        }
        //
        // First we add all properties configured in the deployment descriptor
        //
        httpHeaders.putAll(options);

        //
        // Then we add some additional Rally headers
        //
        httpHeaders.put(HEADER_INTEGRATION_OS, HEADER_OS);
        httpHeaders.put(HEADER_INTEGRATION_PLATFORM, PLATFORM);
        httpHeaders.put(HEADER_INTEGRATION_LIBRARY, RALLY_INTEGRATION_VERSION);
    }
}
