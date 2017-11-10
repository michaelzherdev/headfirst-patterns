package org.headfirst.patterns;

import org.headfirst.patterns.duck.Duck;
import org.headfirst.patterns.duck.MallardDuck;
import org.headfirst.patterns.duck.ModelDuck;
import org.headfirst.patterns.fly.FlyRocketPowered;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
