package com.dongfang.client;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.zip.GZIPOutputStream;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.util.ByteArrayDataSource;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.OMText;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;

import com.dongfang.client.ServiceStub.EventMessage;
import com.dongfang.client.ServiceStub.EventMessageType;
import com.dongfang.client.ServiceStub.HeaderType;
import com.dongfang.client.ServiceStub.MessageProperty;
import com.dongfang.client.ServiceStub.PayloadType;
import com.dongfang.client.ServiceStub.UserType;

public class SendTools {
	
	
	public void sendStationModel(String fileName){
		//String dicName = newName.substring(0, newName.lastIndexOf("-"));
		File file = new File(fileName);
		String name = file.getName();
		
		
		String stationId = name.substring(0,name.lastIndexOf("-"));
		try{
			   
	        ServiceStub stub = new ServiceStub(ClientTools.servicesAddress.get("stationModelAddress"));
	            
	        OMElement[] stationModel = new OMElement[1];
	        
	        stationModel[0] = createMeasurementElement(fileName,"iesb.dongfang.com","stationmodel");
            HeaderType header = new HeaderType();
		    header.setVerb("CREATE");
		    header.setNoun("STATIONMODEL");
		    header.setRevision("1.0");
		    java.util.Calendar cal = java.util.Calendar.getInstance();
		    header.setTimestamp(cal);
		    header.setSource("EMS");
		    MessageProperty[] mp = new MessageProperty[1];
			
			mp[0] = new MessageProperty();
			
			mp[0].setName("id");
			mp[0].setValue(stationId);
			header.setProperty(mp);
		    UserType user = new UserType();
		    
		    user.setUserID("8600");
		    user.setOrganization("df");
		    header.setUser(user);
		    header.setMessageID("STATIONMODEL");
		    //File file = new File(fileName);
		    
		    header.setCorrelationID(file.getName());
		    
		    
		    
		    
		    
		    PayloadType payload= new PayloadType();
		    
		   
		    
		    payload.setExtraElement(stationModel);
		    payload.setFormat("RDF");
		    
		    EventMessageType eventMessageType = new EventMessageType();
		    
		    eventMessageType.setHeader(header);
		    eventMessageType.setPayload(payload);
		    
		    EventMessage eventMessage = new EventMessage();
		    
		    eventMessage.setEventMessage(eventMessageType);
			
			
			
			stub.publishEvent(eventMessage);
			
			
	        
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	    	  ClientTools.logger.log(Level.WARNING, null, e);
	      }
		
		
		
	}
	public  void sendState(String fileName){
		try{
			   
	        ServiceStub stub = new ServiceStub(ClientTools.servicesAddress.get("eFileAddress"));
	            
	        OMElement[] state = new OMElement[1];
	        
	        state[0] = createStateElement(fileName,"iesb.dongfang.com","state");
            HeaderType header = new HeaderType();
		    header.setVerb("CREATE");
		    header.setNoun("EFILE");
		    header.setRevision("1.0");
		    java.util.Calendar cal = java.util.Calendar.getInstance();
		    header.setTimestamp(cal);
		    header.setSource("EMS");
		    UserType user = new UserType();
		    
		    user.setUserID("8600");
		    user.setOrganization("df");
		    header.setUser(user);
		    header.setMessageID("state");
		    File file = new File(fileName);
		    
		    header.setCorrelationID(file.getName());
		    
		    
		    
		    
		    
		    PayloadType payload= new PayloadType();
		    
		   
		    
		    payload.setExtraElement(state);
		    payload.setFormat("EFile");
		    
		    EventMessageType eventMessageType = new EventMessageType();
		    
		    eventMessageType.setHeader(header);
		    eventMessageType.setPayload(payload);
		    
		    EventMessage eventMessage = new EventMessage();
		    
		    eventMessage.setEventMessage(eventMessageType);
			
			
			
			stub.publishEvent(eventMessage);
			
			
	        
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	    	  ClientTools.logger.log(Level.WARNING, null, e);
	      }
	}
	public  void sendFlow(String fileName){
		try{
			   
	        ServiceStub stub = new ServiceStub(ClientTools.servicesAddress.get("eFileAddress"));
	            
	        OMElement[] flow = new OMElement[1];
	        
	        flow[0] = createFlowElement(fileName,"iesb.dongfang.com","flow");
            HeaderType header = new HeaderType();
		    header.setVerb("CREATE");
		    header.setNoun("EFILE");
		    header.setRevision("1.0");
		    java.util.Calendar cal = java.util.Calendar.getInstance();
		    header.setTimestamp(cal);
		    header.setSource("EMS");
		    UserType user = new UserType();
		    
		    user.setUserID("8600");
		    user.setOrganization("df");
		    header.setUser(user);
		    header.setMessageID("flow");
		    File file = new File(fileName);
		    
		    header.setCorrelationID(file.getName());
		    
		    
		    
		    
		    
		    PayloadType payload= new PayloadType();
		    
		   
		    
		    payload.setExtraElement(flow);
		    payload.setFormat("EFile");
		    
		    EventMessageType eventMessageType = new EventMessageType();
		    
		    eventMessageType.setHeader(header);
		    eventMessageType.setPayload(payload);
		    
		    EventMessage eventMessage = new EventMessage();
		    
		    eventMessage.setEventMessage(eventMessageType);
			
			
			
			stub.publishEvent(eventMessage);
			
			
	        
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	    	  ClientTools.logger.log(Level.WARNING, null, e);
	      }
		
	}
	public  void sendMeasurement(String fileName){
		
		try{
			   
	        ServiceStub stub = new ServiceStub(ClientTools.servicesAddress.get("eFileAddress"));
	            
	        OMElement[] measurement = new OMElement[1];
	        
	        measurement[0] = createMeasurementElement(fileName,"iesb.dongfang.com","measurement");
	        
	        
            HeaderType header = new HeaderType();
		    header.setVerb("CREATE");
		    header.setNoun("EFILE");
		    header.setRevision("1.0");
		    java.util.Calendar cal = java.util.Calendar.getInstance();
		    header.setTimestamp(cal);
		    header.setSource("EMS");
		    UserType user = new UserType();
		    
		    user.setUserID("8600");
		    user.setOrganization("df");
		    header.setUser(user);
		    header.setMessageID("measurement");
		    File file = new File(fileName);
		    
		    header.setCorrelationID(file.getName());
		    
		    
		    
		    
		    
		    PayloadType payload= new PayloadType();
		    
		   
		    
		    payload.setExtraElement(measurement);
		    payload.setFormat("EFile");
		    
		    EventMessageType eventMessageType = new EventMessageType();
		    
		    eventMessageType.setHeader(header);
		    eventMessageType.setPayload(payload);
		    
		    EventMessage eventMessage = new EventMessage();
		    
		    eventMessage.setEventMessage(eventMessageType);
			
			
			
			stub.publishEvent(eventMessage);
			
			
	        
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	    	  ClientTools.logger.log(Level.WARNING, null, e);
	    	  
	      }
		
	}
	//发送E文件，采用base64编码的方式
	/*
	public static void sendEFile(String fileName, String eFileType){
		
		try{
			   
	        ServiceStub stub = new ServiceStub();
	            
	        OMElement[] eFile = new OMElement[1];
	        
	        eFile[0] = createEFileElement(fileName,"iesb.dongfang.com",eFileType);
            HeaderType header = new HeaderType();
		    header.setVerb("CREATE");
		    header.setNoun("EFILE");
		    header.setRevision("1.0");
		    java.util.Calendar cal = java.util.Calendar.getInstance();
		    header.setTimestamp(cal);
		    header.setSource("EMS");
		    UserType user = new UserType();
		    
		    user.setUserID("8600");
		    user.setOrganization("df");
		    header.setUser(user);
		    header.setMessageID(eFileType);
		    File file = new File(fileName);
		    
		    header.setCorrelationID(file.getName());
		    
		    
		    
		    
		    
		    PayloadType payload= new PayloadType();
		    
		   
		    
		    payload.setExtraElement(eFile);
		    payload.setFormat("EFile");
		    
		    EventMessageType eventMessageType = new EventMessageType();
		    
		    eventMessageType.setHeader(header);
		    eventMessageType.setPayload(payload);
		    
		    EventMessage eventMessage = new EventMessage();
		    
		    eventMessage.setEventMessage(eventMessageType);
			
			
			
			stub.publishEvent(eventMessage);
			
			
	        
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	      }
		
	}
	*/
	//发送SVG图形，直接把SVG的XML文件嵌入
	public  void sendSVG(String fileName){
		
		try{
			   
	        ServiceStub stub = new ServiceStub(ClientTools.servicesAddress.get("svgAddress"));
	            
	        OMElement[] svg = new OMElement[1];
	        
	        //svg[0] = createXMLFileElement(fileName,"iesb.dongfang.com","svg");
	        svg[0] = createSvgElement(fileName,"iesb.dongfang.com","svg");
	        
            String id = getStationNameBySvg(fileName);
	        
	        MessageProperty messageProperty[] = new MessageProperty[1];
	        
	        messageProperty[0] = new MessageProperty();
	        
	        messageProperty[0].setName("id");
	        messageProperty[0].setValue(id);
	        
            HeaderType header = new HeaderType();
		    header.setVerb("CREATE");
		    header.setNoun("SVG");
		    header.setRevision("1.0");
		    java.util.Calendar cal = java.util.Calendar.getInstance();
		    header.setTimestamp(cal);
		    header.setSource("EMS");
		    UserType user = new UserType();
		    header.setProperty(messageProperty);
		    user.setUserID("8600");
		    user.setOrganization("df");
		    header.setUser(user);
		    header.setMessageID("SVG");
		    File file = new File(fileName);
		    
		    header.setCorrelationID(file.getName());
		    
		    
		    
		    
		    
		    PayloadType payload= new PayloadType();
		    
		   
		    
		    payload.setExtraElement(svg);
		    payload.setFormat("SVG");
		    
		    EventMessageType eventMessageType = new EventMessageType();
		    
		    eventMessageType.setHeader(header);
		    eventMessageType.setPayload(payload);
		    
		    EventMessage eventMessage = new EventMessage();
		    
		    eventMessage.setEventMessage(eventMessageType);
			
			
			
			stub.publishEvent(eventMessage);
			
			
	        
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	    	  ClientTools.logger.log(Level.WARNING, null, e);
	      }
	      
		
		
	}
	//发送差异模型，先压缩再base64编码
	public  void sendDiffModel(String fileName){
      try{
	   
	        ServiceStub stub = new ServiceStub(ClientTools.servicesAddress.get("diffModelAddress"));
	            
	        OMElement[] networkdataset = new OMElement[1];
	        
	        networkdataset[0] = createCompressedFileElement(fileName,"iesb.dongfang.com","diffmodel");
            HeaderType header = new HeaderType();
		    header.setVerb("CREATE");
		    header.setNoun("DIFFMODEL");
		    header.setRevision("1.0");
		    java.util.Calendar cal = java.util.Calendar.getInstance();
		    header.setTimestamp(cal);
		    header.setSource("EMS");
		    UserType user = new UserType();
		    
		    user.setUserID("8600");
		    user.setOrganization("df");
		    header.setUser(user);
		    header.setMessageID("DIFFMODEL");
		    File file = new File(fileName);
		    
		    header.setCorrelationID(file.getName());
		    
		    
		    
		    
		    
		    PayloadType payload= new PayloadType();
		    
		   
		    
		    payload.setExtraElement(networkdataset);
		    payload.setFormat("RDF");
		    
		    EventMessageType eventMessageType = new EventMessageType();
		    
		    eventMessageType.setHeader(header);
		    eventMessageType.setPayload(payload);
		    
		    EventMessage eventMessage = new EventMessage();
		    
		    eventMessage.setEventMessage(eventMessageType);
			
			
			
			stub.publishEvent(eventMessage);
			
			
	        
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	    	  ClientTools.logger.log(Level.WARNING, null, e);
	      }
		
	}
	//发送全模型，先压缩再base64编码
	public  void sendFullModel(String fileName){
			
		try{
	    	
			
			
			
            
            
	        
		     
	    	
	        ServiceStub stub = new ServiceStub(ClientTools.servicesAddress.get("fullModelAddress"));
	        
	        //stub._getServiceClient().getOptions().setProperty(org.apache.axis2.transport.headerTypetp.headerTypeTPConstants.MC_GZIP_REQUEST, Boolean.TRUE);
	        //stub._getServiceClient().getOptions().setProperty(Constants.Configuration.ENABLE_MTOM, "true");
	       
		        
		        
		        
	        OMElement[] networkdataset = new OMElement[1];
	        
	         //networkdataset[0] = createByteCompressedFileElement(fileName,"iesb.dongfang.com","fullmodel");
	            
	        //String id = getStationNameBySvg(fileName);
	        
	        //MessageProperty messageProperty[] = new MessageProperty[1];
	        
	        //messageProperty[0] = new MessageProperty();
	        
	        //messageProperty[0].setName("id");
	        //messageProperty[0].setValue(id);
	            
	        //networkdataset[0] = createXMLFileElement(fileName,"iesb.dongfang.com","networkdataset");
	        networkdataset[0] = createCompressedFileElement(fileName,"iesb.dongfang.com","fullmodel");
	        //networkdataset[0] = createEFileElement(fileName,"iesb.dongfang.com","fullmodel");
            HeaderType header = new HeaderType();
		    header.setVerb("CREATE");
		    header.setNoun("FULLMODEL");
		    header.setRevision("1.0");
		    java.util.Calendar cal = java.util.Calendar.getInstance();
		    header.setTimestamp(cal);
		    header.setSource("EMS");
		    
		    UserType user = new UserType();
		    
		    user.setUserID("8600");
		    user.setOrganization("df");
		    header.setUser(user);
		    header.setMessageID("FULLMODEL");
		    File file = new File(fileName);
		    
		    header.setCorrelationID(file.getName());
		    
		    
		    
		    
		    
		    PayloadType payload= new PayloadType();
		    
		   
		    
		    payload.setExtraElement(networkdataset);
		    payload.setFormat("RDF");
		    
		    EventMessageType eventMessageType = new EventMessageType();
		    
		    eventMessageType.setHeader(header);
		    eventMessageType.setPayload(payload);
		    
		    EventMessage eventMessage = new EventMessage();
		    
		    eventMessage.setEventMessage(eventMessageType);
			
			
			
			stub.publishEvent(eventMessage);
			
			
	        
	      }
	      catch(Exception e)
	      {
	    	  e.printStackTrace();
	    	  ClientTools.logger.log(Level.WARNING, null, e);
	      }
		
		
	}
	
	
	private  byte[] compressBytes(byte[] bytes)
	        throws IOException{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(new GZIPOutputStream(baos));
		
		dos.write(bytes);
		dos.close();
		
		System.out.print("Compression done!");
		return baos.toByteArray();
	}
	private  OMElement createMeasurementElement(String fileName,String nameSpace,String name)
	throws Exception{
        
		
		FileUtil fileutil = new FileUtil();
		
		
		ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(fileutil.getFileByte(fileName),"xml");
		
        DataHandler dataHandler = new DataHandler(byteArrayDataSource);
		
		OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace ns =
            fac.createOMNamespace(nameSpace, name);
        OMElement resp = fac.createOMElement(name, ns);
        OMText data = fac.createOMText(dataHandler, false);
        
        resp.addChild(data);
        return resp;
		
		
		
	}
	private  OMElement createStateElement(String fileName,String nameSpace,String name)
	throws Exception{
		
		
       // File  file = new File(fileName);
		
		FileUtil fileutil = new FileUtil();
		ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(fileutil.getFileByte(fileName),"xml");
		
		
		
        DataHandler dataHandler = new DataHandler(byteArrayDataSource);
		
		OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace ns =
            fac.createOMNamespace(nameSpace, name);
        OMElement resp = fac.createOMElement(name, ns);
        OMText data = fac.createOMText(dataHandler, false);
        
        resp.addChild(data);
        return resp;
		
	}
	private  OMElement createFlowElement(String fileName,String nameSpace,String name)
	throws Exception{
	
       // File file = new File(fileName);
		
		FileUtil fileutil = new FileUtil();
		ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(fileutil.getFileByte(fileName),"xml");
		
		
		
        DataHandler dataHandler = new DataHandler(byteArrayDataSource);
		
		OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace ns =
            fac.createOMNamespace(nameSpace, name);
        OMElement resp = fac.createOMElement(name, ns);
        OMText data = fac.createOMText(dataHandler, false);
        
        resp.addChild(data);
        return resp;
		
	}
	private  OMElement createSvgElement(String fileName,String nameSpace,String name)
	throws Exception{
		
        FileUtil fileutil = new FileUtil();
		
		
		ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(fileutil.getNonCompressFileByte(fileName),"xml");
		
        DataHandler dataHandler = new DataHandler(byteArrayDataSource);
		
		OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace ns =
            fac.createOMNamespace(nameSpace, name);
        OMElement resp = fac.createOMElement(name, ns);
        OMText data = fac.createOMText(dataHandler, false);
        
        resp.addChild(data);
        return resp;
		
	}
	private  OMElement createXMLFileElement(String fileName,String nameSpace,String name)
	throws Exception 
	{
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
        XMLInputFactory xif = XMLInputFactory.newInstance();
        XMLStreamReader reader = xif.createXMLStreamReader(fis);
        StAXOMBuilder builder = new StAXOMBuilder(reader);
        
        
        OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace ns = fac.createOMNamespace(nameSpace, name);
        OMElement resp = fac.createOMElement(name, ns);
        
        resp.addChild(builder.getDocumentElement());
        
        return resp;
		
	}
	public  String getStationNameBySvg(String fileName)throws Exception
	{
		
		
		
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
        XMLInputFactory xif = XMLInputFactory.newInstance();
        XMLStreamReader reader = xif.createXMLStreamReader(fis);
        StAXOMBuilder builder = new StAXOMBuilder(reader);
        
        
        String nameSpace = "http://www.w3.org/2000/svg";
        
		
     String stationName = builder.getDocument().getFirstChildWithName(new QName(nameSpace,"svg")).getAttributeValue(new QName("stationName"));
     System.out.print("stationName="+stationName); 
     /*
       for(Iterator iter = builder.getDocument().getFirstChildWithName(new QName(nameSpace,"svg")).getFirstChildWithName(new QName(nameSpace,"g")).getAllAttributes();iter.hasNext();){
    	 
    	   OMAttribute attr =(OMAttribute)iter.next();
    	   System.out.println(attr.getLocalName());
    	   System.out.println(attr.getAttributeValue());
       }
        
        System.out.println(test);
        System.out.println("test");
		
		String stationName = "";
		*/
     
     builder.close();
     reader.close();
     fis.close();
		return stationName;
		
	}
	
