

/**
 * StatisticsAdmin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

    package org.wso2.carbon.statistics.ui;

    /*
     *  StatisticsAdmin java interface
     */

    public interface StatisticsAdmin {
          

        /**
          * Auto generated method signature
          * 
                    * @param getMaxServiceResponseTime46
                
         */

         
                     public long getMaxServiceResponseTime(

                        java.lang.String serviceName47)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMaxServiceResponseTime46
            
          */
        public void startgetMaxServiceResponseTime(

            java.lang.String serviceName47,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getServiceRequestCount50
                
         */

         
                     public int getServiceRequestCount(

                        java.lang.String serviceName51)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getServiceRequestCount50
            
          */
        public void startgetServiceRequestCount(

            java.lang.String serviceName51,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
         */

         
                     public int getSystemResponseCount(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
          */
        public void startgetSystemResponseCount(

            

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getOperationResponseCount57
                
         */

         
                     public int getOperationResponseCount(

                        java.lang.String serviceName58,java.lang.String operationName59)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getOperationResponseCount57
            
          */
        public void startgetOperationResponseCount(

            java.lang.String serviceName58,java.lang.String operationName59,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAvgOperationResponseTime62
                
         */

         
                     public double getAvgOperationResponseTime(

                        java.lang.String serviceName63,java.lang.String operationName64)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAvgOperationResponseTime62
            
          */
        public void startgetAvgOperationResponseTime(

            java.lang.String serviceName63,java.lang.String operationName64,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getOperationStatistics67
                
         */

         
                     public org.wso2.carbon.statistics.ui.types.carbon.OperationStatistics getOperationStatistics(

                        java.lang.String serviceName68,java.lang.String operationName69)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getOperationStatistics67
            
          */
        public void startgetOperationStatistics(

            java.lang.String serviceName68,java.lang.String operationName69,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
         */

         
                     public long getMinSystemResponseTime(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
          */
        public void startgetMinSystemResponseTime(

            

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
         */

         
                     public int getSystemFaultCount(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
          */
        public void startgetSystemFaultCount(

            

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
         */

         
                     public long getMaxSystemResponseTime(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
          */
        public void startgetMaxSystemResponseTime(

            

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getServiceFaultCount81
                
         */

         
                     public int getServiceFaultCount(

                        java.lang.String serviceName82)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getServiceFaultCount81
            
          */
        public void startgetServiceFaultCount(

            java.lang.String serviceName82,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMinServiceResponseTime85
                
         */

         
                     public long getMinServiceResponseTime(

                        java.lang.String serviceName86)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMinServiceResponseTime85
            
          */
        public void startgetMinServiceResponseTime(

            java.lang.String serviceName86,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMaxOperationResponseTime89
                
         */

         
                     public long getMaxOperationResponseTime(

                        java.lang.String serviceName90,java.lang.String operationName91)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMaxOperationResponseTime89
            
          */
        public void startgetMaxOperationResponseTime(

            java.lang.String serviceName90,java.lang.String operationName91,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getServiceStatistics94
                
         */

         
                     public org.wso2.carbon.statistics.ui.types.carbon.ServiceStatistics getServiceStatistics(

                        java.lang.String serviceName95)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getServiceStatistics94
            
          */
        public void startgetServiceStatistics(

            java.lang.String serviceName95,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getOperationFaultCount98
                
         */

         
                     public int getOperationFaultCount(

                        java.lang.String serviceName99,java.lang.String operationName100)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getOperationFaultCount98
            
          */
        public void startgetOperationFaultCount(

            java.lang.String serviceName99,java.lang.String operationName100,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getAvgServiceResponseTime103
                
         */

         
                     public double getAvgServiceResponseTime(

                        java.lang.String serviceName104)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getAvgServiceResponseTime103
            
          */
        public void startgetAvgServiceResponseTime(

            java.lang.String serviceName104,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getServiceResponseCount107
                
         */

         
                     public int getServiceResponseCount(

                        java.lang.String serviceName108)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getServiceResponseCount107
            
          */
        public void startgetServiceResponseCount(

            java.lang.String serviceName108,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
         */

         
                     public int getSystemRequestCount(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
          */
        public void startgetSystemRequestCount(

            

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getMinOperationResponseTime114
                
         */

         
                     public long getMinOperationResponseTime(

                        java.lang.String serviceName115,java.lang.String operationName116)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getMinOperationResponseTime114
            
          */
        public void startgetMinOperationResponseTime(

            java.lang.String serviceName115,java.lang.String operationName116,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
         */

         
                     public double getAvgSystemResponseTime(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
          */
        public void startgetAvgSystemResponseTime(

            

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
         */

         
                     public org.wso2.carbon.statistics.ui.types.carbon.SystemStatistics getSystemStatistics(

                        )
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
          */
        public void startgetSystemStatistics(

            

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        /**
          * Auto generated method signature
          * 
                    * @param getOperationRequestCount125
                
         */

         
                     public int getOperationRequestCount(

                        java.lang.String serviceName126,java.lang.String operationName127)
                        throws java.rmi.RemoteException
             ;

        
         /**
            * Auto generated method signature for Asynchronous Invocations
            * 
                * @param getOperationRequestCount125
            
          */
        public void startgetOperationRequestCount(

            java.lang.String serviceName126,java.lang.String operationName127,

            final org.wso2.carbon.statistics.ui.StatisticsAdminCallbackHandler callback)

            throws java.rmi.RemoteException;

     

        
       //
       }
    