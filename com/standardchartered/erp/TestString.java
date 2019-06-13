package com.standardchartered.erp;

public class TestString {

	public static void main(String[] args) {
		String message = new String("Hello World");
		String welcomeMessage = "Hello World";
		String greetings = "Hello World";
		
		/*
		 * Do not use
		 */
		if(welcomeMessage == greetings) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
		
		/*
		 * use this instead
		 */
		if(welcomeMessage.equals(greetings)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
		
	}

}
