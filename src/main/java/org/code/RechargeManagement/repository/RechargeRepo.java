package org.code.RechargeManagement.repository;

import java.util.Optional;

import org.code.RechargeManagement.entities.Recharge;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RechargeRepo extends JpaRepository<Recharge, Integer> {
	
	Optional<Recharge> findByRechargePlan(String rechargePlan);
	Optional<Recharge> findByRechargePlanAndRechargeType(String rechargePlan,String rechargeType);
	Recharge findByRechargePlanOrRechargeType(String rechargePlan,String rechargeType);
}
