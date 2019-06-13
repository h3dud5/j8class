package com.standardchartered.erp;


abstract class Greeting {
	public abstract void sayHello();
	public void sayHi() {
		System.out.println("Hi World");
	}
}

class GreetingImpl extends Greeting {

	@Override
	public void sayHello() {
		System.out.println("Hello World from Greeting Impl");
		
	}
	
}

public class AnonymousClassDemo {

	public static void main(String[] args) {
		
		// Extending abstract class using anonymous class
		Greeting greeting = new Greeting(){

			@Override
			public void sayHello() {
				System.out.println("Hello World");
			}};
		
		greeting.sayHello();
		greeting.sayHi();
			
		GreetingImpl greetingImpl = new GreetingImpl();
		greetingImpl.sayHello();
		greetingImpl.sayHi();
	}

}
