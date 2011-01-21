
/**
 * StatisticsAdminCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

    package org.wso2.carbon.statistics.ui;

    /**
     *  StatisticsAdminCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class StatisticsAdminCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public StatisticsAdminCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public StatisticsAdminCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for getMaxServiceResponseTime method
            * override this method for handling normal response from getMaxServiceResponseTime operation
            */
           public void receiveResultgetMaxServiceResponseTime(
                    long result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMaxServiceResponseTime operation
           */
            public void receiveErrorgetMaxServiceResponseTime(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServiceRequestCount method
            * override this method for handling normal response from getServiceRequestCount operation
            */
           public void receiveResultgetServiceRequestCount(
                    int result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServiceRequestCount operation
           */
            public void receiveErrorgetServiceRequestCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSystemResponseCount method
            * override this method for handling normal response from getSystemResponseCount operation
            */
           public void receiveResultgetSystemResponseCount(
                    int result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSystemResponseCount operation
           */
            public void receiveErrorgetSystemResponseCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOperationResponseCount method
            * override this method for handling normal response from getOperationResponseCount operation
            */
           public void receiveResultgetOperationResponseCount(
                    int result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOperationResponseCount operation
           */
            public void receiveErrorgetOperationResponseCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAvgOperationResponseTime method
            * override this method for handling normal response from getAvgOperationResponseTime operation
            */
           public void receiveResultgetAvgOperationResponseTime(
                    double result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAvgOperationResponseTime operation
           */
            public void receiveErrorgetAvgOperationResponseTime(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOperationStatistics method
            * override this method for handling normal response from getOperationStatistics operation
            */
           public void receiveResultgetOperationStatistics(
                    org.wso2.carbon.statistics.ui.types.carbon.OperationStatistics result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOperationStatistics operation
           */
            public void receiveErrorgetOperationStatistics(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMinSystemResponseTime method
            * override this method for handling normal response from getMinSystemResponseTime operation
            */
           public void receiveResultgetMinSystemResponseTime(
                    long result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMinSystemResponseTime operation
           */
            public void receiveErrorgetMinSystemResponseTime(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSystemFaultCount method
            * override this method for handling normal response from getSystemFaultCount operation
            */
           public void receiveResultgetSystemFaultCount(
                    int result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSystemFaultCount operation
           */
            public void receiveErrorgetSystemFaultCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMaxSystemResponseTime method
            * override this method for handling normal response from getMaxSystemResponseTime operation
            */
           public void receiveResultgetMaxSystemResponseTime(
                    long result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMaxSystemResponseTime operation
           */
            public void receiveErrorgetMaxSystemResponseTime(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServiceFaultCount method
            * override this method for handling normal response from getServiceFaultCount operation
            */
           public void receiveResultgetServiceFaultCount(
                    int result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServiceFaultCount operation
           */
            public void receiveErrorgetServiceFaultCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMinServiceResponseTime method
            * override this method for handling normal response from getMinServiceResponseTime operation
            */
           public void receiveResultgetMinServiceResponseTime(
                    long result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMinServiceResponseTime operation
           */
            public void receiveErrorgetMinServiceResponseTime(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMaxOperationResponseTime method
            * override this method for handling normal response from getMaxOperationResponseTime operation
            */
           public void receiveResultgetMaxOperationResponseTime(
                    long result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMaxOperationResponseTime operation
           */
            public void receiveErrorgetMaxOperationResponseTime(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServiceStatistics method
            * override this method for handling normal response from getServiceStatistics operation
            */
           public void receiveResultgetServiceStatistics(
                    org.wso2.carbon.statistics.ui.types.carbon.ServiceStatistics result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServiceStatistics operation
           */
            public void receiveErrorgetServiceStatistics(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOperationFaultCount method
            * override this method for handling normal response from getOperationFaultCount operation
            */
           public void receiveResultgetOperationFaultCount(
                    int result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOperationFaultCount operation
           */
            public void receiveErrorgetOperationFaultCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAvgServiceResponseTime method
            * override this method for handling normal response from getAvgServiceResponseTime operation
            */
           public void receiveResultgetAvgServiceResponseTime(
                    double result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAvgServiceResponseTime operation
           */
            public void receiveErrorgetAvgServiceResponseTime(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getServiceResponseCount method
            * override this method for handling normal response from getServiceResponseCount operation
            */
           public void receiveResultgetServiceResponseCount(
                    int result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getServiceResponseCount operation
           */
            public void receiveErrorgetServiceResponseCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSystemRequestCount method
            * override this method for handling normal response from getSystemRequestCount operation
            */
           public void receiveResultgetSystemRequestCount(
                    int result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSystemRequestCount operation
           */
            public void receiveErrorgetSystemRequestCount(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getMinOperationResponseTime method
            * override this method for handling normal response from getMinOperationResponseTime operation
            */
           public void receiveResultgetMinOperationResponseTime(
                    long result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getMinOperationResponseTime operation
           */
            public void receiveErrorgetMinOperationResponseTime(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getAvgSystemResponseTime method
            * override this method for handling normal response from getAvgSystemResponseTime operation
            */
           public void receiveResultgetAvgSystemResponseTime(
                    double result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getAvgSystemResponseTime operation
           */
            public void receiveErrorgetAvgSystemResponseTime(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getSystemStatistics method
            * override this method for handling normal response from getSystemStatistics operation
            */
           public void receiveResultgetSystemStatistics(
                    org.wso2.carbon.statistics.ui.types.carbon.SystemStatistics result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getSystemStatistics operation
           */
            public void receiveErrorgetSystemStatistics(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for getOperationRequestCount method
            * override this method for handling normal response from getOperationRequestCount operation
            */
           public void receiveResultgetOperationRequestCount(
                    int result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from getOperationRequestCount operation
           */
            public void receiveErrorgetOperationRequestCount(java.lang.Exception e) {
            }
                


    }
    