package com.dongfang.client;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

import oracle.jdbc.pool.OracleDataSource;

public class SvgFilter {
	private static SvgFilter filter = null;
	private long lastConfigTime = 0;
	private HashMap<String, String> map = new HashMap<String, String>();

	private void reloadConfig() {
		File f = new File("d:/df8002/dat/lastconfigsvg.ini");
		if (f.exists() && f.lastModified() > lastConfigTime) {
			lastConfigTime = f.lastModified();
			map.clear();
			try {
				System.out.println("SvgFilter初始化映射..");
				Class.forName("oracle.jdbc.driver.OracleDriver");
	            Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@172.17.1.55:1521:orcl", "xopens", "ytdf000");

				Statement statement = conn.createStatement();
				
				ResultSet rs = statement.executeQuery("select svg文件  from EXP厂站对照表  where trim(svg文件) is not null and 导出标志=1");
				System.out.println("开始初始化svg列表:");
				int count=0;
				while (rs.next()) {
					count++;
					String fileName = rs.getString(1).trim().toLowerCase();
					map.put(fileName, fileName);
					//System.out.println(fileName);
				}
				System.out.println("完成初始化svg列表,svg列表包含:"+count+" 个需要发送的svg文件");
				rs.close();
				statement.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	private boolean isConfigured(String absolutePath) {
		absolutePath = absolutePath.toLowerCase();
		File f = new File(absolutePath);
		String fileName = f.getName();
		return map.containsKey(fileName);
	}

	public static boolean sendAble(String fileName) {
		if (filter == null) {
			filter = new SvgFilter();
		}
		filter.reloadConfig();
		return filter.isConfigured(fileName);
	}

	public static void main(String[] args) {
		System.out.println(SvgFilter.sendAble("asdf.svg"));
		System.out.println(SvgFilter.sendAble("c:\\jiangyi.svg"));
		for(int i=0;i<100;i++){
			System.out.println(SvgFilter.sendAble("jiangyi.svg"+i));
		}
	}
}
