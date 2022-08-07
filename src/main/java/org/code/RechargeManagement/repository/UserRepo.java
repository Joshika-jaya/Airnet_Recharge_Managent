package org.code.RechargeManagement.repository;

import java.util.Optional;

import org.code.RechargeManagement.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
	
	public Optional<User> findByEmail(String email);

}
