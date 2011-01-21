
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */

            package org.wso2.carbon.authenticator.proxy;
            /**
            *  ExtensionMapper class
            */
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://authentication.services.core.carbon.wso2.org".equals(namespaceURI) &&
                  "Exception".equals(typeName)){
                   
                            return  org.wso2.carbon.authenticator.proxy.Exception.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://common.core.carbon.wso2.org/xsd".equals(namespaceURI) &&
                  "AuthenticationException".equals(typeName)){
                   
                            return  org.wso2.carbon.ui.authentication.AuthenticationException.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    