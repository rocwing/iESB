package org.wso2.carbon.authenticator.proxy;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;
import org.apache.axis2.transport.http.HTTPConstants;
import org.wso2.carbon.statistics.ui.StatisticsAdminStub;

import javax.servlet.http.HttpSession;

public class ClientTest {
	
	
	
	
	public static void main(String[] args) throws RemoteException, AuthenticationExceptionException   {
		
		
		String serverURL = "https://172.20.42.43:9447/esb/services/AuthenticationAdmin";
		AuthenticationAdminStub stub = new AuthenticationAdminStub(serverURL);
		
		stub.login("admin", "admin", "172.20.41.40");
		StatisticsAdminStub sstub = new StatisticsAdminStub("https://172.20.42.43:9447/esb/services/StatisticsAdmin");
		
		System.out.println(sstub.getSystemStatistics().getServerStartTime());
		
		
		/*
		String cookie = (String)stub._getServiceClient().getServiceContext().getProperty(
                HTTPConstants.COOKIE_STRING);
		
		session.setAttribute(ServerConstants.ADMIN_SERVICE_AUTH_TOKEN, cookie);
		*/
	}

}
