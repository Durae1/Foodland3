/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christopher.lewis
 */
public class DonutLand {

    public static void main(String[] args) {
        final int firstBiteSize = 17;

        Donut firstDonut;

        firstDonut = new Donut();

        firstDonut.name = "Cina";
        firstDonut.flavor = "Cinnamon";
        firstDonut.color = "Brown";

        System.out.println("When first created," + firstDonut.name + "'s/n"
                + "percent remaining is " + firstDonut.getPercRemaining());
        System.out.println("The flavor is " + firstDonut.flavor);

        System.out.println("The color is " + firstDonut.color);

        Donut secondDonut;

        final int secondBiteSize = 20;

        secondDonut = new Donut();

        secondDonut.name = "Gary";
        secondDonut.flavor = "Powder";
        secondDonut.color = "White";

        System.out.println("When first created," + secondDonut.name + "'s/n"
                + "percent remaining is " + secondDonut.getPercRemaining());

        System.out.println("The flavor is " + secondDonut.flavor);
        System.out.println("The color is " + secondDonut.color);

        printDivider();

        System.out.println("Calling simulateEating and passing in/n"
                + "a bite size of " + firstBiteSize);
        printDivider();

        firstDonut.simulateEating(firstBiteSize);

        System.out.println(" After being eaten" + firstDonut.name + "'s/n"
                + "percent reamaining is " + firstDonut.getPercRemaining());

        System.out.println("Calling simulateEating and passing in/n"
                + "a bite size of " + secondBiteSize);

        secondDonut.simulateEating(secondBiteSize);

        System.out.println(" After being eaten" + secondDonut.name + "'s/n"
                + "percent reamaining is " + secondDonut.getPercRemaining());

    } //close main

    private static void printDivider() {
        System.out.println(".......................................");

    }

}
