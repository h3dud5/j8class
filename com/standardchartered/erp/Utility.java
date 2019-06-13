package com.standardchartered.erp;

public class Utility {
	
	private int serialNumber = 0;
	
	public Utility() {
		serialNumber++;
	}
	
	public int getSerialNumber() {
		return serialNumber;
	}
	
	public static int increment(int x) {
		return x + 1;
	}
	
	
}
