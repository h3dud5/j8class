package com.standardchartered.erp;

public class TestUtility {

	public static void main(String[] args) {
		
		int speed = 100;
		//Utility utility = new Utility();
		//speed = utility.increment(speed);

		// as static/class method
		//speed = Utility.increment(speed);
		
		Utility utility = new Utility();
		utility = new Utility();
		utility = new Utility();
		utility = new Utility();
		utility = new Utility();
		
		System.out.println(utility.getSerialNumber());
	}

}
