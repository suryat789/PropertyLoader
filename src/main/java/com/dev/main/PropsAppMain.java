package com.dev.main;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev.dao.AppPropertiesDAO;
import com.dev.entity.AppProperties;

public class PropsAppMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		AppPropertiesDAO propsDAO = context.getBean(AppPropertiesDAO.class);

		List<AppProperties> list = propsDAO.getAppProperties("Points",	"SomeFile1");

		for(AppProperties p : list){
			System.out.println("Property List::"+p);
		}
		context.close();   
	}
}
