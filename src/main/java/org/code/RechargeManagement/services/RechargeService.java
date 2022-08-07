package org.code.RechargeManagement.services;

import java.util.List;

import org.code.RechargeManagement.entities.Recharge;


public interface RechargeService {
	void insertRecharge(Recharge recharge);
	List<Recharge> getRecharge();
	void deleteRecharge(int rechargeId);
	/*Recharge getRecharge(int rechargeId);
	void updateRecharge(int rechargeId,Recharge recharge);*/
}
