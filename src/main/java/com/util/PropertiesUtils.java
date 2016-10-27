package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtils {
	private static String filePath = "/conf/offlineBilling.properties";
	public static String PROJECT_PATH = System.getProperty("user.dir");
	
	// 获取参数key对应的value
	public static String getPropertyValue(String key){
		Properties property = new Properties();
		try {
			property.load(new FileInputStream(System.getProperty("user.dir")+filePath));
		} catch (IOException e) {
			e.printStackTrace();
		}
		String value = property.getProperty(key);
		return value;
	}
	
	// 获取输入文件的文件名
	public static String getInputFileName(){
		return getPropertyValue("inputFile");
	}
	
	// 获取套餐详细信息
	public static String getPackageName(){
		return getPropertyValue("packageDetail");
	}
}
