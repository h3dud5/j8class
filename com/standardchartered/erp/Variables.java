package com.standardchartered.erp;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte participants = 15;
		short coursefee = 1500;
		int quantity = 10;
		long countrybudget = 10000L;
		float productprice = 10.5f;
		double price = 125.5;
		boolean isCitizent = true;
		boolean isForeigner = false;
		char alphabet = 'a';
		
		System.out.println("Participants " + participants);
		
		final double pi = 3.14;
		final int tax = 6;
		
		System.out.println("Quantity " + quantity++);
		System.out.println("Quantity " + quantity);
		System.out.println("Quantity " + ++quantity);
		quantity =  10 << 2;
		System.out.println("Quantity " + quantity);
	}

}
