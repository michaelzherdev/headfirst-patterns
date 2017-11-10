package org.headfirst.patterns.duck;

import org.headfirst.patterns.fly.FlyWithWings;
import org.headfirst.patterns.quack.Quack;

public class MallardDuck extends Duck {
 
	public MallardDuck() {
 
		quackBehavior = new Quack();
                flyBehavior = new FlyWithWings();
 

	}
 
	public void display() {
		System.out.println("I'm a real Mallard duck");
	}
}
