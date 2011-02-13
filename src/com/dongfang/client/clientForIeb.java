package com.dongfang.client;




import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.impl.builder.StAXOMBuilder;

import net.contentobjects.jnotify.JNotify;


public class clientForIeb {
	
	static {
		LogManager logManager = LogManager.getLogManager();
		try {
			logManager.readConfiguration(clientForIeb.class.getResourceAsStream("logging.properties"));
			
		 
		} catch (IOException ex) {
			Logger.getLogger(clientForIeb.class.getName()).log(Level.SEVERE, null,
					ex);
		} catch (SecurityException ex) {
			Logger.getLogger(clientForIeb.class.getName()).log(Level.SEVERE, null,
					ex);
		}
		
		

	}	

public static void main(String[] args) {
		
	 
	ClientTools.logger = Logger.getLogger("logger");
	try{ 
	ClientTools.servicesAddress = ClientTools.getBundleInfoMap("info"); 
	
	
	System.out.println("clientForIeb已成功启动!");
	
	
	FileSystemMonitor();
	
		
		
	 
	}
	catch(Exception e){
		
		e.printStackTrace();
		ClientTools.logger.log(Level.WARNING, null, e);
	}
	
	
	}
	
	public static void FileSystemMonitor() throws Exception {
	    // path to watch
	    //String path = System.getProperty("user.home");
        String path = "d:/df8600data";
        
	    // watch mask, specify events you care about,
	    // or JNotify.FILE_ANY for all events.
	    int mask = JNotify.FILE_CREATED  | 
	               JNotify.FILE_DELETED  | 
	               JNotify.FILE_MODIFIED | 
	               JNotify.FILE_RENAMED;
        
	   
	    // watch subtree?
	    boolean watchSubtree = true;

	    // add actual watch
	    int watchID = JNotify.addWatch(path, mask, watchSubtree, new Listener());
	   

	    // sleep a little, the application will exit if you
	    // don't (watching is asynchronous), depending on your
	    // application, this may not be required
	    while (true) Thread.sleep(10000);

	    // to remove watch the watch
	    /*
	    boolean res = JNotify.removeWatch(watchID);
	    
	    if (!res) {
	      // invalid watch ID specified.
	    }
	    */
	  }
	

}
