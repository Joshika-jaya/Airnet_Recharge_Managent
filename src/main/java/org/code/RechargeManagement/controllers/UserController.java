package org.code.RechargeManagement.controllers;

import java.util.List;

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

import org.code.RechargeManagement.entities.User;
import org.code.RechargeManagement.services.UserService;

//@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/addUsers")
	public ResponseEntity<?> insertUsers(@RequestBody User emailId){
		userService.insertUsers(emailId);
		return new ResponseEntity<String>("Inserted Successfully",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/viewUsers")
	public ResponseEntity<List<User>> getUsers(){
		List<User> users=userService.getUsers();
		return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	}
	
	/*@GetMapping("/viewAddonById/{addonId}")
	public ResponseEntity<?> getAddons(@PathVariable("addonId") int aid){
		addonsService.getAddons(aid);
		return new ResponseEntity<String>("Viewed Successfully",HttpStatus.OK);
	}*/
	
	@DeleteMapping("/deleteUsers/{emailId}")
	public ResponseEntity<?> deleteUsers(@PathVariable("emailId") String emailId){
		userService.deleteUsers(emailId);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
	}

	@PutMapping("/updateUsers/{emailId}")
	public ResponseEntity<?> updateUsers(@PathVariable("emailId") String emailId,@RequestBody User users){
		userService.updateUsers(emailId, users);
		return new ResponseEntity<String>("Updated Successfully",HttpStatus.CREATED);
	}
}
