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
import org.code.RechargeManagement.entities.Recharge;
import org.code.RechargeManagement.services.RechargeService;

@RestController
@RequestMapping("/admin")
public class RechargeController {
	
	@Autowired
	private RechargeService rechargeService;
	
	@PostMapping("/addRecharge")
	public ResponseEntity<?> insertRecharge(@RequestBody Recharge rechargeId){
		rechargeService.insertRecharge(rechargeId);
		return new ResponseEntity<String>("Inserted Successfully",HttpStatus.CREATED);
	}
	
	@GetMapping("/viewRecharge")
	public ResponseEntity<List<Recharge>> getRecharge(){
		List<Recharge> recharge=rechargeService.getRecharge();
		return new ResponseEntity<List<Recharge>>(recharge, HttpStatus.OK);
	}
	
	/*@GetMapping("/viewRechargeById/{rechargeId}")
	public ResponseEntity<?> getRecharge(@PathVariable("rechargeId") int rid){
		rechargeService.getRecharge(rid);
		return new ResponseEntity<String>("Viewed Successfully",HttpStatus.OK);
	}*/
	
	@DeleteMapping("/deleteRecharge/{rechargeId}")
	public ResponseEntity<?> deleteRecharge(@PathVariable("rechargeId") int rechargeId){
		rechargeService.deleteRecharge(rechargeId);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
	}

	@PutMapping("/update/{rechargeId}")
	public ResponseEntity<?> updateRecharge(@PathVariable("rechargeId") int rechargeId,@RequestBody Recharge recharge){
		rechargeService.updateRecharge(rechargeId,recharge);
		return new ResponseEntity<String>("Updated Successfully",HttpStatus.CREATED);
	}
}
