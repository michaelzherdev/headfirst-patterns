package org.headfirst.patterns.quack;

public class FakeQuack implements QuackBehavior {
	public void quack() {
		System.out.println("Qwak");
	}
}
