package org.headfirst.patterns;

/**
 * Created by mikhail on 01.11.17.
 */
public class Tea extends CaffeineBeverage{

    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding lemon");
    }
}
