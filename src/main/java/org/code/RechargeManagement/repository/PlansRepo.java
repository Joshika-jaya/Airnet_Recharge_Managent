package org.code.RechargeManagement.repository;

import java.util.Optional;

import org.code.RechargeManagement.entities.Plans;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlansRepo extends JpaRepository<Plans, Integer> {
	
	Optional<Plans> findByPlanName(String planName);
	Optional<Plans> findByPlanNameAndPlanType(String planName,String planType);
	Plans findByPlanNameOrPlanType(String planName,String planType);
}
