

/**
 * ServiceMessageReceiverRobustInOnly.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
        package com.dongfang.server;

        /**
        *  ServiceMessageReceiverRobustInOnly message receiver
        */

        public class ServiceMessageReceiverRobustInOnly extends org.apache.axis2.receivers.AbstractMessageReceiver{


        public void invokeBusinessLogic(org.apache.axis2.context.MessageContext msgContext)
        throws org.apache.axis2.AxisFault{

        try {

        // get the implementation class for the Web Service
        Object obj = getTheImplementationObject(msgContext);

        ServiceSkeleton skel = (ServiceSkeleton)obj;
        //Out Envelop
        org.apache.axiom.soap.SOAPEnvelope envelope = null;
        //Find the axisOperation that has been set by the Dispatch phase.
        org.apache.axis2.description.AxisOperation op = msgContext.getOperationContext().getAxisOperation();
        if (op == null) {
        throw new org.apache.axis2.AxisFault("Operation is not located, if this is doclit style the SOAP-ACTION should specified via the SOAP Action to use the RawXMLProvider");
        }

        java.lang.String methodName;
        if((op.getName() != null) && ((methodName = org.apache.axis2.util.JavaUtils.xmlNameToJavaIdentifier(op.getName().getLocalPart())) != null)){

        
            if("publishEvent".equals(methodName)){
            
            
                            //doc style
                            ch.iec.www.tc57._2008.schema.message.EventMessage wrappedParam =
                                                         (ch.iec.www.tc57._2008.schema.message.EventMessage)fromOM(
                                                        msgContext.getEnvelope().getBody().getFirstElement(),
                                                        ch.iec.www.tc57._2008.schema.message.EventMessage.class,
                                                        getEnvelopeNamespaces(msgContext.getEnvelope()));
                                            
                                           
                                                     skel.publishEvent(wrappedParam) ;
                                                

                             envelope = getSOAPFactory(msgContext).getDefaultEnvelope();
                        
                } else {
                  throw new java.lang.RuntimeException("method not found");
                }
            

        }
        } catch (FaultMessage e) {
            msgContext.setProperty(org.apache.axis2.Constants.FAULT_NAME,"FaultMessage");
            org.apache.axis2.AxisFault f = createAxisFault(e);
            if (e.getFaultMessage() != null){
                f.setDetail(toOM(e.getFaultMessage(),false));
            }
            throw f;
            }
        
        catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
        }
        
        //
            private  org.apache.axiom.om.OMElement  toOM(ch.iec.www.tc57._2008.schema.message.Message param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.iec.www.tc57._2008.schema.message.Message.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.iec.www.tc57._2008.schema.message.ResponseMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.iec.www.tc57._2008.schema.message.ResponseMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.iec.www.tc57._2008.schema.message.FaultMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.iec.www.tc57._2008.schema.message.FaultMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
            private  org.apache.axiom.om.OMElement  toOM(ch.iec.www.tc57._2008.schema.message.EventMessage param, boolean optimizeContent)
            throws org.apache.axis2.AxisFault {

            
                        try{
                             return param.getOMElement(ch.iec.www.tc57._2008.schema.message.EventMessage.MY_QNAME,
                                          org.apache.axiom.om.OMAbstractFactory.getOMFactory());
                        } catch(org.apache.axis2.databinding.ADBException e){
                            throw org.apache.axis2.AxisFault.makeFault(e);
                        }
                    

            }
        
                    private  org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory, ch.iec.www.tc57._2008.schema.message.ResponseMessage param, boolean optimizeContent)
                        throws org.apache.axis2.AxisFault{
                      try{
                          org.apache.axiom.soap.SOAPEnvelope emptyEnvelope = factory.getDefaultEnvelope();
                           
                                    emptyEnvelope.getBody().addChild(param.getOMElement(ch.iec.www.tc57._2008.schema.message.ResponseMessage.MY_QNAME,factory));
                                

                         return emptyEnvelope;
                    } catch(org.apache.axis2.databinding.ADBException e){
                        throw org.apache.axis2.AxisFault.makeFault(e);
                    }
                    }
                    
                         private ch.iec.www.tc57._2008.schema.message.ResponseMessage wrapRequest(){
                                ch.iec.www.tc57._2008.schema.message.ResponseMessage wrappedElement = new ch.iec.www.tc57._2008.schema.message.ResponseMessage();
                                return wrappedElement;
                         }
                    


        /**
        *  get the default envelope
        */
        private org.apache.axiom.soap.SOAPEnvelope toEnvelope(org.apache.axiom.soap.SOAPFactory factory){
        return factory.getDefaultEnvelope();
        }


        private  java.lang.Object fromOM(
        org.apache.axiom.om.OMElement param,
        java.lang.Class type,
        java.util.Map extraNamespaces) throws org.apache.axis2.AxisFault{

        try {
        
                if (ch.iec.www.tc57._2008.schema.message.Message.class.equals(type)){
                
                           return ch.iec.www.tc57._2008.schema.message.Message.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.iec.www.tc57._2008.schema.message.ResponseMessage.class.equals(type)){
                
                           return ch.iec.www.tc57._2008.schema.message.ResponseMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.iec.www.tc57._2008.schema.message.FaultMessage.class.equals(type)){
                
                           return ch.iec.www.tc57._2008.schema.message.FaultMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.iec.www.tc57._2008.schema.message.EventMessage.class.equals(type)){
                
                           return ch.iec.www.tc57._2008.schema.message.EventMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
                if (ch.iec.www.tc57._2008.schema.message.FaultMessage.class.equals(type)){
                
                           return ch.iec.www.tc57._2008.schema.message.FaultMessage.Factory.parse(param.getXMLStreamReaderWithoutCaching());
                    

                }
           
        } catch (java.lang.Exception e) {
        throw org.apache.axis2.AxisFault.makeFault(e);
        }
           return null;
        }



    

        /**
        *  A utility method that copies the namepaces from the SOAPEnvelope
        */
        private java.util.Map getEnvelopeNamespaces(org.apache.axiom.soap.SOAPEnvelope env){
        java.util.Map returnMap = new java.util.HashMap();
        java.util.Iterator namespaceIterator = env.getAllDeclaredNamespaces();
        while (namespaceIterator.hasNext()) {
        org.apache.axiom.om.OMNamespace ns = (org.apache.axiom.om.OMNamespace) namespaceIterator.next();
        returnMap.put(ns.getPrefix(),ns.getNamespaceURI());
        }
        return returnMap;
        }

        private org.apache.axis2.AxisFault createAxisFault(java.lang.Exception e) {
        org.apache.axis2.AxisFault f;
        Throwable cause = e.getCause();
        if (cause != null) {
            f = new org.apache.axis2.AxisFault(e.getMessage(), cause);
        } else {
            f = new org.apache.axis2.AxisFault(e.getMessage());
        }

        return f;
    }

        }//end of class
    