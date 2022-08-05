package org.code.RechargeManagement.exceptions;


public class UserNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String execep) {
		super(execep);
	}
}
