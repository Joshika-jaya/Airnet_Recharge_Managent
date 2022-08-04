package org.code.RechargeManagement.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.code.RechargeManagement.entities.Recharge;
import org.code.RechargeManagement.exceptions.RechargeNotFoundException;
import org.code.RechargeManagement.repository.RechargeRepo;

@Service
@Transactional
public class RechargeServiceImpl implements RechargeService {

	@Autowired
	private RechargeRepo rechargeRepo;
	
	@Override
	public void insertRecharge(Recharge recharge) {
		// TODO Auto-generated method stub
		rechargeRepo.save(recharge);
	}

	@Override
	public List<Recharge> getRecharge() {
		// TODO Auto-generated method stub
		return rechargeRepo.findAll();
	}

	@Override
	public void deleteRecharge(int rechargeId) {
		// TODO Auto-generated method stub
		rechargeRepo.deleteById(rechargeId);

	}

	@Override
	public Recharge getRecharge(int rechargeId) {
		// TODO Auto-generated method stub
		return rechargeRepo.findById(rechargeId).orElseThrow(()->new RechargeNotFoundException("Recharge not found"));
	}

	@Override
	public void updateRecharge(int rechargeId, Recharge recharge) {
		// TODO Auto-generated method stub
		Recharge recharge2=rechargeRepo.findById(rechargeId).orElseThrow(()->new RechargeNotFoundException("Recharge not found"));
		recharge2.setRechargeType(recharge.getRechargeType());
		recharge2.setRechargePlan(recharge.getRechargePlan());
		recharge2.setName(recharge.getName());
		recharge2.setEmail(recharge.getEmail());
		recharge2.setMobile(recharge.getMobile());
		recharge2.setRechargePrice(recharge.getRechargePrice());
		rechargeRepo.save(recharge2);
	}

}
