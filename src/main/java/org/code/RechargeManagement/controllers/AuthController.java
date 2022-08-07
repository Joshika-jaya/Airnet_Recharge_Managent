package org.code.RechargeManagement.controllers;
import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.code.RechargeManagement.entities.LoginEntity;
import org.code.RechargeManagement.services.LoginService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.stereotype.Service;

import org.springframework.web.bind.annotation.PathVariable;
//import com.examly.springapp.exception.ResourceNotFoundException;
//import com.examly.springapp.model.UserModel;
//import com.examly.springapp.repository.UserModelRepository;
//import com.examly.springapp.service.UserModelService;

@RestController
public class AuthController  {
	
	@Autowired
	private LoginService service;
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/login")
	public LoginEntity loginUser (@RequestBody LoginEntity user) throws Exception {
		String tempEmailId;
		String tempPass;
		String tempRole;

		tempEmailId = user.getEmailId();
		
		tempPass = user.getPassword();
		tempRole=null;
		
		
		LoginEntity userobj; 
	    userobj= null;
		LoginEntity userobj1;
		userobj1=null;
		
	/*	if (tempEmailId != null && tempPass != null) 
		{ 
			userobj = service.fetchByEmailId(tempEmailId, tempPass); 
			if(authentication(userobj)==true)
			{
				userobj.setuser_role("admin");
			}
			else
			{
				userobj.setuser_role("user");
			}
			
		}
		if(userobj == null){
			throw new Exception("Bad Credentials");
		}*/
	
		return userobj;
		
	}

		@GetMapping("/loginDetails")
		public boolean authentication (@RequestBody LoginEntity user) throws Exception {

			String tempUserRole =null;
			String tempEmailId=user.getEmailId();
			//Long id=user.getId();
			LoginEntity tempUserRole1 = service.get(tempEmailId);
			//Long id=user.getId();
			/*if (tempUserRole1.getuser_role().equals("user")) 
			{ 
				return false;
			
			}
			
			return true;
			*/
			return false;
		}
			
}