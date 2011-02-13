
/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */

            package ch.iec.www.tc57._2008.schema.message;
            /**
            *  ExtensionMapper class
            */
        
        public  class ExtensionMapper{

          public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
                                                       java.lang.String typeName,
                                                       javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "Context_type1".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.Context_type1.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "Context_type1".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.Context_type1.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "RequestMessageType".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.RequestMessageType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "UserType".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.UserType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "FaultMessageType".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.FaultMessageType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "HeaderType".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.HeaderType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "ReplayDetectionType".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.ReplayDetectionType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "EventMessageType".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.EventMessageType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "RequestType".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.RequestType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "MessageProperty".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.MessageProperty.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "MessageGroup_type0".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.MessageGroup_type0.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "PayloadType".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.PayloadType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "MessageType".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.MessageType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "ResponseMessageType".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.ResponseMessageType.Factory.parse(reader);
                        

                  }

              
                  if (
                  "http://www.iec.ch/TC57/2008/schema/message".equals(namespaceURI) &&
                  "ReplyType".equals(typeName)){
                   
                            return  ch.iec.www.tc57._2008.schema.message.ReplyType.Factory.parse(reader);
                        

                  }

              
             throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
          }

        }
    