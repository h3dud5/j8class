package com.standardchartered.erp;

public class MethodInnerClassDemo {

	
	public void display() {
		
		String message = "Java 12";
		
		class InnerClass {
			public void print() {
				System.out.println("Hello World " + message);
			}
		}
		
		InnerClass innerClass = new InnerClass();
		innerClass.print();
	}
	
	public static void main(String...strings) {
		
		MethodInnerClassDemo methodInnerClassDemo = new MethodInnerClassDemo();
		methodInnerClassDemo.display();
	}
}
