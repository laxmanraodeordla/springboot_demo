package org;

import org.hibernate.Session;

public class Test {

	public static void main(String[] args) {
		Session s=HibernateUtil.getConnection();
		Employee e=new Employee(1, "ganga");
		s.merge(e);
		e=new Employee(1,"pradeep");
		s.merge(e);
		s.beginTransaction().commit();
	}

}
