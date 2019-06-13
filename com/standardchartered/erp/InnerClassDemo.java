package com.standardchartered.erp;

//Nested Class
class OuterClass{
	
	// Inner Class
	public class InnerClass{
		
		public void doPrint() {
			System.out.println("Inner Class: doPrint Method");
		}
	}
	
	public void display() {
		System.out.println("Outer Class: display Method");
		InnerClass innerClass = new InnerClass();
		innerClass.doPrint();
	}
}

public class InnerClassDemo {
	
	private int price = 10;
	
	private class InsideInnerClass {
		public void doPrintMe() {
			System.out.println("InsideInner: doPrint Method -> " + price);
		}
	}
	public static void main(String...strings) {
		OuterClass outerClass = new OuterClass();
		outerClass.display();
		
		InnerClassDemo innerClassDemo = new InnerClassDemo();
		InsideInnerClass insideInnerClass = innerClassDemo.new InsideInnerClass();
		insideInnerClass.doPrintMe();
		
		
		OuterClass.InnerClass ic = outerClass.new InnerClass();
		
		
	}
	
}
