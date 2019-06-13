package com.standardchartered.erp;

public class AbstractDemoTester {

	public static void main(String[] args) {

		AbstractDemo abstractDemo = new AbstractDemoChild("World");
		//abstractDemo.message = "World";
		abstractDemo.sayHello();
	}

}
