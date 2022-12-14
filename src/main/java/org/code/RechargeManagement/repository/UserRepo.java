package org.code.RechargeManagement.repository;


import org.code.RechargeManagement.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
	 User findByEmailId(String emailId);
}
