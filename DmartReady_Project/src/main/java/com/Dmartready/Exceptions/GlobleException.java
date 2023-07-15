package com.Dmartready.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import com.Dmartready.Models.Stocks;

@ControllerAdvice
public class GlobleException {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> exceptions(Exception e, WebRequest web){
		MyErrorDetails errorDetails = new MyErrorDetails();
		errorDetails.setMessage(e.getMessage());
		errorDetails.setTimeStamp(LocalDateTime.now());
		errorDetails.setDescrption(web.getDescription(true));
		return new ResponseEntity<MyErrorDetails>(errorDetails,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> noHandlerFoundException(NoHandlerFoundException e, WebRequest web){
		MyErrorDetails errorDetails = new MyErrorDetails();
		errorDetails.setMessage(e.getMessage());
		errorDetails.setTimeStamp(LocalDateTime.now());
		errorDetails.setDescrption(web.getDescription(true));
		return new ResponseEntity<MyErrorDetails>(errorDetails,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetails> methodArgumentNotValidException(MethodArgumentNotValidException e, WebRequest web){
		MyErrorDetails errorDetails = new MyErrorDetails();
		errorDetails.setMessage(e.getMessage());
		errorDetails.setTimeStamp(LocalDateTime.now());
		errorDetails.setDescrption(web.getDescription(true));
		return new ResponseEntity<MyErrorDetails>(errorDetails,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(Stock_Exceptions.class)
	public ResponseEntity<MyErrorDetails> stockExceptions(Stock_Exceptions e, WebRequest web){
		MyErrorDetails errorDetails = new MyErrorDetails();
		errorDetails.setMessage(e.getMessage());
		errorDetails.setTimeStamp(LocalDateTime.now());
		errorDetails.setDescrption(web.getDescription(true));
		return new ResponseEntity<MyErrorDetails>(errorDetails,HttpStatus.BAD_GATEWAY);
	}
	
	@ExceptionHandler(Store_Location_Exception.class)
	public ResponseEntity<MyErrorDetails> StoreLocationException(Store_Location_Exception e, WebRequest web){
		MyErrorDetails errorDetails = new MyErrorDetails();
		errorDetails.setMessage(e.getMessage());
		errorDetails.setTimeStamp(LocalDateTime.now());
		errorDetails.setDescrption(web.getDescription(true));
		return new ResponseEntity<MyErrorDetails>(errorDetails,HttpStatus.BAD_GATEWAY);
	}
	@ExceptionHandler(Stock_Movement_Exception.class)
	public ResponseEntity<MyErrorDetails> StockMovementException(Stock_Movement_Exception e, WebRequest web){
		MyErrorDetails errorDetails = new MyErrorDetails();
		errorDetails.setMessage(e.getMessage());
		errorDetails.setTimeStamp(LocalDateTime.now());
		errorDetails.setDescrption(web.getDescription(true));
		return new ResponseEntity<MyErrorDetails>(errorDetails,HttpStatus.BAD_GATEWAY);
	}


}
