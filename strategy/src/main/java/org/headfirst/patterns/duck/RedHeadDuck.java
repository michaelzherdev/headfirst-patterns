package org.headfirst.patterns.duck;

import org.headfirst.patterns.fly.FlyWithWings;
import org.headfirst.patterns.quack.Quack;

public class RedHeadDuck extends Duck {
 
	public RedHeadDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
 
	public void display() {
		System.out.println("I'm a real Red Headed duck");
	}
}
