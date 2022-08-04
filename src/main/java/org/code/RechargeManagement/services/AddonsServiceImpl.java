package org.code.RechargeManagement.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.code.RechargeManagement.entities.Addons;
import org.code.RechargeManagement.exceptions.AddonsNotFoundException;
import org.code.RechargeManagement.repository.AddonsRepo;

@Service
@Transactional
public class AddonsServiceImpl implements AddonsService {

	@Autowired
	private AddonsRepo addonsRepo;
	
	@Override
	public void insertAddons(Addons addons) {
		// TODO Auto-generated method stub
		addonsRepo.save(addons);
	}

	@Override
	public List<Addons> getAddons() {
		// TODO Auto-generated method stub
		return addonsRepo.findAll();
	}

	@Override
	public void deleteAddons(int addonId) {
		// TODO Auto-generated method stub
		addonsRepo.deleteById(addonId);
	}

	@Override
	public Addons getAddons(int addonId) {
		// TODO Auto-generated method stub
		return addonsRepo.findById(addonId).orElseThrow(()->new AddonsNotFoundException("Addon not found"));
	}

	@Override
	public void updateAddons(int addonId, Addons addons) {
		// TODO Auto-generated method stub
		Addons addon2=addonsRepo.findById(addonId).orElseThrow(()->new AddonsNotFoundException("Addon not found"));
		addon2.setAddonName(addons.getAddonName());
		addon2.setAddonType(addons.getAddonType());
		addon2.setAddonDescription(addons.getAddonDescription());
		addon2.setAddonValidity(addons.getAddonValidity());
		addon2.setAddonPrice(addons.getAddonPrice());
		addonsRepo.save(addon2);
	}

}

