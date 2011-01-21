/*                                                                             
 * Copyright 2004,2005 The Apache Software Foundation.                         
 *                                                                             
 * Licensed under the Apache License, Version 2.0 (the "License");             
 * you may not use this file except in compliance with the License.            
 * You may obtain a copy of the License at                                     
 *                                                                             
 *      http://www.apache.org/licenses/LICENSE-2.0                             
 *                                                                             
 * Unless required by applicable law or agreed to in writing, software         
 * distributed under the License is distributed on an "AS IS" BASIS,           
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.    
 * See the License for the specific language governing permissions and         
 * limitations under the License.                                              
 */
package org.wso2.carbon.authenticator.proxy;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.wso2.carbon.ui.authentication.AuthenticationException;



import javax.servlet.http.HttpSession;

/**
 *
 */
public class AuthenticationAdminClient {

    private static final Log log = LogFactory.getLog(AuthenticationAdminClient.class);
    private AuthenticationAdminStub stub;
    private HttpSession session;
    private boolean doManageSession;

    public AuthenticationAdminClient(ConfigurationContext ctx, String serverURL, String cookie,
            HttpSession session, boolean doManageSession) throws AxisFault {
        this.session = session;
        this.doManageSession = doManageSession;
        String serviceEPR = serverURL + "AuthenticationAdmin";
        stub = new AuthenticationAdminStub(ctx, serviceEPR);
        ServiceClient client = stub._getServiceClient();
        Options options = client.getOptions();
        options.setManageSession(this.doManageSession);
        if (cookie != null && this.doManageSession) {
            options.setProperty(HTTPConstants.COOKIE_STRING, cookie);
        }
    }

    public boolean login(String username, String password, String remoteAddress)
     {

        try {
            boolean result = stub.login(username, password, remoteAddress);
            setAdminCookie(result);
            return result;
        } catch (java.lang.Exception e) {
            String msg = "Error occurred while logging in";
            log.error(msg, e);
            
        }
        
        return true;
        
    }

    public String getAdminCookie() {
        return (String) stub._getServiceClient().getServiceContext().getProperty(
                HTTPConstants.COOKIE_STRING); 
    }

    private void setAdminCookie(boolean result) {
        if (result && doManageSession) {
            String cookie = (String) stub._getServiceClient().getServiceContext().getProperty(
                    HTTPConstants.COOKIE_STRING);
            session.setAttribute(ServerConstants.ADMIN_SERVICE_AUTH_TOKEN, cookie);
        }
    }

    public void logout() {
        try {
            stub.logout();
            session.removeAttribute(ServerConstants.ADMIN_SERVICE_AUTH_TOKEN);
        } catch (java.lang.Exception e) {
            String msg = "Error occurred while logging out";
            log.error(msg, e);
            
        }
    }
}
