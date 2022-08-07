package org.code.RechargeManagement.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.code.RechargeManagement.entities.Plans;
import org.code.RechargeManagement.exceptions.PlansNotFoundException;
import org.code.RechargeManagement.repository.PlansRepo;



@Service
@Transactional
public class PlansServiceImpl implements PlansService {

	@Autowired
	private PlansRepo plansRepo;
	@Override
	public void insertPlan(Plans plans) {
		// TODO Auto-generated method stub
		plansRepo.save(plans);
	}

	@Override
	public List<Plans> getPlans() {
		// TODO Auto-generated method stub
		return plansRepo.findAll();
	}

	@Override
	public void deletePlan(int planId) {
		// TODO Auto-generated method stub
		plansRepo.deleteById(planId);
	}

	@Override
	public Plans getPlanById(int planId) {
		// TODO Auto-generated method stub
		return plansRepo.findById(planId).orElseThrow(()->new PlansNotFoundException("Plan not found"));
	}

	@Override
	public void updatePlan(int planId, Plans plans){
		// TODO Auto-generated method stub
		Plans plan2=plansRepo.findById(planId).orElseThrow(()->new PlansNotFoundException("Plan not found"));
		plan2.setPlanName(plans.getPlanName());
		plan2.setPlanType(plans.getPlanType());
		plan2.setPlanDescription(plans.getPlanDescription());
		plan2.setPlanValidity(plans.getPlanValidity());
		plan2.setPlanPrice(plans.getPlanPrice());
	}

}
