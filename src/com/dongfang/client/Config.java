package com.dongfang.client;

import java.util.Properties;
import java.io.*;


public class Config {
	 private static Properties prop=null;
	    private static String propFileName="/config/info.properties";
	    private synchronized static void loadProperties(){
	        prop=new Properties();
	        try {
	            InputStream input=Config.class.getResourceAsStream(propFileName);
	            prop.load(input);
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
	    
	    public static String getProperty(String propName){
	        loadProperties();
	        return prop.getProperty(propName);
	    }

	    public static String getPropFileName() {
	        return propFileName;
	    }

	    public static void setPropFileName(String propFileName) {
	        Config.propFileName = propFileName;
	    }


}
