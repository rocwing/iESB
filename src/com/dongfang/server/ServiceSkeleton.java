
/**
 * ServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.5.1  Built on : Oct 19, 2009 (10:59:00 EDT)
 */
    package com.dongfang.server;

import java.io.FileWriter;

import javax.activation.DataHandler;
import javax.mail.util.ByteArrayDataSource;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.OMText;







import ch.iec.www.tc57._2008.schema.message.HeaderType;
import ch.iec.www.tc57._2008.schema.message.MessageProperty;
import ch.iec.www.tc57._2008.schema.message.PayloadType;
import ch.iec.www.tc57._2008.schema.message.ReplyType;
import ch.iec.www.tc57._2008.schema.message.ResponseMessage;
import ch.iec.www.tc57._2008.schema.message.ResponseMessageType;
import ch.iec.www.tc57._2008.schema.message.UserType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import oracle.jdbc.pool.OracleDataSource;
    /**
     *  ServiceSkeleton java skeleton for the axisService
     */
    public class ServiceSkeleton{
        
         
        /**
         * Auto generated method signature
         * 
                                     * @param message
             * @throws FaultMessage : 
         */
        
                 public ch.iec.www.tc57._2008.schema.message.ResponseMessage request
                  (
                  ch.iec.www.tc57._2008.schema.message.Message message
                  )
            throws FaultMessage{
                //TODO : fill this with the necessary business logic
                	 
              /*  	 
                	 
               try{	 
            	   
            	   return responseForGis(message);
            	   
               }
               catch(Exception e){
            	   
            	   e.printStackTrace();
               }
               */
                throw new  java.lang.UnsupportedOperationException("Please implement " + this.getClass().getName() + "#request");
        }
     
         
        /**
         * Auto generated method signature
         * 
                                     * @param eventMessage
             * @throws FaultMessage : 
         */
        
                 public void publishEvent
                  (
                  ch.iec.www.tc57._2008.schema.message.EventMessage eventMessage
                  )
            throws FaultMessage{
                //TODO : fill this with the necessary business logic
                	 if(eventMessage.getEventMessage().getHeader().getMessageID().equals("STATIONMODEL"))
                	 {	 
                	 try{
                		// String id = eventMessage.getMessage().getHeader().getProperty()[0].getValue();
                		 String id = eventMessage.getEventMessage().getHeader().getProperty()[0].getValue();
                    	 System.out.println("select * from GIS模型导出配置表  where STATIONCODE ='"+id+"'");
                    	 
                    	 OracleDataSource ods = new OracleDataSource();
                         ods.setDriverType ( "thin" ); // type of driver
                         ods.setNetworkProtocol("tcp"); // tcp is the default anyway
                         ods.setServerName ( "127.0.0.1" ); // database server name
                         ods.setDatabaseName("orcl"); // Oracle SID
                         ods.setPortNumber(1521); // listener port number
                         ods.setUser("xopens"); // username
                         ods.setPassword("ytdf000"); // password
                         Connection conn=ods.getConnection();
                         Statement statement=conn.createStatement();
                         ResultSet rs = statement.executeQuery("select * from GIS模型导出配置表  where STATIONCODE ='"+id+"'");
                         
                         //PreparedStatement ps=conn.prepareStatement("select * from GIS模型导出配置表  where STATIONCODE ='"+id+"'");
                         //ResultSet rs=ps.executeQuery();
                         
                         
                         if(rs.next()){
                        	
                        	 
                        	 statement.executeQuery("delete from GIS模型导出配置表  where STATIONCODE ='"+id+"'");
                         }
                         
                        
                         statement.executeQuery("insert into GIS模型导出配置表 (STATIONCODE) VALUES('"+id+"')");
                     
                      
                         rs.close();
                         statement.close();
                         conn.close();
                         
                      	//System.out.print(eventMessage.getEventMessage().getHeader().getProperty()[0].getValue() + "\r\n");
                      	
                          
                         // outputStream.flush();
                          //outputStream.close();
                     	 }
                     	 catch(Exception e){
                     		 
                     		 e.printStackTrace();
                     	 }
                	 }
                	 else
                	 {
                		 
                		 System.out.println("MessageID error!");
                		 }
                
        }
                 
                 public  ch.iec.www.tc57._2008.schema.message.ResponseMessage responseForGis(ch.iec.www.tc57._2008.schema.message.Message message) throws Exception{
                	 
                	 
                	 
                	 String id = message.getMessage().getHeader().getProperty()[0].getValue();
                	 System.out.println("select * from GIS模型导出配置表  where STATIONCODE ='"+id+"'");
                	 
                	 OracleDataSource ods = new OracleDataSource();
                     ods.setDriverType ( "thin" ); // type of driver
                     ods.setNetworkProtocol("tcp"); // tcp is the default anyway
                     ods.setServerName ( "127.0.0.1" ); // database server name
                     ods.setDatabaseName("orcl"); // Oracle SID
                     ods.setPortNumber(1521); // listener port number
                     ods.setUser("xopens"); // username
                     ods.setPassword("ytdf000"); // password
                     Connection conn=ods.getConnection();
                     Statement statement=conn.createStatement();
                     ResultSet rs = statement.executeQuery("select * from GIS模型导出配置表  where STATIONCODE ='"+id+"'");
                     
                     //PreparedStatement ps=conn.prepareStatement("select * from GIS模型导出配置表  where STATIONCODE ='"+id+"'");
                     //ResultSet rs=ps.executeQuery();
                     
                     
                     if(rs.next()){
                    	
                    	 
                    	 statement.executeQuery("delete from GIS模型导出配置表  where STATIONCODE ='"+id+"'");
                     }
                     
                    
                     statement.executeQuery("insert into GIS模型导出配置表 (STATIONCODE) VALUES('"+id+"')");
                 
                  
                     rs.close();
                     statement.close();
                     conn.close();
                     
                     
                  	   
                  	   System.out.print(message.getMessage().getHeader().getProperty()[0].getValue() + "\r\n");
                  	   System.out.print(message.getMessage().getHeader().getNoun() + "\r\n");
                  	   System.out.print(message.getMessage().toString());
                     HeaderType headerType = new HeaderType();
                     headerType.setVerb("CREATE");
                     headerType.setNoun("DIFFMODEL");
                     headerType.setRevision("1.0");
                     java.util.Calendar cal = java.util.Calendar.getInstance();
                     headerType.setTimestamp(cal);
                     headerType.setSource("EMS");
                     UserType user = new UserType();                             		    
         		       user.setUserID("8600");
         		       user.setOrganization("df");
         		       headerType.setUser(user);         		       
         		       headerType.setMessageID("DIFFMODEL ");        		       
         		       ch.iec.www.tc57._2008.schema.message.MessageProperty[] mp = new ch.iec.www.tc57._2008.schema.message.MessageProperty[1];
         		       mp[0] = new MessageProperty();
         		       mp[0].setName("test");
         		       mp[0].setValue("test");
        		      // String fileName = getModelBySvg(message.getMessage().getHeader().getProperty()[0].getValue(), message.getMessage().getHeader().getProperty()[1].getValue());
         		       headerType.setCorrelationID("test");    
         		       
         		       /*
         		       PayloadType payloadType = new PayloadType();
                     OMElement[] networkdataset = new OMElement[1];      	        
      	          networkdataset[0] = createCompressedFileElement(fileName,"iesb.dongfang.com","diffmodel");
         		       payloadType.setExtraElement(networkdataset);
         		       payloadType.setFormat("RDF"); 
         		       */   
                	 
         		      ResponseMessageType responseMessageType = new ResponseMessageType();
         		      responseMessageType.setHeader(headerType);
         		      ReplyType replyType = new ReplyType();
         		      replyType.setReplyCode("test");
         		      responseMessageType.setReply(replyType);         		      
         		     // responseMessageType.setPayload(payloadType);
         		      ResponseMessage responseMessage = new ResponseMessage();         		      
         		      responseMessage.setResponseMessage(responseMessageType);
         		      return responseMessage;
                     
                	 
                 }
                
                 
                 public String getModelBySvg(String name, String id)
                 {
                	 String fileName = "E:\\df\\test\\svg\\Service.xml";
                	 
                	 
                	 return fileName;
                 }
                 
                 public OMElement createCompressedFileElement(String fileName,String nameSpace,String name)
             	throws Exception{
             		
             		FileUtil fileUtil = new FileUtil();
             		//ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(fileutil.getFileByte(fileName),"xml");
             		
             		ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(fileUtil.getFileByte(fileName), "xml");
             		
             		
                    DataHandler dataHandler = new DataHandler(byteArrayDataSource);
             		
             		OMFactory fac = OMAbstractFactory.getOMFactory();
                     OMNamespace ns =
                         fac.createOMNamespace(nameSpace, name);
                     OMElement resp = fac.createOMElement(name, ns);
                     OMText data = fac.createOMText(dataHandler, false);
                     
                     resp.addChild(data);
                     return resp;
             		
             		
             		
             	}
     
    }
    