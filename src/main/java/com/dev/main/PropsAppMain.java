package com.dev.main;

import java.util.Properties;

import com.dev.utils.PropertyUtils;

public class PropsAppMain {

	public static void main(String[] args) {
		
		Properties properties = PropertyUtils.getAppProperties("AppCode", "app-config.properties");
		
		if(properties != null && !properties.isEmpty()){
			for (Object obj : properties.keySet()) {
				System.out.println(obj + " = " + properties.getProperty((String)obj));
			}
		} else {
			System.out.println("Property Not Found.");
		}
	}
}
