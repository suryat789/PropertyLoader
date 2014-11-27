package com.dev.utils;

import java.util.List;
import java.util.Properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.dao.AppPropertiesDAO;
import com.dev.entity.AppProperties;

public class PropertyUtils {
	
	public static Properties getAppProperties(final String strAppCode, final String strFileName){
		Properties properties = null;
		
		try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml")) {
			AppPropertiesDAO propsDAO = context.getBean(AppPropertiesDAO.class);

			List<AppProperties> list = propsDAO.getAppProperties(strAppCode, strFileName);

			if(!list.isEmpty()){
				properties = new Properties();
				for(AppProperties props : list){
					properties.put(props.getKey(), props.getValue());
				}
			}
		} catch (Exception ex){
			ex.printStackTrace();
		}
		 
		return properties;
	}
}
