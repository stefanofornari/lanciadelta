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

/**
 *
 * @author ste
 */
public interface Constants {
    public final String PROPERTY_USERNAME = "rally.user";
    public final String PROPERTY_PASSWORD = "rally.password";
    public final String PROPERTY_HOST = "rally.host";
    public final String PROPERTY_ARTIFACTID = "artifactId";
    public final String PROPERTY_GROUPID = "groupId";
    public final String PROPERTY_VERSION = "version";

    public final String RALLY_HOST_COMMUNITY = "community.rallydev.com";
    public final String RALLY_URL = "/slm/webservice/1.10";
    public final String RALLY_HOST_ENTERPRISE = "rally1.rallydev.com";
    public final String RALLY_SERVICE_URL  = "/RallyService";
    public final String WORKSPACE = "workspace";
    public final String HIERARCHICAL_REQUIREMENT = "hierarchicalrequirement";
    public final String STORY = "story";
    public final String ITERATION = "iteration";
    public final String RELEASE = "release";

    public final String RALLY_INTEGRATION_VERSION = "Rally Java REST API 1.10";
    public final String RALLY_SERVICE_OBJECT = "rally";
    public final String RALLY_WORKSPACE_OBJECT = "workspace";

    public final String HEADER_INTEGRATION_NAME = "X-RallyIntegrationName";
    public final String HEADER_INTEGRATION_VERSION = "X-RallyIntegrationVersion";
    public final String HEADER_INTEGRATION_VENDOR = "X-RallyIntegrationVendor";
    public final String HEADER_INTEGRATION_OS = "X-RallyIntegrationOS";
    public final String HEADER_INTEGRATION_PLATFORM = "X-RallyIntegrationPlatform";
    public final String HEADER_INTEGRATION_LIBRARY = "X-RallyIntegrationLibrary";

}
