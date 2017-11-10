package org.headfirst.patterns.duck;

import org.headfirst.patterns.fly.FlyNoWay;
import org.headfirst.patterns.quack.Quack;

public class ModelDuck extends Duck {
	public ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}

	public void display() {
		System.out.println("I'm a model duck");
	}
}
