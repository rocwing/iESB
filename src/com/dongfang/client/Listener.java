package com.dongfang.client;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Level;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;

import com.dongfang.client.ServiceStub.*;

import net.contentobjects.jnotify.JNotifyListener;

public class Listener implements JNotifyListener {

	public void fileRenamed(int wd, String rootPath, String oldName,
			String newName) {
		// print("renamed " + rootPath + " : " + oldName + " -> " + newName);
		
		ClientTools.logger.log(Level.INFO, "renamed " + rootPath + " : " + oldName + " -> " + newName);
		java.util.Calendar cal = java.util.Calendar.getInstance();
		String dicName = newName.substring(0, newName.lastIndexOf("\\"));

		SendTools sendTools = new SendTools();

		if (dicName.endsWith("measurement")) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
			// ClientTools.sendEFile(rootPath+"\\"+newName, "measurement");
			sendTools.sendMeasurement(rootPath + "\\" + newName);
			// ClientTools.sendMeasurement(rootPath+"\\"+newName);
			System.out.println("��������  " + cal.getTime().toLocaleString());
			
			ClientTools.logger.log(Level.INFO, "��������  " + cal.getTime().toLocaleString());
			
		} else {

			if (dicName.endsWith("pasFlow")) {
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					e.printStackTrace();
				}
				// ClientTools.sendEFile(rootPath+"\\"+newName, "flow");
				// ClientTools.sendFlow(rootPath+"\\"+newName);
				sendTools.sendFlow(rootPath + "\\" + newName);
				System.out.println("���ͳ�������  " + cal.getTime().toLocaleString());
				
				ClientTools.logger.log(Level.INFO, "���ͳ�������  " + cal.getTime().toLocaleString());
				
			} else {
				if (dicName.endsWith("pasDSE")) {
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						e.printStackTrace();
					}
					// ClientTools.sendEFile(rootPath+"\\"+newName, "state");
					// ClientTools.sendState(rootPath+"\\"+newName);
					sendTools.sendState(rootPath + "\\" + newName);
					System.out.println("����״̬����  "
							+ cal.getTime().toLocaleString());
					
					ClientTools.logger.log(Level.INFO, "����״̬����  "
							+ cal.getTime().toLocaleString());
				} else {
					if (dicName.equals("diffmodel")) {
						try {
							Thread.sleep(500);
						} catch (Exception e) {
							e.printStackTrace();
						}
						// ClientTools.sendDiffModel(rootPath+"\\"+newName);

						sendTools.sendDiffModel(rootPath + "\\" + newName);
						System.out.println("���Ͳ���ģ��  "
								+ cal.getTime().toLocaleString());
						
						ClientTools.logger.log(Level.INFO, "���Ͳ���ģ��  "
								+ cal.getTime().toLocaleString());
					} else {
						if (dicName.equals("svgfiles")) {
							try {
								Thread.sleep(500);
							} catch (Exception e) {
								e.printStackTrace();
							}

							// ClientTools.sendSVG(rootPath+"\\"+newName);
							String absolutePath=rootPath + "\\" + newName;
							if(SvgFilter.sendAble(absolutePath)){
								sendTools.sendSVG(absolutePath);
								System.out.println("����SVGͼ��  "
										+ cal.getTime().toLocaleString()+absolutePath);
								
								ClientTools.logger.log(Level.INFO, "����SVGͼ��  "
										+ cal.getTime().toLocaleString()+absolutePath);
								
							}
							/*
							else{
								System.out.println("SVGδ���õ������б������͵�ESB:"+absolutePath);
							}
							*/
						}

						else {
							if (dicName.equals("model")) {
								try {
									Thread.sleep(500);
								} catch (Exception e) {
									e.printStackTrace();
								}
								// ClientTools.sendFullModel(rootPath+"\\"+newName);
								sendTools.sendFullModel(rootPath + "\\"
										+ newName);
								System.out.println("����ȫģ��  "
										+ cal.getTime().toLocaleString());
								
								ClientTools.logger.log(Level.INFO, "����ȫģ��  "
										+ cal.getTime().toLocaleString());
							} else {
								if (dicName.equals("substationModel")) {

									try {
										Thread.sleep(500);
									} catch (Exception e) {
										e.printStackTrace();
									}
									// ClientTools.sendStationModel(rootPath+"\\"+newName);
									sendTools.sendStationModel(rootPath + "\\"
											+ newName);
									System.out.println("���ͳ�վģ��  "
											+ cal.getTime().toLocaleString());
									
									ClientTools.logger.log(Level.INFO, "���ͳ�վģ��  "
											+ cal.getTime().toLocaleString());
								}
							}
						}

					}

				}
			}

		}

		// ClientTools.sendFullModel(rootPath+"\\"+newName);
	}

	public void fileModified(int wd, String rootPath, String name) {
		// print("modified " + rootPath + " : " + name);
		// ��������Ŀ¼�ģ�����3200��Gis��˵������Ŀ¼�ǲ�ͬ�ġ�
		/*
		 * java.util.Calendar cal = java.util.Calendar.getInstance();
		 * CharSequence cs = ".";
		 * 
		 * if(name.contains(cs)){
		 * 
		 * 
		 * if(ClientTools.filterForWindows(rootPath+"\\"+name)){ String dicName
		 * = name.substring(0, name.lastIndexOf("\\"));
		 * 
		 * //System.out.print(dicName);
		 * 
		 * //ֻ����ȫģ�ͺ� SVGͼ�Σ���ΪJnotify�ڴ�����ʱ��Ҳ�ᴴ�������޸ģ����ڲ���ģ�ͺ�E�ļ��ǲ���Ҫ��
		 * 
		 * if(dicName.equals("svgfiles")) {
		 * ClientTools.sendSVG(rootPath+"\\"+name);
		 * System.out.println("SVG "+cal.getTime().toString()); }
		 */
		/*
		 * else{ if(dicName.equals("model")) {
		 * 
		 * 
		 * File f = new File(rootPath+"\\"+name);
		 * 
		 * System.out.println(f.length());
		 * ClientTools.sendFullModel(rootPath+"\\"+name);
		 * 
		 * System.out.println("FULLMODEL"+cal.getTime().toString()); }
		 * 
		 * }
		 */
		// }

		// }
		// ClientTools.sendFor3200(rootPath+"\\"+name);

	}

	public void fileDeleted(int wd, String rootPath, String name) {
		// print("deleted " + rootPath + " : " + name);

		// System.out.println(rootPath+"\\"+name);
	}

	public void fileCreated(int wd, String rootPath, String name) {
		 //print("created " + rootPath + " : " + name);
		
		ClientTools.logger.log(Level.INFO, "created " + rootPath + " : " + name);

		// ClientTools.sendStationModel(rootPath+"\\"+name);
		/*
		 * java.util.Calendar cal = java.util.Calendar.getInstance();
		 * CharSequence cs = "."; if(name.contains(cs)){
		 * 
		 * if(ClientTools.filterForWindows(rootPath+"\\"+name)){ String dicName
		 * = name.substring(0, name.lastIndexOf("\\"));
		 */
		// ���е����඼���ͣ���Ϊ��ʹ��ȫģ��Ҳ�е�һ�δ�����ʱ��
		/*
		 * if(dicName.endsWith("measurement")) {
		 * ClientTools.sendEFile(rootPath+"\\"+name, "measurement");
		 * 
		 * System.out.println("measurement"+cal.getTime().toString()); } else{
		 * 
		 * if(dicName.endsWith("pasFlow")) {
		 * ClientTools.sendEFile(rootPath+"\\"+name, "flow");
		 * 
		 * System.out.println("flow"+cal.getTime().toString()); } else {
		 * if(dicName.endsWith("pasDSE")) {
		 * ClientTools.sendEFile(rootPath+"\\"+name, "state");
		 * 
		 * System.out.println("state"+cal.getTime().toString()); } else {
		 * if(dicName.equals("diffmodel")) {
		 * ClientTools.sendDiffModel(rootPath+"\\"+name);
		 * 
		 * System.out.println("DIFFMODEL"+cal.getTime().toString()); } else {
		 * if(dicName.equals("svgfiles")) {
		 * ClientTools.sendSVG(rootPath+"\\"+name);
		 * System.out.println("SVG "+cal.getTime().toString()); }
		 */
		/*
		 * else { if(dicName.equals("model")) {
		 * ClientTools.sendFullModel(rootPath+"\\"+name);
		 * 
		 * System.out.println("FULLMODEL"+cal.getTime().toString()); } }
		 */
		/*
		 * }
		 * 
		 * } }
		 * 
		 * 
		 * }
		 * 
		 * } }
		 */
	}

	void print(String msg) {
		System.err.println(msg);
	}

}
