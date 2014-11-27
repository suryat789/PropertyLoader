package com.dev.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dev.entity.AppProperties;

public class AppPropertiesDAOImpl implements AppPropertiesDAO {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@SuppressWarnings("unchecked")
	public List<AppProperties> getAppProperties(String strAppCode, String strFileNme) {

		Session session = this.sessionFactory.openSession();
		List<AppProperties> propsList = null; 
		Query query = session.createQuery("from AppProperties where applicationCode = :applicationcode and filename = :filename");
		query.setParameter("applicationcode", strAppCode);
		query.setParameter("filename", strFileNme);
		propsList = query.list();
		session.close();
		return propsList;
	}
}
