package com.standardchartered.erp;

public interface IAccount {

	
	public double getOpeningBalance();
	
	public void setOpeningBalance(double amount);
	
	public double getClosingBalance();
	
	public void setClosingBalance(double amount);
	
	public double withdraw(double amount);
	
	public double bankin(double amount);
	
		
}
