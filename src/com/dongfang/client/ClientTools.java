package com.dongfang.client;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.Queue;
import java.util.ResourceBundle;
import java.util.Set;

import java.util.Map;
import java.util.zip.GZIPOutputStream;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;

import javax.mail.util.ByteArrayDataSource;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMAttribute;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.OMText;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.axis2.Constants;


import antlr.debug.MessageAdapter;

import com.dongfang.client.ServiceStub.EventMessage;
import com.dongfang.client.ServiceStub.EventMessageType;
import com.dongfang.client.ServiceStub.HeaderType;
import com.dongfang.client.ServiceStub.Message;
import com.dongfang.client.ServiceStub.MessageProperty;
import com.dongfang.client.ServiceStub.MessageType;
import com.dongfang.client.ServiceStub.PayloadType;
import com.dongfang.client.ServiceStub.ResponseMessage;
import com.dongfang.client.ServiceStub.UserType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import oracle.jdbc.pool.OracleDataSource;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.FileHandler;

public class ClientTools {

	
	public static Map<String,Long> fileLastModified = new HashMap<String,Long>();
	public static Map<String,String> servicesAddress = new HashMap<String,String>();
	public static Logger logger ;
	
	
	public static void logForFile(){
		try{
		
		FileHandler fileHandler = new FileHandler("java%u.log");
		
		logger.addHandler(fileHandler);
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	
	public static void sendFor3200(String fileName){
		
		
		
		if(filterForWindows(fileName))
		{
			sendFullModel(fileName);
		}
		/*
		File file = new File("D:\\temp");
        File f[] = file.listFiles();
        for(int i=0;i<f.length;i++)
        {
        	
        	f[i].delete();
        	
        }
        */
		
	}
	public static void sendForGis(String fileName){
		
	}
	public static void test(){
		
	}
	 public static Map<String, String> getBundleInfoMap(String bundleName) {
		    
		    
	        ResourceBundle rb = ResourceBundle.getBundle(bundleName);
	        
	       
	        Map<String, String> map = new HashMap<String, String>();   
	           
	        Enumeration<String> en = rb.getKeys();   
	           
	        while(en.hasMoreElements()) {   
	            String key = en.nextElement();   
	            map.put(key, rb.getString(key));   
	        }   
	        return map;   
	    }   
	  
	    /**  
	     * @param map  
	     * @return the entries of the map after being sorted  
	     */  
	    @SuppressWarnings("unchecked")   
	    public static Map.Entry[] getSortedHashtableByValue(Map<String, String> map) {   
	        Set set = map.entrySet();   
	        Map.Entry[] entries = (Map.Entry[]) set.toArray(new Map.Entry[set.size()]);   
	        Arrays.sort(entries, new Comparator() {   
	            public int compare(Object arg0, Object arg1) {   
	                Long key1 = Long.valueOf(((Map.Entry) arg0).getValue().toString());   
	                Long key2 = Long.valueOf(((Map.Entry) arg1).getValue().toString());   
	                return key1.compareTo(key2);   
	            }   
	        });   
	  
	        return entries;   
	    }   
	       
	    @SuppressWarnings("unchecked")   
	    public static void writeProperties(String filePath, Map<String, String> map) {   
	        Properties prop = new Properties();   
	        InputStream fis = null;   
	        //用来写入日期及操作信息
	        OutputStream fos = null;   
	        try {   
	            fis = new FileInputStream(filePath);   
	            prop.load(fis);   
	            fos = new FileOutputStream(filePath);   
	               
	            Set set = map.entrySet();   
	            Map.Entry[] entries = (Map.Entry[]) set.toArray(new Map.Entry[set.size()]);   
	               
	            for (int i = 0; i < entries.length; i++) {   
	                String key = (String)entries[i].getKey();   
	                String value = (String)entries[i].getValue();   
	                prop.setProperty(key, value);   
	                prop.store(fos, "Update '" + value + "' value");   
	            }   
	            fos.flush();   
	        } catch (IOException e) {   
	            System.err.println("error occurred");   
	        } finally {   
	            try {   
	               // fos.close();   
	                fis.close();   
	            } catch (IOException e) {   
	                e.printStackTrace();   
	            }   
	        }   
	    }   
	    
  

	
	public static void requestForTest(String id){
		
		try{
			
			ServiceStub stub = new ServiceStub("http://172.17.1.55:8081/axis2/services/Service/");
			
			HeaderType headerType = new HeaderType();
			
			
			MessageProperty[] mp = new MessageProperty[1];
			
			mp[0] = new MessageProperty();
			//mp[1] = new MessageProperty();
			
			mp[0].setName("test");
			mp[0].setValue(id);
			//mp[1].setName("test");
			//mp[1].setValue("test");
			headerType.setVerb("Created");
			headerType.setNoun("test");
			headerType.setProperty(mp);
			Message message = new Message();
			MessageType messageType = new MessageType();
			messageType.setHeader(headerType);
			message.setMessage(messageType);
			ResponseMessage responseMessage = stub.request(message);
			
			
			System.out.print(responseMessage.getResponseMessage().getHeader().getCorrelationID());
		}
		catch(Exception e){
			
			e.printStackTrace();
		}
		
	}
	public static void testForJDBC()
	throws Exception{
		
		
		OracleDataSource ods = new OracleDataSource();
        ods.setDriverType ( "thin" ); // type of driver
        ods.setNetworkProtocol("tcp"); // tcp is the default anyway
        ods.setServerName ( "127.0.0.1" ); // database server name
        ods.setDatabaseName("orcl"); // Oracle SID
        ods.setPortNumber(1521); // listener port number
        ods.setUser("xopens"); // username
        ods.setPassword("ytdf000"); // password
        Connection conn=ods.getConnection();
        //PreparedStatement ps=conn.prepareStatement("delete from GIS模型导出配置表  where STATIONCODE = 'dm'");
        //conn.setAutoCommit(false);
        Statement st = conn.createStatement();
        
        int i = st.executeUpdate("delete from GIS模型导出配置表  where STATIONCODE = 'dm'");
        //int i = st.executeUpdate("insert into GIS模型导出配置表 (STATIONCODE) VALUES('dm')");
        System.out.println(i);
        
        st.close();
        //conn.close();
        //ResultSet rs=ps.executeQuery();
       /*
        while (rs.next())
        {
            String source = rs.getString("STATIONCODE");
            System.out.println( source );
        }
        */
		
	}
	public static void sendForTest(String id){
		try{
		ServiceStub stub = new ServiceStub("http://172.17.1.55:8081/axis2/services/Service/");
		
		HeaderType headerType = new HeaderType();
		
		
		MessageProperty[] mp = new MessageProperty[1];
		
		mp[0] = new MessageProperty();
		
		mp[0].setName("id");
		mp[0].setValue(id);
		headerType.setVerb("Created");
		headerType.setNoun("test");
		headerType.setProperty(mp);
		headerType.setMessageID("STATIONMODEL");
		
		EventMessageType emt = new EventMessageType();
	    
	    emt.setHeader(headerType);
	    
	    EventMessage em = new EventMessage();
	    
	    em.setEventMessage(emt);
		
		
		
		stub.publishEvent(em);
		
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
	}
	public static void sendStationModel(String fileName){
		//String dicName = newName.substring(0, newName.lastIndexOf("-"));
		File file = new File(fileName);
		String name = file.getName();
		
		
		String stationId = name.substring(0,name.lastIndexOf("-"));
		try{
			   
	        ServiceStub stub = new ServiceStub("http://172.17.1.155:80/gss/web/services/Service");
	            
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
	      }
		
		
		
	}
	public static void sendState(String fileName){
		try{
			   
	        ServiceStub stub = new ServiceStub();
	            
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
	      }
	}
	public static void sendFlow(String fileName){
		try{
			   
	        ServiceStub stub = new ServiceStub();
	            
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
	      }
		
	}
	public static void sendMeasurement(String fileName){
		
		try{
			   
	        ServiceStub stub = new ServiceStub();
	            
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
	public static void sendSVG(String fileName){
		try{
	        ServiceStub stub = new ServiceStub("http://172.17.1.155:80/gss/web/services/Service");
	            
	        OMElement[] svg = new OMElement[1];
	        
	        //svg[0] = createXMLFileElement(fileName,"iesb.dongfang.com","svg");
	        svg[0] = createSvgElement(fileName,"iesb.dongfang.com","svg");
            String id = getStationNameBySvg(fileName);
	        System.out.format("id=%s\n",id);
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
		    header.setProperty(messageProperty);
		    UserType user = new UserType();
		    
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
	      }
	      
		
		
	}
	//发送差异模型，先压缩再base64编码
	public static void sendDiffModel(String fileName){
      try{
	   
	        //ServiceStub stub = new ServiceStub(ClientTools.servicesAddress.get("diffModelAddress"));
    	  ServiceStub stub = new ServiceStub("http://172.17.1.155:80/gss/web/services/Service");  
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
	      }
		
	}
	//发送全模型，先压缩再base64编码
	public static void sendFullModel(String fileName){
			
		try{
	    	
			
			
			
            
            
	        
		     
	    	
	        ServiceStub stub = new ServiceStub("http://172.17.1.155:80/gss/web/services/Service");
	        
	        //stub._getServiceClient().getOptions().setProperty(org.apache.axis2.transport.headerTypetp.headerTypeTPConstants.MC_GZIP_REQUEST, Boolean.TRUE);
	        //stub._getServiceClient().getOptions().setProperty(Constants.Configuration.ENABLE_MTOM, "true");
	       
		        
		        
		        
	        OMElement[] networkdataset = new OMElement[1];
	        
	         //networkdataset[0] = createByteCompressedFileElement(fileName,"iesb.dongfang.com","fullmodel");
	            
	            
	            
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
	      }
		
		
	}
	/*
	由于采用Jnotify库来监控文件，这个库对于windows系统来说，
	当修改文件的时候会产生最后访问的信号，所以要把这个滤掉，建立一个Map把修改时间都记录下来，
	当第二个信号到达时，修改时间并没有改变。而且在创建文件的时候也伴随着3个修改信号，也可以
	使用这个函数来把那三个修改的信号滤掉。
	*/
	public static boolean filterForWindows(String fileName){
		
		if(!fileLastModified.containsKey(fileName))
		{
			File file = new File(fileName);
			fileLastModified.put(fileName, file.lastModified());
			//System.out.print("First time!");
			
		   
		}
		else
		{
			File file = new File(fileName);
			
			if(fileLastModified.get(fileName)<file.lastModified())
			{
			
				fileLastModified.put(fileName, file.lastModified());
				//System.out.print("Good!");
				
			}
			else
			{
				//System.out.print("It sucks!");
				
				return false;
			}
			
		}
		
		
		return true;
	}
	private static byte[] compressBytes(byte[] bytes)
	        throws IOException{
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(new GZIPOutputStream(baos));
		
		dos.write(bytes);
		dos.close();
		
		System.out.print("Compression done!");
		return baos.toByteArray();
	}
	private static OMElement createMeasurementElement(String fileName,String nameSpace,String name)
	{
        
		
		FileDataSource dataSource;
  		DataHandler dataHandler;
  		dataSource = new FileDataSource(fileName);
  		
  		dataHandler = new DataHandler(dataSource);
        OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace ns = fac.createOMNamespace(nameSpace, name);
        OMElement resp = fac.createOMElement(name, ns);
        OMText data = fac.createOMText(dataHandler, false);
        
        resp.addChild(data);
        
        return resp;
		
		
		
	}
	private static OMElement createStateElement(String fileName,String nameSpace,String name)
	throws IOException{
		
		
      //  File  file = new File(fileName);
		
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
	private static OMElement createFlowElement(String fileName,String nameSpace,String name)
	throws IOException{
	
   //     File file = new File(fileName);
		
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
	private static OMElement createSvgElement(String fileName,String nameSpace,String name){
		
		FileDataSource dataSource;
  		DataHandler dataHandler;
  		dataSource = new FileDataSource(fileName);
  		
  		dataHandler = new DataHandler(dataSource);
        OMFactory fac = OMAbstractFactory.getOMFactory();
        OMNamespace ns = fac.createOMNamespace(nameSpace, name);
        OMElement resp = fac.createOMElement(name, ns);
        OMText data = fac.createOMText(dataHandler, false);
        
        resp.addChild(data);
        
        return resp;
		
	}
	private static OMElement createXMLFileElement(String fileName,String nameSpace,String name)
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
	public static String getStationNameBySvg(String fileName)throws Exception
	{
		
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
        XMLInputFactory xif = XMLInputFactory.newInstance();
        XMLStreamReader reader = xif.createXMLStreamReader(fis);
        StAXOMBuilder builder = new StAXOMBuilder(reader);
        
        
        String nameSpace = "http://www.w3.org/2000/svg";
        
		
        
        
		
        String stationName = builder.getDocument().getFirstChildWithName(new QName(nameSpace,"svg")).getAttributeValue(new QName("stationName"));
        
        
        builder.close();
        reader.close();
        fis.close();
        
        
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
   		return stationName;
		
	}
	
	private static OMElement createByteCompressedFileElement(String fileName,String nameSpace,String name)
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
	
	private static OMElement createCompressedFileElement(String fileName,String nameSpace,String name)
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
	public static String CompressingFile(String fileName)throws IOException{
		
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
	public static void main(String[] args) {
		try {
			String name=ClientTools.getStationNameBySvg("D:/df8600data/svgfiles/baihe.svg");
			System.out.println(name);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
