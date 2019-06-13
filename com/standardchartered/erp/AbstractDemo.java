package com.standardchartered.erp;

public abstract class AbstractDemo {

	protected String message;
	
	public void sayHello() {
		System.out.println("Hello " + message);
	}
	
	public abstract void sayHi();
}
