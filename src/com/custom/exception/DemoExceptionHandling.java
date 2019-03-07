package com.custom.exception;

public class DemoExceptionHandling {

	void myMethod() {
		try {
			// throwing arithmetic exception using throw
			throw new ArithmeticException("Something went wrong!!");
		} catch (Exception exp) {
			System.out.println("Error: " + exp.getMessage());
		} finally {

			System.out.println("close");
		}
	}

	void sample() throws ArithmeticException,NullPointerException {
		// Statements
	}

	public static void main(String[] args) {

	}

}