	private  OMElement createByteCompressedFileElement(String fileName,String nameSpace,String name)
	throws IOException{
		File file = new File(fileName);
		
		FileDataSource dataSource;
  		DataHandler dataHandler;
  		dataSource = new FileDataSource(CompressingFile(fileName));
  		 dataHandler = new DataHandler(dataSource);
	        OMFactory fac = OMAbstractFactory.getOMFactory();
            OMNamespace ns = fac.createOMNamespace(nameSpace, name);
            OMElement resp = fac.createOMElement(name, ns);
            OMText data = fac.createOMText(dataHandler, false);
            
            resp.addChild(data);
            
            return resp;
	}
	
	private  OMElement createCompressedFileElement(String fileName,String nameSpace,String name)
	throws Exception{
		
		FileUtil fileutil = new FileUtil();
		ByteArrayDataSource byteArrayDataSource = new ByteArrayDataSource(fileutil.getFileByte(fileName),"xml");
		
		
		
        DataHandler dataHandler = new DataHandler(byteArrayDataSource);
		
		OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace ns =
            fac.createOMNamespace(nameSpace, name);
        OMElement resp = fac.createOMElement(name, ns);
        OMText data = fac.createOMText(dataHandler, false);
        
        resp.addChild(data);
        return resp;
		
		
		
	}
	public  String CompressingFile(String fileName)throws IOException{
		
		File file = new File(fileName);
		
		String gzipFileName = "D:\\temp\\"+file.getName()+".gz";
		FileOutputStream fos = new FileOutputStream(gzipFileName);
		
		GZIPOutputStream gzos = new GZIPOutputStream(fos);
		
		FileInputStream fin = new FileInputStream(file);
		BufferedInputStream in = new BufferedInputStream(fin);
		
		byte[] buffer = new byte[1024];
		int i;
		while((i = in.read(buffer)) >= 0){
			gzos.write(buffer, 0, i);
		}
		in.close();
		gzos.close();
		return gzipFileName;
	}

}
