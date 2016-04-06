package com.gaurav.spring.jdbc;


import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class HibernateDaoImpl {
	
	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public long getCircleCount() {
		String hql = "select count(*) from Circle";
		Query query = getSessionFactory().openSession().createQuery(hql);
		return (Long)query.uniqueResult();
	}

}
