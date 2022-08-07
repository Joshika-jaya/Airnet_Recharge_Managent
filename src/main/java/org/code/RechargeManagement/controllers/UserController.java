package org.code.RechargeManagement.controllers;

import org.code.RechargeManagement.entities.User;
import org.code.RechargeManagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")

public class UserController {
	
	@Autowired
	private UserService userService;
	
Map<String,User> allUsers = new HashMap<>();
	
	@GetMapping
	public Collection<User> getMethod(){
		return allUsers.values();
	}
	
	@PostMapping
	public ResponseEntity<String> postMethod(@RequestBody User userdetails){
		User addValue = new User();
		addValue.setName(userdetails.getName());
		addValue.setEmail(userdetails.getEmail());
		addValue.setPhonenumber(userdetails.getPhonenumber());
		addValue.setPassword(userdetails.getPassword());
		allUsers.put(userdetails.getName(),addValue );
		return new ResponseEntity<String>("Posted Successfully",HttpStatus.OK);
	}
	
	@PutMapping("/updateUser/{emailId}")
	public ResponseEntity<?> updateUser(@PathVariable("emailId") String emailId,@RequestBody User users){
		userService.updateUser(emailId,users);
		return new ResponseEntity<String>("Updated Successfully",HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteUser/{emailId}")
	public ResponseEntity<?> deleteUser(@PathVariable("emailId") String emailId){
		userService.deleteUser(emailId);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
	}

}
