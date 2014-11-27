package com.dev.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.entity.AppProperties;

public class AppPropertiesDAOImpl implements AppPropertiesDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public List<AppProperties> getAppProperties(String strAppCode, String strFIleNme) {
		Session session = this.sessionFactory.openSession();
		List<AppProperties> propsList = session.createQuery("from AppProperties").list();
		session.close();
		return propsList;
	}
}
