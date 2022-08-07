package org.code.RechargeManagement.services;


import javax.transaction.Transactional;


import org.springframework.stereotype.Service;

import org.code.RechargeManagement.repository.LoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.code.RechargeManagement.entities.LoginEntity;
import org.code.RechargeManagement.exceptions.UserNotFoundException;


@Service
@Transactional
public class LoginServiceImpl  implements LoginService{
	
	@Autowired
	private LoginRepository loginRepo;

	@Override
	public LoginEntity get(String emailId) {
		this.loginRepo.findByEmail(emailId).orElseThrow(()->new UserNotFoundException("User not found here"));
		return this.loginRepo.findByEmail(emailId).get();
	}

	

	
	
	

}
