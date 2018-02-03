package com.junit.tutorial;


public class InvalidAccountTypeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 112412412312354325L;
	private String responseCode;

	public InvalidAccountTypeException(String msg, String responseCode) {
		super(msg);
		this.responseCode = responseCode;
	}

	public String getResponseCode() {
		return responseCode;
	}
}
