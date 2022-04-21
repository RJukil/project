package com.autoclaims.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.autoclaims.model.Credentials;

@Repository
public class CredentialsDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public List<Credentials> getByCreds(String username, String password)
	{
		/*
		 * Session ss=sessionFactory.getCurrentSession(); String s="" Credentials
		 * cred=ss.get(Credentials.class, username );
		 * 
		 * return cred;
		 */
		
		 Session ss=sessionFactory.getCurrentSession();
		 Transaction t=ss.beginTransaction();
		 
		 Query q=ss.createQuery("from Credentials where username =:us and password=:pw");
		 
		 q.setParameter("us", username);
		 q.setParameter("pw", password);
		 
		 List<Credentials> l=q.list();
		 
		 t.commit();
		 ss.close();
		 
		 return l;
		 
		
	}
}
