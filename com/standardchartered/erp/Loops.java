package com.standardchartered.erp;

public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int counter = 1; counter <= 12; counter++) {
			System.out.println(counter + " x 5 = " + counter * 5);
		}
		
		System.out.println();
		
		int counter = 1;
		while (counter <= 12) {
			System.out.println(counter + " x 5 = " + counter * 5);
			counter++;
		}
		
		System.out.println();
		
		counter = 1;
		do {
			System.out.println(counter + " x 5 = " + counter * 5);
			counter++;
		} while (counter <= 12);
	}

}
