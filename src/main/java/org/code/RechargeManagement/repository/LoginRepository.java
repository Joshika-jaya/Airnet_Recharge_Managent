package org.code.RechargeManagement.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import org.code.RechargeManagement.entities.User;
import org.code.RechargeManagement.entities.LoginEntity;

@Repository
public interface LoginRepository extends JpaRepository<User, Long> {
	
	//public LoginService findByEmail(String emailId);

	//public Optional<LoginEntity> findByEmail(String emailId);

	public Optional<LoginEntity> findByEmail(String emailId);

	
	
}
