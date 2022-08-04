package org.code.RechargeManagement.services;

import java.util.List;
import org.code.RechargeManagement.entities.Addons;

public interface AddonsService {	
	void insertAddons(Addons addons);
	List<Addons> getAddons();
	void deleteAddons(int addonId);
	Addons getAddons(int addonId);
	void updateAddons(int addonId,Addons addons);
}
