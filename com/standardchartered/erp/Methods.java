package com.standardchartered.erp;

public class Methods {
	
	public static int sum(int[] prices) {
		int result = 0;
		for (int price : prices) {
			result += price;
		}
		
		return result;
	}
	
	public static int sumALot(int... prices) {
		int result = 0;
		for (int price : prices) {
			result += price;
		}
		
		return result;
	}
	
	public static int[] sumAndAverage(int[] prices) {
		int result = 0;
		for (int price : prices) {
			result += price;
		}
		
		int[] returnValues = {result, result / prices.length};
		return returnValues;
		
	}

	public static double simpleInterest(double principal, int period){
		return simpleInterest(principal, period, 10);
	}
	
	public static double simpleInterest(double principal, int period, double rate){
		double result = (principal * period * rate) / 100;
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		simpleInterest(1000, 1, 10);
	
			try {
				System.out.println(args[0]);
				System.out.println(args[1]);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("No Parameters");
			}
		
		
		double principal = 1000;
		int period = 1;
		double rate = 10;
		
		double interest = simpleInterest(principal, period, rate);
		System.out.println("Principal Amount: " + principal);
		System.out.println("Interest Amount: " + interest);
		System.out.println("Total Amount: " + (principal + interest));
		
		
		System.out.println(sum(new int[]{10, 20, 30, 40, 50}));
		
		int[] result = sumAndAverage(new int[] {10, 20, 30, 40, 50});
		System.out.println(result[0] + " " + result[1]);
		
		System.out.println(sumALot(10, 20));
		System.out.println(sumALot(10, 20, 30));
		
	}

}
