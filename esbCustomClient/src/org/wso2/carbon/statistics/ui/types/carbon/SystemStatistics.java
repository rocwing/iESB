
/**
 * SystemStatistics.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package org.wso2.carbon.statistics.ui.types.carbon;
            

            /**
            *  SystemStatistics bean class
            */
        
        public  class SystemStatistics
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = SystemStatistics
                Namespace URI = http://util.services.statistics.carbon.wso2.org/xsd
                Namespace Prefix = ns1
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://util.services.statistics.carbon.wso2.org/xsd")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for AvgResponseTime
                        */

                        
                                    protected double localAvgResponseTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAvgResponseTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return double
                           */
                           public  double getAvgResponseTime(){
                               return localAvgResponseTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AvgResponseTime
                               */
                               public void setAvgResponseTime(double param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (java.lang.Double.isNaN(param)) {
                                           localAvgResponseTimeTracker = false;
                                              
                                       } else {
                                          localAvgResponseTimeTracker = true;
                                       }
                                   
                                            this.localAvgResponseTime=param;
                                    

                               }
                            

                        /**
                        * field for FaultCount
                        */

                        
                                    protected int localFaultCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFaultCountTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getFaultCount(){
                               return localFaultCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param FaultCount
                               */
                               public void setFaultCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localFaultCountTracker = false;
                                              
                                       } else {
                                          localFaultCountTracker = true;
                                       }
                                   
                                            this.localFaultCount=param;
                                    

                               }
                            

                        /**
                        * field for JavaVersion
                        */

                        
                                    protected java.lang.String localJavaVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localJavaVersionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getJavaVersion(){
                               return localJavaVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param JavaVersion
                               */
                               public void setJavaVersion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localJavaVersionTracker = true;
                                       } else {
                                          localJavaVersionTracker = true;
                                              
                                       }
                                   
                                            this.localJavaVersion=param;
                                    

                               }
                            

                        /**
                        * field for MaxResponseTime
                        */

                        
                                    protected long localMaxResponseTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaxResponseTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getMaxResponseTime(){
                               return localMaxResponseTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MaxResponseTime
                               */
                               public void setMaxResponseTime(long param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Long.MIN_VALUE) {
                                           localMaxResponseTimeTracker = false;
                                              
                                       } else {
                                          localMaxResponseTimeTracker = true;
                                       }
                                   
                                            this.localMaxResponseTime=param;
                                    

                               }
                            

                        /**
                        * field for MinResponseTime
                        */

                        
                                    protected long localMinResponseTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMinResponseTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return long
                           */
                           public  long getMinResponseTime(){
                               return localMinResponseTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MinResponseTime
                               */
                               public void setMinResponseTime(long param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Long.MIN_VALUE) {
                                           localMinResponseTimeTracker = false;
                                              
                                       } else {
                                          localMinResponseTimeTracker = true;
                                       }
                                   
                                            this.localMinResponseTime=param;
                                    

                               }
                            

                        /**
                        * field for RequestCount
                        */

                        
                                    protected int localRequestCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRequestCountTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getRequestCount(){
                               return localRequestCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param RequestCount
                               */
                               public void setRequestCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localRequestCountTracker = false;
                                              
                                       } else {
                                          localRequestCountTracker = true;
                                       }
                                   
                                            this.localRequestCount=param;
                                    

                               }
                            

                        /**
                        * field for ResponseCount
                        */

                        
                                    protected int localResponseCount ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localResponseCountTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getResponseCount(){
                               return localResponseCount;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ResponseCount
                               */
                               public void setResponseCount(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localResponseCountTracker = false;
                                              
                                       } else {
                                          localResponseCountTracker = true;
                                       }
                                   
                                            this.localResponseCount=param;
                                    

                               }
                            

                        /**
                        * field for ServerName
                        */

                        
                                    protected java.lang.String localServerName ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerNameTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getServerName(){
                               return localServerName;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerName
                               */
                               public void setServerName(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localServerNameTracker = true;
                                       } else {
                                          localServerNameTracker = true;
                                              
                                       }
                                   
                                            this.localServerName=param;
                                    

                               }
                            

                        /**
                        * field for ServerStartTime
                        */

                        
                                    protected java.lang.String localServerStartTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServerStartTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getServerStartTime(){
                               return localServerStartTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ServerStartTime
                               */
                               public void setServerStartTime(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localServerStartTimeTracker = true;
                                       } else {
                                          localServerStartTimeTracker = true;
                                              
                                       }
                                   
                                            this.localServerStartTime=param;
                                    

                               }
                            

                        /**
                        * field for Services
                        */

                        
                                    protected int localServices ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localServicesTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return int
                           */
                           public  int getServices(){
                               return localServices;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Services
                               */
                               public void setServices(int param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (param==java.lang.Integer.MIN_VALUE) {
                                           localServicesTracker = false;
                                              
                                       } else {
                                          localServicesTracker = true;
                                       }
                                   
                                            this.localServices=param;
                                    

                               }
                            

                        /**
                        * field for SystemUpTime
                        */

                        
                                    protected java.lang.String localSystemUpTime ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSystemUpTimeTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSystemUpTime(){
                               return localSystemUpTime;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param SystemUpTime
                               */
                               public void setSystemUpTime(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSystemUpTimeTracker = true;
                                       } else {
                                          localSystemUpTimeTracker = true;
                                              
                                       }
                                   
                                            this.localSystemUpTime=param;
                                    

                               }
                            

                        /**
                        * field for TotalMemory
                        */

                        
                                    protected org.wso2.carbon.statistics.ui.types.carbon.Metric localTotalMemory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTotalMemoryTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.statistics.ui.types.carbon.Metric
                           */
                           public  org.wso2.carbon.statistics.ui.types.carbon.Metric getTotalMemory(){
                               return localTotalMemory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param TotalMemory
                               */
                               public void setTotalMemory(org.wso2.carbon.statistics.ui.types.carbon.Metric param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTotalMemoryTracker = true;
                                       } else {
                                          localTotalMemoryTracker = true;
                                              
                                       }
                                   
                                            this.localTotalMemory=param;
                                    

                               }
                            

                        /**
                        * field for UsedMemory
                        */

                        
                                    protected org.wso2.carbon.statistics.ui.types.carbon.Metric localUsedMemory ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUsedMemoryTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return org.wso2.carbon.statistics.ui.types.carbon.Metric
                           */
                           public  org.wso2.carbon.statistics.ui.types.carbon.Metric getUsedMemory(){
                               return localUsedMemory;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param UsedMemory
                               */
                               public void setUsedMemory(org.wso2.carbon.statistics.ui.types.carbon.Metric param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUsedMemoryTracker = true;
                                       } else {
                                          localUsedMemoryTracker = true;
                                              
                                       }
                                   
                                            this.localUsedMemory=param;
                                    

                               }
                            

                        /**
                        * field for Wso2WsasVersion
                        */

                        
                                    protected java.lang.String localWso2WsasVersion ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localWso2WsasVersionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getWso2WsasVersion(){
                               return localWso2WsasVersion;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Wso2WsasVersion
                               */
                               public void setWso2WsasVersion(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localWso2WsasVersionTracker = true;
                                       } else {
                                          localWso2WsasVersionTracker = true;
                                              
                                       }
                                   
                                            this.localWso2WsasVersion=param;
                                    

                               }
                            

     /**
     * isReaderMTOMAware
     * @return true if the reader supports MTOM
     */
   public static boolean isReaderMTOMAware(javax.xml.stream.XMLStreamReader reader) {
        boolean isReaderMTOMAware = false;
        
        try{
          isReaderMTOMAware = java.lang.Boolean.TRUE.equals(reader.getProperty(org.apache.axiom.om.OMConstants.IS_DATA_HANDLERS_AWARE));
        }catch(java.lang.IllegalArgumentException e){
          isReaderMTOMAware = false;
        }
        return isReaderMTOMAware;
   }
     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName){

                 public void serialize(org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
                       SystemStatistics.this.serialize(parentQName,factory,xmlWriter);
                 }
               };
               return new org.apache.axiom.om.impl.llom.OMSourcedElementImpl(
               parentQName,factory,dataSource);
            
       }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       final org.apache.axiom.om.OMFactory factory,
                                       org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,factory,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               final org.apache.axiom.om.OMFactory factory,
                               org.apache.axis2.databinding.utils.writer.MTOMAwareXMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();

                    if ((namespace != null) && (namespace.trim().length() > 0)) {
                        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
                        if (writerPrefix != null) {
                            xmlWriter.writeStartElement(namespace, parentQName.getLocalPart());
                        } else {
                            if (prefix == null) {
                                prefix = generatePrefix(namespace);
                            }

                            xmlWriter.writeStartElement(prefix, parentQName.getLocalPart(), namespace);
                            xmlWriter.writeNamespace(prefix, namespace);
                            xmlWriter.setPrefix(prefix, namespace);
                        }
                    } else {
                        xmlWriter.writeStartElement(parentQName.getLocalPart());
                    }
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://util.services.statistics.carbon.wso2.org/xsd");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":SystemStatistics",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "SystemStatistics",
                           xmlWriter);
                   }

               
                   }
                if (localAvgResponseTimeTracker){
                                    namespace = "http://util.services.statistics.carbon.wso2.org/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"avgResponseTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"avgResponseTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("avgResponseTime");
                                    }
                                
                                               if (java.lang.Double.isNaN(localAvgResponseTime)) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("avgResponseTime cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAvgResponseTime));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localFaultCountTracker){
                                    namespace = "http://util.services.statistics.carbon.wso2.org/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"faultCount", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"faultCount");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("faultCount");
                                    }
                                
                                               if (localFaultCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("faultCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFaultCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localJavaVersionTracker){
                                    namespace = "http://util.services.statistics.carbon.wso2.org/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"javaVersion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"javaVersion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("javaVersion");
                                    }
                                

                                          if (localJavaVersion==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localJavaVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMaxResponseTimeTracker){
                                    namespace = "http://util.services.statistics.carbon.wso2.org/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"maxResponseTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"maxResponseTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("maxResponseTime");
                                    }
                                
                                               if (localMaxResponseTime==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("maxResponseTime cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxResponseTime));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localMinResponseTimeTracker){
                                    namespace = "http://util.services.statistics.carbon.wso2.org/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"minResponseTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"minResponseTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("minResponseTime");
                                    }
                                
                                               if (localMinResponseTime==java.lang.Long.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("minResponseTime cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinResponseTime));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localRequestCountTracker){
                                    namespace = "http://util.services.statistics.carbon.wso2.org/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"requestCount", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"requestCount");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("requestCount");
                                    }
                                
                                               if (localRequestCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("requestCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localResponseCountTracker){
                                    namespace = "http://util.services.statistics.carbon.wso2.org/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"responseCount", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"responseCount");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("responseCount");
                                    }
                                
                                               if (localResponseCount==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("responseCount cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponseCount));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerNameTracker){
                                    namespace = "http://util.services.statistics.carbon.wso2.org/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"serverName", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"serverName");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("serverName");
                                    }
                                

                                          if (localServerName==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localServerName);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServerStartTimeTracker){
                                    namespace = "http://util.services.statistics.carbon.wso2.org/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"serverStartTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"serverStartTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("serverStartTime");
                                    }
                                

                                          if (localServerStartTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localServerStartTime);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localServicesTracker){
                                    namespace = "http://util.services.statistics.carbon.wso2.org/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"services", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"services");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("services");
                                    }
                                
                                               if (localServices==java.lang.Integer.MIN_VALUE) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("services cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServices));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSystemUpTimeTracker){
                                    namespace = "http://util.services.statistics.carbon.wso2.org/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"systemUpTime", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"systemUpTime");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("systemUpTime");
                                    }
                                

                                          if (localSystemUpTime==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSystemUpTime);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localTotalMemoryTracker){
                                    if (localTotalMemory==null){

                                            java.lang.String namespace2 = "http://util.services.statistics.carbon.wso2.org/xsd";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"totalMemory", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"totalMemory");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("totalMemory");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localTotalMemory.serialize(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","totalMemory"),
                                        factory,xmlWriter);
                                    }
                                } if (localUsedMemoryTracker){
                                    if (localUsedMemory==null){

                                            java.lang.String namespace2 = "http://util.services.statistics.carbon.wso2.org/xsd";

                                        if (! namespace2.equals("")) {
                                            java.lang.String prefix2 = xmlWriter.getPrefix(namespace2);

                                            if (prefix2 == null) {
                                                prefix2 = generatePrefix(namespace2);

                                                xmlWriter.writeStartElement(prefix2,"usedMemory", namespace2);
                                                xmlWriter.writeNamespace(prefix2, namespace2);
                                                xmlWriter.setPrefix(prefix2, namespace2);

                                            } else {
                                                xmlWriter.writeStartElement(namespace2,"usedMemory");
                                            }

                                        } else {
                                            xmlWriter.writeStartElement("usedMemory");
                                        }


                                       // write the nil attribute
                                      writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                      xmlWriter.writeEndElement();
                                    }else{
                                     localUsedMemory.serialize(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","usedMemory"),
                                        factory,xmlWriter);
                                    }
                                } if (localWso2WsasVersionTracker){
                                    namespace = "http://util.services.statistics.carbon.wso2.org/xsd";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"wso2wsasVersion", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"wso2wsasVersion");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("wso2wsasVersion");
                                    }
                                

                                          if (localWso2WsasVersion==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localWso2WsasVersion);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             }
                    xmlWriter.writeEndElement();
               

        }

         /**
          * Util method to write an attribute with the ns prefix
          */
          private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
              if (xmlWriter.getPrefix(namespace) == null) {
                       xmlWriter.writeNamespace(prefix, namespace);
                       xmlWriter.setPrefix(prefix, namespace);

              }

              xmlWriter.writeAttribute(namespace,attName,attValue);

         }

        /**
          * Util method to write an attribute without the ns prefix
          */
          private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                      java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
                if (namespace.equals(""))
              {
                  xmlWriter.writeAttribute(attName,attValue);
              }
              else
              {
                  registerPrefix(xmlWriter, namespace);
                  xmlWriter.writeAttribute(namespace,attName,attValue);
              }
          }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


         /**
         * Register a namespace prefix
         */
         private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
                java.lang.String prefix = xmlWriter.getPrefix(namespace);

                if (prefix == null) {
                    prefix = generatePrefix(namespace);

                    while (xmlWriter.getNamespaceContext().getNamespaceURI(prefix) != null) {
                        prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                    }

                    xmlWriter.writeNamespace(prefix, namespace);
                    xmlWriter.setPrefix(prefix, namespace);
                }

                return prefix;
            }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localAvgResponseTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "avgResponseTime"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAvgResponseTime));
                            } if (localFaultCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "faultCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localFaultCount));
                            } if (localJavaVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "javaVersion"));
                                 
                                         elementList.add(localJavaVersion==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localJavaVersion));
                                    } if (localMaxResponseTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "maxResponseTime"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMaxResponseTime));
                            } if (localMinResponseTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "minResponseTime"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMinResponseTime));
                            } if (localRequestCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "requestCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRequestCount));
                            } if (localResponseCountTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "responseCount"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localResponseCount));
                            } if (localServerNameTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "serverName"));
                                 
                                         elementList.add(localServerName==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerName));
                                    } if (localServerStartTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "serverStartTime"));
                                 
                                         elementList.add(localServerStartTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServerStartTime));
                                    } if (localServicesTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "services"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localServices));
                            } if (localSystemUpTimeTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "systemUpTime"));
                                 
                                         elementList.add(localSystemUpTime==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSystemUpTime));
                                    } if (localTotalMemoryTracker){
                            elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "totalMemory"));
                            
                            
                                    elementList.add(localTotalMemory==null?null:
                                    localTotalMemory);
                                } if (localUsedMemoryTracker){
                            elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "usedMemory"));
                            
                            
                                    elementList.add(localUsedMemory==null?null:
                                    localUsedMemory);
                                } if (localWso2WsasVersionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd",
                                                                      "wso2wsasVersion"));
                                 
                                         elementList.add(localWso2WsasVersion==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localWso2WsasVersion));
                                    }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static SystemStatistics parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            SystemStatistics object =
                new SystemStatistics();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"SystemStatistics".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (SystemStatistics)org.wso2.carbon.statistics.ui.types.axis2.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","avgResponseTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAvgResponseTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDouble(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setAvgResponseTime(java.lang.Double.NaN);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","faultCount").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setFaultCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setFaultCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","javaVersion").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setJavaVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","maxResponseTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMaxResponseTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMaxResponseTime(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","minResponseTime").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMinResponseTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToLong(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setMinResponseTime(java.lang.Long.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","requestCount").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRequestCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setRequestCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","responseCount").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setResponseCount(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setResponseCount(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","serverName").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerName(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","serverStartTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServerStartTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","services").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setServices(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToInt(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                               object.setServices(java.lang.Integer.MIN_VALUE);
                                           
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","systemUpTime").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSystemUpTime(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","totalMemory").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setTotalMemory(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setTotalMemory(org.wso2.carbon.statistics.ui.types.carbon.Metric.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","usedMemory").equals(reader.getName())){
                                
                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                          object.setUsedMemory(null);
                                          reader.next();
                                            
                                            reader.next();
                                          
                                      }else{
                                    
                                                object.setUsedMemory(org.wso2.carbon.statistics.ui.types.carbon.Metric.Factory.parse(reader));
                                              
                                        reader.next();
                                    }
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://util.services.statistics.carbon.wso2.org/xsd","wso2wsasVersion").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setWso2WsasVersion(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
          