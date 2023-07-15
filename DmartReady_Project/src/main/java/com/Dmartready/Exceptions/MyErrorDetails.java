package com.Dmartready.Exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class MyErrorDetails {
	
	private String message;
	
	private LocalDateTime timeStamp;
	
	private String descrption;

}
