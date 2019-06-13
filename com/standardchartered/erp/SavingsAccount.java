package com.standardchartered.erp;

public class SavingsAccount implements IAccount, ICard {

	private double openingBalance;
	private double closingBalance;
	private String cardNumber;
	private int cvvNumber;
	
	
	public double getOpeningBalance() {
		return openingBalance;
	}
	public void setOpeningBalance(double openingBalance) {
		this.openingBalance = openingBalance;
	}
	public double getClosingBalance() {
		return closingBalance;
	}
	public void setClosingBalance(double closingBalance) {
		this.closingBalance = closingBalance;
	}
	
	public double withdraw(double amount) {
		return this.closingBalance - amount;
	}
	
	public double bankin(double amount) {
		return this.closingBalance + amount;
	}
	@Override
	public String getCardNumber() {
		return this.cardNumber;
	}
	@Override
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
		
	}
	@Override
	public int getCvvNumber() {
		return this.cvvNumber;
	}
	@Override
	public void setCvvNumber(int cvvNumber) {
		this.cvvNumber = cvvNumber;
	}
}
