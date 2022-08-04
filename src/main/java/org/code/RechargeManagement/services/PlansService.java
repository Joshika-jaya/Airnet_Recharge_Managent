package org.code.RechargeManagement.services;

import java.util.List;
import org.code.RechargeManagement.entities.Plans;

public interface PlansService {
	void insertPlans(Plans plans);
	List<Plans> getPlans();
	void deletePlans(int planId);
	Plans getPlans(int planId);
	void updatePlans(int planId,Plans plans);
}
