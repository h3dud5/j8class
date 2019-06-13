package com.standardchartered.erp;

public class Conditions {

	public static void main(String[] args) {
		
		boolean isSST = true;
		double price = 10;
		double result = (isSST == true) ? price + (price * 0.06) : price;
		System.out.println("Result = " + result);
		System.out.println();
		
		int givenNumber = 10;
		if (givenNumber > 0) {
			System.out.println("Positive Number");
		} else if (givenNumber == 0) {
			System.out.println("Equals to Zero");
		} else {	
			System.out.println("Negative Number");
		}

		
		
		
	}
	

}
