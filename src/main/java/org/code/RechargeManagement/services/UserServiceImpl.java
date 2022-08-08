package org.code.RechargeManagement.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.code.RechargeManagement.entities.User;
import org.code.RechargeManagement.exceptions.UserNotFoundException;
import org.code.RechargeManagement.repository.UserRepo;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepo userRepo;
	
	@Override
	public void insertUsers(User users) {
		// TODO Auto-generated method stub
		userRepo.save(users);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public void deleteUsers(String emailId) {
		// TODO Auto-generated method stub 
		userRepo.deleteById(emailId);
	}

	@Override
	public User getUsers(String emailId) {
		// TODO Auto-generated method stub
		return userRepo.findById(emailId).orElseThrow(()->new UserNotFoundException("User not found"));
	}

	@Override
	public void updateUsers(String emailId, User users) {
		// TODO Auto-generated method stub
		User user2=userRepo.findById(emailId).orElseThrow(()->new UserNotFoundException("User not found"));
		user2.setEmail(users.getEmail());
		user2.setName(users.getName());
		user2.setPhonenumber(users.getPhonenumber());
		user2.setPassword(users.getPassword());
		userRepo.save(user2);
	}
}

