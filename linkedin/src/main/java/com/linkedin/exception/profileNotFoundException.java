package com.linkedin.exception;

public class profileNotFoundException extends Exception {
	String message;
	
	public profileNotFoundException(String message){
		this.message=message; //point to global variable	
	}
	
	public String toString() {
		return message;
	}

}
