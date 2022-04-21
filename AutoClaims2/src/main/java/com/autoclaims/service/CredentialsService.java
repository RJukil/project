package com.autoclaims.service;

import java.util.*;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.autoclaims.dao.CredentialsDao;
import com.autoclaims.exception.UserNotFoundException;
import com.autoclaims.model.Credentials;


@Service
public class CredentialsService {

	@Autowired
	CredentialsDao credDao;
	
	@Transactional
	public Credentials getByCred(String username, String password)
	{
		
		List<Credentials> l= credDao.getByCreds(username, password);
		
		/*
		 * if(cred==null) throw new UserNotFoundException("ID "+userId); else return
		 * cred;
		 */
		
		if(l.size()==0) throw new UserNotFoundException(null);
		
		else
		{
			Credentials c=new Credentials();
			
			
			for(Credentials cc:l)
			{
				c.setUserId(cc.getUserId());
				c.setDate(cc.getDate());
				c.setUserName(cc.getUserName());
				c.setPassword(cc.getPassword());
				
			}
			return c;
		}
	}
}
