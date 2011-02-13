package com.dongfang.server;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.zip.GZIPOutputStream;

public class FileUtil {
	
	 
	public byte[] getFileByte(String fileName) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream fileInputStream = new FileInputStream(fileName);
		  return getFileByte(fileInputStream);
		
	}
	 public byte[] getFileByte(URL url) throws IOException {
		  if (url != null) {
		   return getFileByte(url.openStream());
		  } else {
		   return null;
		  }
		 }

		 public byte[] getFileByte(InputStream in) 
		 throws IOException{
		  ByteArrayOutputStream out = new ByteArrayOutputStream();
		  DataOutputStream dos = new DataOutputStream(new GZIPOutputStream(out));
		  try {
		   copy(in, dos);
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		  return out.toByteArray();

		 }

		 private void copy(InputStream in, OutputStream out) throws IOException {

		  try {
		   byte[] buffer = new byte[4096];
		   int nrOfBytes = -1;
		   while ((nrOfBytes = in.read(buffer)) != -1) {
		    out.write(buffer, 0, nrOfBytes);
		   }
		   out.flush();
		  } catch (IOException e) {

		  }finally {
		   try {
		    if (in != null) {
		     in.close();
		    }
		   } catch (IOException ex) {
		   }
		   try {
		    if (out != null) {
		     out.close();
		    }
		   } catch (IOException ex) {
		   }
		  }

		 }
		
		

		}
