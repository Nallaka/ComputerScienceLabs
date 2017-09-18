package me.nallaka.ComputerScienceLabs.StringInputLab;

import java.util.Scanner;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 9/13/2017
 * @dueDate: 9/17/2017
 * Purpose: Take Inputs, do calculations with data, and print out results
 * Methods: main
 */
public class NallakaMStringInputLab {
    /**
     * @Name: main
     * Purpose: Take in inputs and return outputs
     * Input: Strings, Doubles, and Ints
     * Return: None
     */
    public static void main(String[] args) {
        /*
        Lab 1
        */

        //Scanner object
        Scanner scanner = new Scanner(System.in);

        //Taking Inputs
        System.out.println("Lab #1: \n");
        System.out.println("Enter your city's name (Ex. Brentwood, TN):");
        String cityName = scanner.nextLine();
        System.out.println("Type today's date (Ex. 09/24/2017):");
        String date = scanner.nextLine();
        System.out.println("Enter the rainfall (In inches) on this day for the last 5 years (Ex. 5.0 6.5 7.3 8.0 4.2):");

        double totalRain = 0;
        double numberOfTotalRainData = 0;

        for (int i = 0; i < 5; i++) {
            totalRain = totalRain + scanner.nextDouble();
            numberOfTotalRainData++;
        }

        double averageRain = totalRain/numberOfTotalRainData;

        System.out.println("Print the high temperature (In degrees fahrenheit) on this day for the last 5 years (Ex. 50 65 43 60 42):");

        double totalHighTemperature = 0;
        double numberOfTotalHighTemperatureData = 0;

        for (int i = 0; i < 5; i++) {
            totalHighTemperature = totalHighTemperature + scanner.nextDouble();
            numberOfTotalHighTemperatureData++;
        }

        double averageHighTemperature = totalHighTemperature/numberOfTotalHighTemperatureData;

        System.out.println("Print the low temperature (In degrees fahrenheit) on this day for the last 5 years (Ex. 20 35 33 40 22):");

        double totalLowTemperature = 0;
        double numberOfTotalLowTemperatureData = 0;

        for (int i = 0; i < 5; i++) {
            totalLowTemperature = totalLowTemperature + scanner.nextDouble();
            numberOfTotalLowTemperatureData++;
        }

        double averageLowTemperature = totalLowTemperature/numberOfTotalLowTemperatureData;

        //Printing Data for Lab 1
        System.out.println("\nYour city's name is: " + cityName);
        System.out.println("Today's date is: " + date);
        System.out.println("The average rainfall in your area for the last 5 years is: " + averageRain + " in.");
        System.out.println("The average high temperature in your area for the last 5 years is: " + averageHighTemperature + " deg.");
        System.out.println("The average low temperature in your area for the last 5 years is: " + averageLowTemperature + " deg");

        /*
        * Lab 2
        */

        System.out.println("\nLab 2: \n");

        //Scanner Object
        Scanner scanner1 = new Scanner(System.in);

        //Taking Inputs
        System.out.println("Type a full name (Ex. Richard S. Devinstand): ");
        String name1 = scanner1.nextLine();
        System.out.println("Type a second full name (Ex. Richard S. Devinstand): ");
        String name2 = scanner1.nextLine();

        //Name 1 Formatting
        String name1Name = (name1.substring(name1.lastIndexOf(" ") + 1, name1.length()) + ", " +  name1.substring(0,name1.indexOf(" ")) + name1.substring(name1.indexOf(" "), name1.lastIndexOf(" ") - 1) + ".");
        String name1Name2 = (name1.substring(name1.lastIndexOf(" ") + 1, name1.length()) + ", " + name1.substring(0,1) + "." + name1.substring(name1.indexOf(" ") + 1, name1.indexOf(" ") + 2)) + ".";
        String name1Name3 = (name1.substring(0, name1.indexOf(" ")) + " " + name1.charAt(name1.lastIndexOf(" ")+1) + ".");
        String name1Initials = (name1.substring(0,1) + "." + name1.substring(name1.indexOf(" ") + 1, name1.indexOf(" ") + 2) + "." + name1.substring(name1.lastIndexOf(" ") + 1, name1.lastIndexOf(" ") + 2) ).toUpperCase();

        //Name 2 Formatting
        String name2Name = (name2.substring(name2.lastIndexOf(" ") + 1, name2.length()) + ", " +  name2.substring(0,name2.indexOf(" ")) + name2.substring(name2.indexOf(" "), name2.lastIndexOf(" ") - 1) + ".");
        String name2Name2 = (name2.substring(name2.lastIndexOf(" ") + 1, name2.length()) + ", " + name2.substring(0,1) + "." + name2.substring(name2.indexOf(" ") + 1, name2.indexOf(" ") + 2)) + ".";
        String name2Name3 = (name2.substring(0, name2.indexOf(" ")) + " " + name2.charAt(name2.lastIndexOf(" ")+1) + ".");
        String name2Initials = (name2.substring(0,1) + "." + name2.substring(name2.indexOf(" ") + 1, name2.indexOf(" ") + 2) + "." + name2.substring(name2.lastIndexOf(" ") + 1, name2.lastIndexOf(" ") + 2)).toUpperCase();

        //Name 1
        System.out.println("\nName 1: " + name1Name);
        System.out.println("Name 1: " + name1Name2);
        System.out.println("Name 1: " + name1Name3);
        System.out.println("Initials 1: " + name1Initials);

        //Name 2
        System.out.println("\nName 2: " + name2Name);
        System.out.println("Name 2: " + name2Name2);
        System.out.println("Name 2: " + name2Name3);
        System.out.println("Initials 2: " + name2Initials);
    }//end Main
}//end NallakaMStringInputLab