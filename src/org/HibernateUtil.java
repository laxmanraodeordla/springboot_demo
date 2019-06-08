package org;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class HibernateUtil {
	
	public static Session getConnection(){
		AnnotationConfiguration con=new AnnotationConfiguration().configure();
		SessionFactory sf=con.buildSessionFactory();
		Session s=sf.openSession();
		return s;
	}

}
