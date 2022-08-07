package org.code.RechargeManagement.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.code.RechargeManagement.entities.Plans;
import org.code.RechargeManagement.services.PlansService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/admin")
public class PlansController {
	@Autowired
	private PlansService planService;

	@PostMapping("/addPlan")
	public ResponseEntity<?> insertPlan(@RequestBody Plans plans) {
		planService.insertPlan(plans);
		return new ResponseEntity<String>("Inserted Successfully",HttpStatus.CREATED);
	}

	@GetMapping("/viewPlan")
	public ResponseEntity<List<Plans>> getPlans() {
		List<Plans> plans = planService.getPlans();
		return new ResponseEntity<List<Plans>>(plans, HttpStatus.OK);
	}

	
	 @GetMapping("/viewPlanById/{planId}") public ResponseEntity<?>
	 getPlans(@PathVariable("planId") int pid){ planService.getPlanById(pid); 
	 return new ResponseEntity<String>("Viewed Successfully",HttpStatus.OK); }
	

	@DeleteMapping("/deletePlan/{planId}")
	public ResponseEntity<?> deletePlan(@PathVariable("planId") int pid) {
		planService.deletePlan(pid);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}

	@PutMapping("/updatePlan/{planId}")
	public ResponseEntity<?> updatePlan(@PathVariable("planId") int pid, @RequestBody Plans plans) {
		planService.updatePlan(pid, plans);
		return new ResponseEntity<String>("Updated Successfully", HttpStatus.CREATED);
	}
}
