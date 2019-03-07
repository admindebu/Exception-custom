package com.custom.exception;

public class DemoClass {
	
	public static void main(String[] args) {
		
		try {
			
			throw new MyCustomException("I am sending exception");
			
		} catch (MyCustomException mce) {
			System.out.println("I have Caught my custom exception");
			mce.printStackTrace();
			//System.out.println(mce.getMessage());
			
		}
	}

}
