package org.code.RechargeManagement.repository;

import java.util.Optional;

import org.code.RechargeManagement.entities.Recharge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RechargeRepo extends JpaRepository<Recharge, Integer> {
	
	Optional<Recharge> findByRechargeValidity(String rechargeValidity);
	Optional<Recharge> findByRechargeValidityAndRechargePrice(String rechargeValidity,int rechargePrice);
	Recharge findByRechargeValidityOrRechargePrice(String rechargeValidity,int rechargePrice);
}
