package com.custom.exception;


public class RuntimeCustomException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public RuntimeCustomException() {
		super();
	}

	public RuntimeCustomException(String message) {
		super(message);
	}

	public RuntimeCustomException(String message, Throwable cause) {
		super(message, cause);
	}

	public RuntimeCustomException(Throwable cause) {
		super(cause);
	}
}


