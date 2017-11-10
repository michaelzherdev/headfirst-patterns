package org.headfirst.patterns;

import org.headfirst.patterns.duck.DecoyDuck;
import org.headfirst.patterns.duck.MallardDuck;
import org.headfirst.patterns.duck.ModelDuck;
import org.headfirst.patterns.duck.RubberDuck;
import org.headfirst.patterns.fly.FlyRocketPowered;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck mallard = new MallardDuck();
		RubberDuck rubberDuckie = new RubberDuck();
		DecoyDuck decoy = new DecoyDuck();
 
		ModelDuck model = new ModelDuck();

		mallard.performQuack();
		rubberDuckie.performQuack();
		decoy.performQuack();
   
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
