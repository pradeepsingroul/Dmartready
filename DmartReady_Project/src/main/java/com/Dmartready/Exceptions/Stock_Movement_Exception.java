package com.Dmartready.Exceptions;

public class Stock_Movement_Exception extends RuntimeException{

	public Stock_Movement_Exception() {
		
	}
	public Stock_Movement_Exception(String message) {
		super(message);
	}
}
