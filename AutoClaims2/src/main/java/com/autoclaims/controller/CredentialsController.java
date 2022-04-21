package com.autoclaims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.autoclaims.model.Credentials;
import com.autoclaims.service.CredentialsService;

@CrossOrigin(origins="http://localhost:3000")
@RestController
public class CredentialsController {
	
	@Autowired
	CredentialsService cs;
	
	@GetMapping("/byUser/{username}/{password}")
	public Credentials getByCred(@PathVariable("username") String  username, @PathVariable("password") String  password )
	{
		return cs.getByCred(username, password);
	}


}