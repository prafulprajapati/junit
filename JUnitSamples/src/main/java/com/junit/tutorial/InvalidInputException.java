package com.junit.tutorial;


public class InvalidInputException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 112412412312354325L;

	private final String responseCode;

	public InvalidInputException(String msg, String responseCode) {
		super(msg);
		this.responseCode = responseCode;
	}

	public String getResponseCode() {
		return responseCode;
	}
}
