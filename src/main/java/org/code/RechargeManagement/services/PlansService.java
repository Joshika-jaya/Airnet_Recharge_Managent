package org.code.RechargeManagement.services;

import java.util.List;
import org.code.RechargeManagement.entities.Plans;

public interface PlansService {
	void insertPlan(Plans plans);
	List<Plans> getPlans();
	//void getPlan(int planId);
	void deletePlan(int planId);
	Plans getPlanById(int planId);
	void updatePlan(int planId,Plans plans);
}
