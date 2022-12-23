package com.csmtech.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@ControllerAdvice
public class MyCustomExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = ArithmeticException.class)
	public ResponseEntity<Object> handelAnyException(Exception ex) {
		return new ResponseEntity<Object>(ex.getLocalizedMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
