package org.code.RechargeManagement.services;

import java.util.List;
import org.code.RechargeManagement.entities.User;

public interface UserService {	
	void insertUsers(User users);
	List<User> getUsers();
	void deleteUsers(String emailId);
	User getUsers(String emailId);
	void updateUsers(String emailId,User users);
}
