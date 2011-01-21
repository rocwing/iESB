
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */

            package org.wso2.carbon.statistics.ui.types.axis2;
            /**
            *  ExtensionMapper class
            */
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://util.services.statistics.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "SystemStatistics".equals(typeName)){
                   
                            return  org.wso2.carbon.statistics.ui.types.carbon.SystemStatistics.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.services.statistics.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "ServiceStatistics".equals(typeName)){
                   
                            return  org.wso2.carbon.statistics.ui.types.carbon.ServiceStatistics.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.services.statistics.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "Metric".equals(typeName)){
                   
                            return  org.wso2.carbon.statistics.ui.types.carbon.Metric.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://util.services.statistics.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "OperationStatistics".equals(typeName)){
                   
                            return  org.wso2.carbon.statistics.ui.types.carbon.OperationStatistics.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    