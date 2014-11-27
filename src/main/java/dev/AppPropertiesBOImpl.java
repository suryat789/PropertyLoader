package dev;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AppPropertiesBOImpl implements AppPropertiesBO {
	private SessionFactory sessionFactory;
	 
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	public List<AppProperties> getAppProperties(String strAppCode, String strFIleNme) {
		Session session = this.sessionFactory.openSession();
        List<AppProperties> propsList = session.createQuery("from AppProperties").list();
        session.close();
        return propsList;
        
		/*Query q = session.createQuery("select e.id, e.firstName from Employee e");
	     List<Object[]> employees= (List<Object[]>)q.list();*/
	    //return list;*/
	}
    
   

}
