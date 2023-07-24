package com.cgi.b3;

// Exception class
public class NegativeNumberException extends Exception {
	NegativeNumberException(String message, Integer x){
	
		super( message + " "+ x);
	}

}
