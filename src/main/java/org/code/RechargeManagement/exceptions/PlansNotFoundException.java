package org.code.RechargeManagement.exceptions;

public class PlansNotFoundException extends RuntimeException{
	public PlansNotFoundException(String desc) {
		super(desc);
	}
}
