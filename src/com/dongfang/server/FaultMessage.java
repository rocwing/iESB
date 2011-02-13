
/**
 * FaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */

package com.dongfang.server;

public class FaultMessage extends java.lang.Exception{
    
    private ch.iec.www.tc57._2008.schema.message.FaultMessage faultMessage;

    
        public FaultMessage() {
            super("FaultMessage");
        }

        public FaultMessage(java.lang.String s) {
           super(s);
        }

        public FaultMessage(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public FaultMessage(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(ch.iec.www.tc57._2008.schema.message.FaultMessage msg){
       faultMessage = msg;
    }
    
    public ch.iec.www.tc57._2008.schema.message.FaultMessage getFaultMessage(){
       return faultMessage;
    }
}
    