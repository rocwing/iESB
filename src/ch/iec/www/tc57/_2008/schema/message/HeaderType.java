
/**
 * HeaderType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:34 EDT)
 */
            
                package ch.iec.www.tc57._2008.schema.message;
            

            /**
            *  HeaderType bean class
            */
        
        public  class HeaderType
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = HeaderType
                Namespace URI = http://www.iec.ch/TC57/2008/schema/message
                Namespace Prefix = ns1
                */
            

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://www.iec.ch/TC57/2008/schema/message")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        

                        /**
                        * field for Verb
                        */

                        
                                    protected java.lang.String localVerb ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getVerb(){
                               return localVerb;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Verb
                               */
                               public void setVerb(java.lang.String param){
                            
                                            this.localVerb=param;
                                    

                               }
                            

                        /**
                        * field for Noun
                        */

                        
                                    protected java.lang.String localNoun ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getNoun(){
                               return localNoun;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Noun
                               */
                               public void setNoun(java.lang.String param){
                            
                                            this.localNoun=param;
                                    

                               }
                            

                        /**
                        * field for Revision
                        */

                        
                                    protected java.lang.String localRevision ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localRevisionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getRevision(){
                               return localRevision;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Revision
                               */
                               public void setRevision(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localRevisionTracker = true;
                                       } else {
                                          localRevisionTracker = false;
                                              
                                       }
                                   
                                            this.localRevision=param;
                                    

                               }
                            

                        /**
                        * field for ReplayDetection
                        */

                        
                                    protected ch.iec.www.tc57._2008.schema.message.ReplayDetectionType localReplayDetection ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReplayDetectionTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return ch.iec.www.tc57._2008.schema.message.ReplayDetectionType
                           */
                           public  ch.iec.www.tc57._2008.schema.message.ReplayDetectionType getReplayDetection(){
                               return localReplayDetection;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReplayDetection
                               */
                               public void setReplayDetection(ch.iec.www.tc57._2008.schema.message.ReplayDetectionType param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReplayDetectionTracker = true;
                                       } else {
                                          localReplayDetectionTracker = false;
                                              
                                       }
                                   
                                            this.localReplayDetection=param;
                                    

                               }
                            

                        /**
                        * field for Context
                        */

                        
                                    protected ch.iec.www.tc57._2008.schema.message.Context_type1 localContext ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localContextTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return ch.iec.www.tc57._2008.schema.message.Context_type1
                           */
                           public  ch.iec.www.tc57._2008.schema.message.Context_type1 getContext(){
                               return localContext;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Context
                               */
                               public void setContext(ch.iec.www.tc57._2008.schema.message.Context_type1 param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localContextTracker = true;
                                       } else {
                                          localContextTracker = false;
                                              
                                       }
                                   
                                            this.localContext=param;
                                    

                               }
                            

                        /**
                        * field for Timestamp
                        */

                        
                                    protected java.util.Calendar localTimestamp ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimestampTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.util.Calendar
                           */
                           public  java.util.Calendar getTimestamp(){
                               return localTimestamp;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Timestamp
                               */
                               public void setTimestamp(java.util.Calendar param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localTimestampTracker = true;
                                       } else {
                                          localTimestampTracker = false;
                                              
                                       }
                                   
                                            this.localTimestamp=param;
                                    

                               }
                            

                        /**
                        * field for Source
                        */

                        
                                    protected java.lang.String localSource ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSourceTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getSource(){
                               return localSource;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Source
                               */
                               public void setSource(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localSourceTracker = true;
                                       } else {
                                          localSourceTracker = false;
                                              
                                       }
                                   
                                            this.localSource=param;
                                    

                               }
                            

                        /**
                        * field for AsyncReplyFlag
                        */

                        
                                    protected boolean localAsyncReplyFlag ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAsyncReplyFlagTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAsyncReplyFlag(){
                               return localAsyncReplyFlag;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AsyncReplyFlag
                               */
                               public void setAsyncReplyFlag(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localAsyncReplyFlagTracker = false;
                                              
                                       } else {
                                          localAsyncReplyFlagTracker = true;
                                       }
                                   
                                            this.localAsyncReplyFlag=param;
                                    

                               }
                            

                        /**
                        * field for ReplyAddress
                        */

                        
                                    protected java.lang.String localReplyAddress ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localReplyAddressTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReplyAddress(){
                               return localReplyAddress;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReplyAddress
                               */
                               public void setReplyAddress(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localReplyAddressTracker = true;
                                       } else {
                                          localReplyAddressTracker = false;
                                              
                                       }
                                   
                                            this.localReplyAddress=param;
                                    

                               }
                            

                        /**
                        * field for AckRequired
                        */

                        
                                    protected boolean localAckRequired ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAckRequiredTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return boolean
                           */
                           public  boolean getAckRequired(){
                               return localAckRequired;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param AckRequired
                               */
                               public void setAckRequired(boolean param){
                            
                                       // setting primitive attribute tracker to true
                                       
                                               if (false) {
                                           localAckRequiredTracker = false;
                                              
                                       } else {
                                          localAckRequiredTracker = true;
                                       }
                                   
                                            this.localAckRequired=param;
                                    

                               }
                            

                        /**
                        * field for User
                        */

                        
                                    protected ch.iec.www.tc57._2008.schema.message.UserType localUser ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localUserTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return ch.iec.www.tc57._2008.schema.message.UserType
                           */
                           public  ch.iec.www.tc57._2008.schema.message.UserType getUser(){
                               return localUser;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param User
                               */
                               public void setUser(ch.iec.www.tc57._2008.schema.message.UserType param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localUserTracker = true;
                                       } else {
                                          localUserTracker = false;
                                              
                                       }
                                   
                                            this.localUser=param;
                                    

                               }
                            

                        /**
                        * field for MessageID
                        */

                        
                                    protected java.lang.String localMessageID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMessageIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getMessageID(){
                               return localMessageID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MessageID
                               */
                               public void setMessageID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localMessageIDTracker = true;
                                       } else {
                                          localMessageIDTracker = false;
                                              
                                       }
                                   
                                            this.localMessageID=param;
                                    

                               }
                            

                        /**
                        * field for CorrelationID
                        */

                        
                                    protected java.lang.String localCorrelationID ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCorrelationIDTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getCorrelationID(){
                               return localCorrelationID;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param CorrelationID
                               */
                               public void setCorrelationID(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCorrelationIDTracker = true;
                                       } else {
                                          localCorrelationIDTracker = false;
                                              
                                       }
                                   
                                            this.localCorrelationID=param;
                                    

                               }
                            

                        /**
                        * field for Comment
                        */

                        
                                    protected java.lang.String localComment ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCommentTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getComment(){
                               return localComment;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param Comment
                               */
                               public void setComment(java.lang.String param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localCommentTracker = true;
                                       } else {
                                          localCommentTracker = false;
                                              
                                       }
                                   
                                            this.localComment=param;
                                    

                               }
                            

                        /**
                        * field for Property
                        * This was an Array!
                        */

                        
                                    protected ch.iec.www.tc57._2008.schema.message.MessageProperty[] localProperty ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localPropertyTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return ch.iec.www.tc57._2008.schema.message.MessageProperty[]
                           */
                           public  ch.iec.www.tc57._2008.schema.message.MessageProperty[] getProperty(){
                               return localProperty;
                           }

                           
                        


                               
                              /**
                               * validate the array for Property
                               */
                              protected void validateProperty(ch.iec.www.tc57._2008.schema.message.MessageProperty[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param Property
                              */
                              public void setProperty(ch.iec.www.tc57._2008.schema.message.MessageProperty[] param){
                              
                                   validateProperty(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localPropertyTracker = true;
                                          } else {
                                             localPropertyTracker = false;
                                                 
                                          }
                                      
                                      this.localProperty=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param ch.iec.www.tc57._2008.schema.message.MessageProperty
                             */
                             public void addProperty(ch.iec.www.tc57._2008.schema.message.MessageProperty param){
                                   if (localProperty == null){
                                   localProperty = new ch.iec.www.tc57._2008.schema.message.MessageProperty[]{};
                                   }

                            
                                 //update the setting tracker
                                localPropertyTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localProperty);
                               list.add(param);
                               this.localProperty =
                             (ch.iec.www.tc57._2008.schema.message.MessageProperty[])list.toArray(
                            new ch.iec.www.tc57._2008.schema.message.MessageProperty[list.size()]);

                             }
                             

                        /**
                        * field for ExtraElement
                        * This was an Array!
                        */

                        
                                    protected org.apache.axiom.om.OMElement[] localExtraElement ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localExtraElementTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return org.apache.axiom.om.OMElement[]
                           */
                           public  org.apache.axiom.om.OMElement[] getExtraElement(){
                               return localExtraElement;
                           }

                           
                        


                               
                              /**
                               * validate the array for ExtraElement
                               */
                              protected void validateExtraElement(org.apache.axiom.om.OMElement[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ExtraElement
                              */
                              public void setExtraElement(org.apache.axiom.om.OMElement[] param){
                              
                                   validateExtraElement(param);

                               
                                          if (param != null){
                                             //update the setting tracker
                                             localExtraElementTracker = true;
                                          } else {
                                             localExtraElementTracker = false;
                                                 
                                          }
                                      
                                      this.localExtraElement=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param org.apache.axiom.om.OMElement
                             */
                             public void addExtraElement(org.apache.axiom.om.OMElement param){
                                   if (localExtraElement == null){
                                   localExtraElement = new org.apache.axiom.om.OMElement[]{};
                                   }

                            
                                 //update the setting tracker
                                localExtraElementTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localExtraElement);
                               list.add(param);
                               this.localExtraElement =
                             (org.apache.axiom.om.OMElement[])list.toArray(
                            new org.apache.axiom.om.OMElement[list.size()]);

                             }
                             

                        /**
                        * field for MessageGroup
                        */

                        
                                    protected ch.iec.www.tc57._2008.schema.message.MessageGroup_type0 localMessageGroup ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMessageGroupTracker = false ;
                           

                           /**
                           * Auto generated getter method
                           * @return ch.iec.www.tc57._2008.schema.message.MessageGroup_type0
                           */
                           public  ch.iec.www.tc57._2008.schema.message.MessageGroup_type0 getMessageGroup(){
                               return localMessageGroup;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param MessageGroup
                               */
                               public void setMessageGroup(ch.iec.www.tc57._2008.schema.message.MessageGroup_type0 param){
                            
                                       if (param != null){
                                          //update the setting tracker
                                          localMessageGroupTracker = true;
                                       } else {
                                          localMessageGroupTracker = false;
                                              
                                       }
                                   
                                            this.localMessageGroup=param;
                                    

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
                       HeaderType.this.serialize(parentQName,factory,xmlWriter);
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
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://www.iec.ch/TC57/2008/schema/message");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":HeaderType",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "HeaderType",
                           xmlWriter);
                   }

               
                   }
               
                                    namespace = "http://www.iec.ch/TC57/2008/schema/message";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Verb", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Verb");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Verb");
                                    }
                                

                                          if (localVerb==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Verb cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localVerb);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             
                                    namespace = "http://www.iec.ch/TC57/2008/schema/message";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Noun", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Noun");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Noun");
                                    }
                                

                                          if (localNoun==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Noun cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localNoun);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localRevisionTracker){
                                    namespace = "http://www.iec.ch/TC57/2008/schema/message";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Revision", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Revision");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Revision");
                                    }
                                

                                          if (localRevision==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Revision cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localRevision);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReplayDetectionTracker){
                                            if (localReplayDetection==null){
                                                 throw new org.apache.axis2.databinding.ADBException("ReplayDetection cannot be null!!");
                                            }
                                           localReplayDetection.serialize(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","ReplayDetection"),
                                               factory,xmlWriter);
                                        } if (localContextTracker){
                                            if (localContext==null){
                                                 throw new org.apache.axis2.databinding.ADBException("Context cannot be null!!");
                                            }
                                           localContext.serialize(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","Context"),
                                               factory,xmlWriter);
                                        } if (localTimestampTracker){
                                    namespace = "http://www.iec.ch/TC57/2008/schema/message";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Timestamp", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Timestamp");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Timestamp");
                                    }
                                

                                          if (localTimestamp==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Timestamp cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimestamp));
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localSourceTracker){
                                    namespace = "http://www.iec.ch/TC57/2008/schema/message";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Source", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Source");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Source");
                                    }
                                

                                          if (localSource==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localSource);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAsyncReplyFlagTracker){
                                    namespace = "http://www.iec.ch/TC57/2008/schema/message";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AsyncReplyFlag", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AsyncReplyFlag");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AsyncReplyFlag");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AsyncReplyFlag cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAsyncReplyFlag));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localReplyAddressTracker){
                                    namespace = "http://www.iec.ch/TC57/2008/schema/message";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"ReplyAddress", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"ReplyAddress");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("ReplyAddress");
                                    }
                                

                                          if (localReplyAddress==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("ReplyAddress cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReplyAddress);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localAckRequiredTracker){
                                    namespace = "http://www.iec.ch/TC57/2008/schema/message";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"AckRequired", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"AckRequired");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("AckRequired");
                                    }
                                
                                               if (false) {
                                           
                                                         throw new org.apache.axis2.databinding.ADBException("AckRequired cannot be null!!");
                                                      
                                               } else {
                                                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAckRequired));
                                               }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localUserTracker){
                                            if (localUser==null){
                                                 throw new org.apache.axis2.databinding.ADBException("User cannot be null!!");
                                            }
                                           localUser.serialize(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","User"),
                                               factory,xmlWriter);
                                        } if (localMessageIDTracker){
                                    namespace = "http://www.iec.ch/TC57/2008/schema/message";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"MessageID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"MessageID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("MessageID");
                                    }
                                

                                          if (localMessageID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("MessageID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localMessageID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCorrelationIDTracker){
                                    namespace = "http://www.iec.ch/TC57/2008/schema/message";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"CorrelationID", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"CorrelationID");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("CorrelationID");
                                    }
                                

                                          if (localCorrelationID==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("CorrelationID cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localCorrelationID);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localCommentTracker){
                                    namespace = "http://www.iec.ch/TC57/2008/schema/message";
                                    if (! namespace.equals("")) {
                                        prefix = xmlWriter.getPrefix(namespace);

                                        if (prefix == null) {
                                            prefix = generatePrefix(namespace);

                                            xmlWriter.writeStartElement(prefix,"Comment", namespace);
                                            xmlWriter.writeNamespace(prefix, namespace);
                                            xmlWriter.setPrefix(prefix, namespace);

                                        } else {
                                            xmlWriter.writeStartElement(namespace,"Comment");
                                        }

                                    } else {
                                        xmlWriter.writeStartElement("Comment");
                                    }
                                

                                          if (localComment==null){
                                              // write the nil attribute
                                              
                                                     throw new org.apache.axis2.databinding.ADBException("Comment cannot be null!!");
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localComment);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                             } if (localPropertyTracker){
                                       if (localProperty!=null){
                                            for (int i = 0;i < localProperty.length;i++){
                                                if (localProperty[i] != null){
                                                 localProperty[i].serialize(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","Property"),
                                                           factory,xmlWriter);
                                                } else {
                                                   
                                                        // we don't have to do any thing since minOccures is zero
                                                    
                                                }

                                            }
                                     } else {
                                        
                                               throw new org.apache.axis2.databinding.ADBException("Property cannot be null!!");
                                        
                                    }
                                 } if (localExtraElementTracker){
                            
                            if (localExtraElement != null){
                                for (int i = 0;i < localExtraElement.length;i++){
                                    if (localExtraElement[i] != null){
                                        localExtraElement[i].serialize(xmlWriter);
                                    } else {
                                        
                                                // we have to do nothing since minOccures zero
                                            
                                    }
                                }
                            } else {
                                throw new org.apache.axis2.databinding.ADBException("extraElement cannot be null!!");
                            }
                        } if (localMessageGroupTracker){
                                            if (localMessageGroup==null){
                                                 throw new org.apache.axis2.databinding.ADBException("MessageGroup cannot be null!!");
                                            }
                                           localMessageGroup.serialize(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","MessageGroup"),
                                               factory,xmlWriter);
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

                
                                      elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "Verb"));
                                 
                                        if (localVerb != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localVerb));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Verb cannot be null!!");
                                        }
                                    
                                      elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "Noun"));
                                 
                                        if (localNoun != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localNoun));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Noun cannot be null!!");
                                        }
                                     if (localRevisionTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "Revision"));
                                 
                                        if (localRevision != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localRevision));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Revision cannot be null!!");
                                        }
                                    } if (localReplayDetectionTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "ReplayDetection"));
                            
                            
                                    if (localReplayDetection==null){
                                         throw new org.apache.axis2.databinding.ADBException("ReplayDetection cannot be null!!");
                                    }
                                    elementList.add(localReplayDetection);
                                } if (localContextTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "Context"));
                            
                            
                                    if (localContext==null){
                                         throw new org.apache.axis2.databinding.ADBException("Context cannot be null!!");
                                    }
                                    elementList.add(localContext);
                                } if (localTimestampTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "Timestamp"));
                                 
                                        if (localTimestamp != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localTimestamp));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Timestamp cannot be null!!");
                                        }
                                    } if (localSourceTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "Source"));
                                 
                                        if (localSource != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localSource));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Source cannot be null!!");
                                        }
                                    } if (localAsyncReplyFlagTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "AsyncReplyFlag"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAsyncReplyFlag));
                            } if (localReplyAddressTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "ReplyAddress"));
                                 
                                        if (localReplyAddress != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReplyAddress));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("ReplyAddress cannot be null!!");
                                        }
                                    } if (localAckRequiredTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "AckRequired"));
                                 
                                elementList.add(
                                   org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localAckRequired));
                            } if (localUserTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "User"));
                            
                            
                                    if (localUser==null){
                                         throw new org.apache.axis2.databinding.ADBException("User cannot be null!!");
                                    }
                                    elementList.add(localUser);
                                } if (localMessageIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "MessageID"));
                                 
                                        if (localMessageID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localMessageID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("MessageID cannot be null!!");
                                        }
                                    } if (localCorrelationIDTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "CorrelationID"));
                                 
                                        if (localCorrelationID != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localCorrelationID));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("CorrelationID cannot be null!!");
                                        }
                                    } if (localCommentTracker){
                                      elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "Comment"));
                                 
                                        if (localComment != null){
                                            elementList.add(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localComment));
                                        } else {
                                           throw new org.apache.axis2.databinding.ADBException("Comment cannot be null!!");
                                        }
                                    } if (localPropertyTracker){
                             if (localProperty!=null) {
                                 for (int i = 0;i < localProperty.length;i++){

                                    if (localProperty[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                          "Property"));
                                         elementList.add(localProperty[i]);
                                    } else {
                                        
                                                // nothing to do
                                            
                                    }

                                 }
                             } else {
                                 
                                        throw new org.apache.axis2.databinding.ADBException("Property cannot be null!!");
                                    
                             }

                        } if (localExtraElementTracker){
                            if (localExtraElement != null) {
                                for (int i = 0;i < localExtraElement.length;i++){
                                    if (localExtraElement[i] != null){
                                       elementList.add(new javax.xml.namespace.QName("",
                                                                          "extraElement"));
                                      elementList.add(
                                      org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localExtraElement[i]));
                                    } else {
                                        
                                                // have to do nothing
                                            
                                    }

                                }
                            } else {
                               throw new org.apache.axis2.databinding.ADBException("extraElement cannot be null!!");
                            }
                        } if (localMessageGroupTracker){
                            elementList.add(new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message",
                                                                      "MessageGroup"));
                            
                            
                                    if (localMessageGroup==null){
                                         throw new org.apache.axis2.databinding.ADBException("MessageGroup cannot be null!!");
                                    }
                                    elementList.add(localMessageGroup);
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
        public static HeaderType parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            HeaderType object =
                new HeaderType();

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
                    
                            if (!"HeaderType".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (HeaderType)ch.iec.www.tc57._2008.schema.message.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                 
                    
                    reader.next();
                
                        java.util.ArrayList list15 = new java.util.ArrayList();
                    
                        java.util.ArrayList list16 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","Verb").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setVerb(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","Noun").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setNoun(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getLocalName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","Revision").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setRevision(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","ReplayDetection").equals(reader.getName())){
                                
                                                object.setReplayDetection(ch.iec.www.tc57._2008.schema.message.ReplayDetectionType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","Context").equals(reader.getName())){
                                
                                                object.setContext(ch.iec.www.tc57._2008.schema.message.Context_type1.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","Timestamp").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setTimestamp(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToDateTime(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","Source").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setSource(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","AsyncReplyFlag").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAsyncReplyFlag(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","ReplyAddress").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReplyAddress(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","AckRequired").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setAckRequired(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToBoolean(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","User").equals(reader.getName())){
                                
                                                object.setUser(ch.iec.www.tc57._2008.schema.message.UserType.Factory.parse(reader));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","MessageID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setMessageID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","CorrelationID").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setCorrelationID(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","Comment").equals(reader.getName())){
                                
                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setComment(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                              
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","Property").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    list15.add(ch.iec.www.tc57._2008.schema.message.MessageProperty.Factory.parse(reader));
                                                                
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone15 = false;
                                                        while(!loopDone15){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone15 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","Property").equals(reader.getName())){
                                                                    list15.add(ch.iec.www.tc57._2008.schema.message.MessageProperty.Factory.parse(reader));
                                                                        
                                                                }else{
                                                                    loopDone15 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setProperty((ch.iec.www.tc57._2008.schema.message.MessageProperty[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                ch.iec.www.tc57._2008.schema.message.MessageProperty.class,
                                                                list15));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                   if (reader.isStartElement()){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                           boolean loopDone16=false;

                                             while (!loopDone16){
                                                 event = reader.getEventType();
                                                 if (javax.xml.stream.XMLStreamConstants.START_ELEMENT == event){

                                                      // We need to wrap the reader so that it produces a fake START_DOCUEMENT event
                                                      org.apache.axis2.databinding.utils.NamedStaxOMBuilder builder16
                                                         = new org.apache.axis2.databinding.utils.NamedStaxOMBuilder(
                                                              new org.apache.axis2.util.StreamWrapper(reader), reader.getName());

                                                       list16.add(builder16.getOMElement());
                                                        reader.next();
                                                        if (reader.isEndElement()) {
                                                            // we have two countinuos end elements
                                                           loopDone16 = true;
                                                        }

                                                 }else if (javax.xml.stream.XMLStreamConstants.END_ELEMENT == event){
                                                     loopDone16 = true;
                                                 }else{
                                                     reader.next();
                                                 }

                                             }

                                            
                                             object.setExtraElement((org.apache.axiom.om.OMElement[])
                                                 org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                     org.apache.axiom.om.OMElement.class,list16));
                                                
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://www.iec.ch/TC57/2008/schema/message","MessageGroup").equals(reader.getName())){
                                
                                                object.setMessageGroup(ch.iec.www.tc57._2008.schema.message.MessageGroup_type0.Factory.parse(reader));
                                              
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
           
          