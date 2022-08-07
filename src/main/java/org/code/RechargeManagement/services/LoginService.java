package org.code.RechargeManagement.services;
import org.code.RechargeManagement.entities.LoginEntity;
import org.code.RechargeManagement.services.LoginService;



public interface LoginService {
	
	//void insert(LoginEntity u);
	//List<LoginEntity> getAll();
	//Object<LoginEntity> get(String emailId);
	//void delete(String emailId);
	//void update (String emailId,LoginEntity e);
	//Optional<LoginEntity> orElseThrow(Object object);

	LoginEntity get(String emailId);

	//Optional<LoginEntity> orElseThrow(Object object);
	
	

}
