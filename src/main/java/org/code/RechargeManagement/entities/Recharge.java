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
	private String name;
	private String email;
	private int mobile;
	private int rechargePrice;
	private String rechargePlan;
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
	public String getRechargePlan() {
		return rechargePlan;
	}
	public void setRechargePlan(String rechargePlan) {
		this.rechargePlan = rechargePlan;
	}
}
