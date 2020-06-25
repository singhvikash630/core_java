package com.jspider.jdk8.lamdas;

public class LamdasDemo {
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		LamdasDemo demo = new LamdasDemo();

		Greeting greeting = new GreetingImpl();// created new class
		Greeting Lamdagreeting = () -> System.out.println("Hello World!");// created a lamada expression inline

		// Annonymous inner class is not same as Lamadas expression
		Greeting innerClassGreeting = new Greeting() {

			@Override
			public void perform() {
				System.out.println("Hello World!");

			}
		};

		demo.greet(greeting);
		demo.greet(Lamdagreeting);
		demo.greet(innerClassGreeting);
	}

}
