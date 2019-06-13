package com.standardchartered.erp;

public class StaticInnerClassDemo {

	// declaring it as static means it is instantiated only once
	static class InnerClass {
		public int counter;
		public void doPrint() {
			counter++;
			System.out.println("Hello " + counter);
		}
		
	}
	
	public static void main(String...strings) {
		
		StaticInnerClassDemo.InnerClass staticInnerClassDemo = new StaticInnerClassDemo.InnerClass();
		staticInnerClassDemo.doPrint();
		
		StaticInnerClassDemo.InnerClass staticInnerClassDemo1  = staticInnerClassDemo;
		System.out.println(staticInnerClassDemo == staticInnerClassDemo1);
		staticInnerClassDemo1.doPrint();
		
		StaticInnerClassDemo.InnerClass staticInnerClassDemo2 = new StaticInnerClassDemo.InnerClass();
		staticInnerClassDemo2.doPrint();
		System.out.println(staticInnerClassDemo == staticInnerClassDemo2);
	}
}
