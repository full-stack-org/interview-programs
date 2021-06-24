package com.interview.preparation;

public class CustomException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -706339475746296863L;
	
	public CustomException(String message) {
		super(message);
	}
	
	public CustomException(String message,Throwable throwable) {
		super(message,throwable);
	}
	

}
