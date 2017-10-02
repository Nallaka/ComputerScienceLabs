package me.nallaka.ComputerScienceLabs.LogicalExpressionsLab;

import java.util.Scanner;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 9/28/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods:
 */
public class NallakaMForLooplab {
    /**
     * @Name: numberOfCoolNumbers
     * Purpose: N/A
     * Input: naxValue
     * Return: totalCoolNumbers
     */
    public static int numberOfCoolNumbers(int maxValue) {
        int totalCoolNumbers = 0;

        for (int i = 6; i <= maxValue; i++) {
            if (i % 3 == 1 && i % 4 == 1 && i % 5 == 1 && i % 6 == 1) totalCoolNumbers++;
        }
        return totalCoolNumbers;
    }

    /**
     * @Name: greatestCommonDivisor
     * Purpose: N/A
     * Input: int1, int2
     * Return: gcd
     */
    public static int greatestCommonDivisor(int int1, int int2) {
        int gcd = 0;
        if (int1 < int2) {
            for (int i = 1; i <= int1; i++) {
                if((int1 % i) == 0 && int2 % i == 0) gcd = i;
            }
        } else if (int1 > int2) {
            for (int i = 1; i > int2; i++) {
                if(int1 % i == 0 && int2 % i == 0) gcd = i;
            }
        } else if (int1 == int2) {
            for (int i = 1; i > int1; i++) {
                if(int1 % i == 0 && int2 % i == 0) gcd = i;
            }
        }
        return gcd;
    }

    /**
     * @Name: main
     * Purpose: N/A
     * Input: None
     * Return: None
     */
    public static void main(String[] args) {
        //Scanner for input
        Scanner scanner = new Scanner(System.in);

        //Tracks Maximum Value inputted by the use
        int maxVal = 0;

        //Tracks whether use wants to quit menu loop
        boolean quit = false;

        //While the user doesn't want to quit, provide menu and options
        while (!quit) {

            //Printing the menu
            System.out.println("           ====== Menu ======");
            System.out.println("          |   Please Pick 1  |");
            System.out.println("           ------------------");
            System.out.println("      1) Enter a Max Value (Lab 1)");
            System.out.println("   2) Search The Current Values (Lab 1)");
            System.out.println("3) Find the Greatest Common Divisor (Lab 2)");
            System.out.println("                4) Quit");

            //Gathering the User's choice and storing in choice
            int choice = scanner.nextInt();

            //Switch of choice with all possible options
            switch (choice) {
                case 1:
                    //Asks for a maximum value and stores the value as maxVal
                    System.out.println("Please input a maximum value:");
                    maxVal = scanner.nextInt();
                    System.out.println("You set the max value to " + maxVal + "\n");
                    break;
                case 2:
                    //Searches the current inputted value and prints the numberOfCoolNumbers
                    System.out.println("Checking current values:");
                    System.out.println("There are " + numberOfCoolNumbers(maxVal) + " cool numbers in between 6 and " + maxVal +"\n");
                    break;
                case 3:
                    //Asks for two inputs and stores as num1 and num2
                    System.out.println("Enter two numbers (Ex. 5 25):");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    //Finds and prints the GCD
                    System.out.println("The greatest common divisor of " + num1 + " and " + num2 + " is " + greatestCommonDivisor(num1, num2) + "\n");
                    break;
                case 4:
                    //Quits the menu loop
                    System.out.println("Bye! \n");
                    quit = true;
            }
        }
    }//end Main
}//end NallakaMForLooplab