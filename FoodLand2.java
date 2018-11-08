/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author christopher.lewis
 */
public class FoodLand {
         final static int NIBBLE = 5;
        final static int MEGABITE = 45;
        
    public static void main(String[] args){

        Donut firstDonut;
        firstDonut = new Donut();
        
        firstDonut.name = "Chris";
        
        // pass our Donut referenced by firstDonut to printObjectData
        printObjectData(firstDonut);
        
        // follow same pattern to make a Burger object
        Burger firstBurger;
        firstBurger = new Burger();
        firstBurger.containsCheese = false;
       
        
        printObjectData2(firstBurger);
        
        // now eat some of each donut and print out the stats
        System.out.println("Eating " + firstDonut.name);
        System.out.println("Nibble...");
        firstDonut.simulateEating(NIBBLE);
        System.out.println("Nibble...");
        firstDonut.simulateEating(NIBBLE);
        System.out.println("Taking megaBite...");
        firstDonut.simulateEating(MEGABITE);
        printObjectData(firstDonut);
        
       
        System.out.println("Eating " + firstBurger);
        System.out.println("Taking lots of megaBites");
        int numCalls = 10;
        for(int i = 0; i < numCalls; i++){
            System.out.println("gnam gnam");firstBurger.simulateEating(MEGABITE);
        }
        
        printObjectData2(firstBurger);
        
    } // close main
    
    private static void printObjectData(Donut inputDonut){
        System.out.println("|-------STATS--------|");
        System.out.println("| Name: " + inputDonut.name);
        System.out.println("| PercRemaining: " + inputDonut.getPercRemaining());
        System.out.println("|--------------------|");
    }
    
         private static void printObjectData2(Burger inputBurger){
        System.out.println("|-------STATS--------|");
        
        System.out.println("| PercRemaining: " + inputBurger.getPercRemaining());
        System.out.println("|--------------------|");
    } // close printObjectData method
} // close class


