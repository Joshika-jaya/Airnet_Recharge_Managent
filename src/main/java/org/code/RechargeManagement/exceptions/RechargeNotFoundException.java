package org.code.RechargeManagement.exceptions;

public class RechargeNotFoundException extends RuntimeException{
	public RechargeNotFoundException(String desc) {
		super(desc);
	}
}
