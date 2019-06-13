package com.standardchartered.erp;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = {10, 20, 30, 40, 50};
		System.out.println("Length: " + prices.length);
		System.out.println("Value of the First Element: " + prices[0]);
		System.out.println("Value of the Last Element: " + prices[prices.length - 1]);
		
		for (int counter = 0; counter < prices.length; counter++) {
			System.out.println(prices[counter]);
		}
		
		System.out.println("----");
		
		for (int price : prices) {
			System.out.println(price);
		}
	}

}
