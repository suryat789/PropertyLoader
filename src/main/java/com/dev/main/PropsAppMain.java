package com.dev.main;

import java.util.Properties;

import com.dev.utils.PropertyUtils;

public class PropsAppMain {

	public static void main(String[] args) {
		
		Properties properties = PropertyUtils.getAppProperties("Points",	"points-config.properties");
		
		for (Object obj : properties.keySet()) {
			System.out.println(obj + " : " + properties.getProperty(obj.toString()));
		}
	}
}
