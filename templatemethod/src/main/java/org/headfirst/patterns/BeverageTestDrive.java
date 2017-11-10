package org.headfirst.patterns;

/**
 * Created by mikhail on 01.11.17.
 */
public class BeverageTestDrive {

    public static void main(String[] args) {
        Tea tea = new Tea();
        System.out.println("---Making tea---");
        tea.prepareRecipe();

        System.out.println("\n---Making coffee---");
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
