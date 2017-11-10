package org.headfirst.patterns.example2;

import java.rmi.Naming;

public class GumballMachineTestDrive {

	public static void main(String[] args) {
//		GumballMachine gumballMachine = new GumballMachine("Tula", 5);
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
//
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//		gumballMachine.insertQuarter();
//		gumballMachine.turnCrank();
//
//		System.out.println(gumballMachine);
		GumballMachineRemote gumballMachine = null;
		int count;
		try{
			count = Integer.parseInt(args[1]);
			gumballMachine = new GumballMachine(args[0], count);
			Naming.bind("//" + args[0] + "/gumballmachine", gumballMachine);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
