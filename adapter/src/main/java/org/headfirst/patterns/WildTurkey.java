package org.headfirst.patterns;

/**
 * Created by mikhail on 01.11.17.
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I`m flying a short distance");
    }
}
