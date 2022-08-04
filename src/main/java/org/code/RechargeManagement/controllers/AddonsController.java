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

import org.code.RechargeManagement.entities.Addons;
import org.code.RechargeManagement.services.AddonsService;

@RestController
@RequestMapping("/admin")
public class AddonsController {
	
	@Autowired
	private AddonsService addonsService;
	
	@PostMapping("/addAddon")
	public ResponseEntity<?> insertAddons(@RequestBody Addons addonId){
		addonsService.insertAddons(addonId);
		return new ResponseEntity<String>("Inserted Successfully",HttpStatus.CREATED);
	}
	
	
	@GetMapping("/viewAddon")
	public ResponseEntity<List<Addons>> getAddons(){
		List<Addons> addons=addonsService.getAddons();
		return new ResponseEntity<List<Addons>>(addons, HttpStatus.OK);
	}
	
	/*@GetMapping("/viewAddonById/{addonId}")
	public ResponseEntity<?> getAddons(@PathVariable("addonId") int aid){
		addonsService.getAddons(aid);
		return new ResponseEntity<String>("Viewed Successfully",HttpStatus.OK);
	}*/
	
	@DeleteMapping("/deleteAddon/{addonId}")
	public ResponseEntity<?> deleteAddons(@PathVariable("addonId") int addonId){
		addonsService.deleteAddons(addonId);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
	}

	@PutMapping("/updateAddon/{addonId}")
	public ResponseEntity<?> updateAddon(@PathVariable("addonId") int addonId,@RequestBody Addons addons){
		addonsService.updateAddons(addonId,addons);
		return new ResponseEntity<String>("Updated Successfully",HttpStatus.CREATED);
	}
}
