package org.code.RechargeManagement.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Addons {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int addonId;
	private String addonName;
	private String addonType;
	private int addonValidity;
	private String addonDescription;
	private int addonPrice;
	public int getAddonId() {
		return addonId;
	}
	public void setAddonId(int addonId) {
		this.addonId = addonId;
	}
	public String getAddonName() {
		return addonName;
	}
	public void setAddonName(String addonName) {
		this.addonName = addonName;
	}
	public String getAddonType() {
		return addonType;
	}
	public void setAddonType(String addonType) {
		this.addonType = addonType;
	}
	public int getAddonValidity() {
		return addonValidity;
	}
	public void setAddonValidity(int addonValidity) {
		this.addonValidity = addonValidity;
	}
	public String getAddonDescription() {
		return addonDescription;
	}
	public void setAddonDescription(String addonDescription) {
		this.addonDescription = addonDescription;
	}
	public int getAddonPrice() {
		return addonPrice;
	}
	public void setAddonPrice(int addonPrice) {
		this.addonPrice = addonPrice;
	}
}
