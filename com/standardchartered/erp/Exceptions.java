package com.standardchartered.erp;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prices[] = {10, 20, 30, 40, 50};
		
		try {
			System.out.println(prices[5]);
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			//ex.printStackTrace();
			System.out.println("Invalid index access");
		}
	}

}
