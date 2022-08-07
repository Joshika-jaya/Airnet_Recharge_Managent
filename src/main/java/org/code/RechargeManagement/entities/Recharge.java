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
public class Recharge {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rechargeId;
	private String rechargeType;
	private int rechargePrice;
	private String rechargeValidity;
	private String rechargeName;
	private String rechargeDescription;
	private String name;
	private String email;
	private int mobile;
	
	public int getRechargeId() {
		return rechargeId;
	}
	public void setRechargeId(int rechargeId) {
		this.rechargeId = rechargeId;
	}
	public String getRechargeType() {
		return rechargeType;
	}
	public void setRechargeType(String rechargeType) {
		this.rechargeType = rechargeType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public int getRechargePrice() {
		return rechargePrice;
	}
	public void setRechargePrice(int rechargePrice) {
		this.rechargePrice = rechargePrice;
	}
	public String getRechargeValidity() {
		return rechargeValidity;
	}
	public void setRechargeValidity(String rechargeValidity) {
		this.rechargeValidity = rechargeValidity;
	}
	public String getRechargeName() {
		return rechargeName;
	}
	public void setRechargeName(String rechargeName) {
		this.rechargeName = rechargeName;
	}
	public String getRechargeDescription() {
		return rechargeDescription;
	}
	public void setRechargeDescription(String rechargeDescription) {
		this.rechargeDescription = rechargeDescription;
	}
}
