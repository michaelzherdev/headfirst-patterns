package org.headfirst.patterns;

/**
 * Created by mikhail on 01.11.17.
 */
public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says: ");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says: ");
        testDuck(duck);

        System.out.println("\nThe Turkey Adapter says:");
        testDuck(turkeyAdapter);

    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
