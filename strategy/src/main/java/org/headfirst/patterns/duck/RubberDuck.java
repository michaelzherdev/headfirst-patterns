package org.headfirst.patterns.duck;

import org.headfirst.patterns.fly.FlyNoWay;
import org.headfirst.patterns.quack.Squeak;

public class RubberDuck extends Duck {
 
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}
 
	public void display() {
		System.out.println("I'm a rubber duckie");
	}
}
