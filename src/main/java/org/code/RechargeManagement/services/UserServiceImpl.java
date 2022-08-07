package org.code.RechargeManagement.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.code.RechargeManagement.entities.User;
import org.code.RechargeManagement.exceptions.UserNotFoundException;
import org.code.RechargeManagement.repository.UserRepo;

@Service
@Transactional
public abstract class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public User getEmail(String emailId) {
		this.userRepo.findByEmail(emailId).orElseThrow(()->new UserNotFoundException("User not found here"));
		return this.userRepo.findByEmail(emailId).get();
	}
	@Override
	public void deleteUser(String emailId){
		userRepo.deleteAll();
	}
	@Override
	public void updateUser(String emailId,User users){
		User user2=userRepo.findByEmail(emailId).orElseThrow(()->new UserNotFoundException("User not found"));
		user2.setEmail(users.getEmail());
		userRepo.save(user2);
	}

}
