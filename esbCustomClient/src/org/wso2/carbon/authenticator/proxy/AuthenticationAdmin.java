

/**
 * AuthenticationAdmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

    package org.wso2.carbon.authenticator.proxy;

    /*
     *  AuthenticationAdmin java interface
     */

    public interface AuthenticationAdmin {
          
       /**
         * Auto generated method signature for Asynchronous Invocations
         * 
                 * @throws org.wso2.carbon.authenticator.proxy.AuthenticationExceptionException : 
         */
        public void  logout(
         

        ) throws java.rmi.RemoteException
        
        
               ,org.wso2.carbon.authenticator.proxy.AuthenticationExceptionException;

        

        /**
          * Auto generated method signature
          * 
                    * @param login2
                
             * @throws org.wso2.carbon.authenticator.proxy.AuthenticationExceptionException : 
         */

         
                     public boolean login(

                        java.lang.String username3,java.lang.String password4,java.lang.String remoteAddress5)
                        throws java.rmi.RemoteException
             
          ,org.wso2.carbon.authenticator.proxy.AuthenticationExceptionException;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param login2
            
          */
        public void startlogin(

            java.lang.String username3,java.lang.String password4,java.lang.String remoteAddress5,

            final org.wso2.carbon.authenticator.proxy.AuthenticationAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    