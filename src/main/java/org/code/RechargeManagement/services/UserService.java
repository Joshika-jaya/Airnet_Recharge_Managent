package org.code.RechargeManagement.services;

import org.code.RechargeManagement.entities.User;

public interface UserService {
	
	User  getEmail(String emailId);

	void deleteUser(String emailId);

	void updateUser(String emailId, User users);


}
