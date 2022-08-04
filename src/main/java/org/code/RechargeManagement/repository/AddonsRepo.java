package org.code.RechargeManagement.repository;

import java.util.Optional;

import org.code.RechargeManagement.entities.Addons;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddonsRepo extends JpaRepository<Addons, Integer> {
	Optional<Addons> findByAddonName(String addonName);
	Optional<Addons> findByAddonNameAndAddonType(String addonName,String addonType);
	Addons findByAddonNameOrAddonType(String addonName,String addonType);
}
