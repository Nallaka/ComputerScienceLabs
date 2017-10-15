package me.nallaka.ComputerScienceLabs.LogicalExpressionsLab;

import java.util.Scanner;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 10/14/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods: None
 */
public class NallakaMWhileLoopLab {
    /**
     * @Name: main
     * Purpose: N/A
     * Input: None
     * Return: None
     */
    public static void main(String[] args) {
        //Declaring all required variables and scanner for menu loop
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int choice = 0;
        //Menu Loop
        while (!quit) {
            //Menu GUI
            System.out.println("Welcome to the Menu. Please Choose one of the following options:");
            System.out.println("1) Lab 1: Counting Digits\n2) Lab 2: Base Conversions\n3) Exit");
            //Check if integer is inputted. If not, restart menu loop
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            }
            switch (choice) {
                case 1:
                    //Defining variables to keep track of digits and numbers
                    int inputNum;
                    int trackingNumber;
                    int totalDigits = 0;

                    //Asking for user input
                    System.out.println("Input a number:");

                    //Checking user input
                    while (!scanner.hasNextInt()) {
                        System.out.println("Input a valid number!");
                        scanner.next();
                    }

                    //Assigning variables from user input
                    inputNum = scanner.nextInt();
                    trackingNumber = inputNum;

                    //Checking for the number of digits in an int
                    while (trackingNumber > 0) {
                        totalDigits++;
                        trackingNumber /= 10;
                    }

                    //Printing the amount of digits with grammar checks
                    if (totalDigits == 1){
                        System.out.println("The number " + inputNum + " has " + totalDigits + " digit.");
                    } else {
                        System.out.println("The number " + inputNum + " has " + totalDigits + " digits.");
                    }

                    break;
                case 2:
                    //Declaring variables to be used
                    int inputNum2;
                    int baseNumber;
                    int trackingNumber2;
                    String convertedNumber = "";

                    //Asking for number
                    System.out.println("Input a number to convert:");

                    //Checking user input
                    while (!scanner.hasNextInt()) {
                        System.out.println("Input a valid number!");
                        scanner.next();
                    }

                    //Assigning user input to variables
                    inputNum2 = scanner.nextInt();
                    trackingNumber2 = inputNum2;

                    //Asking for base
                    System.out.println("Input a base to convert to (Up to 16):");

                    //checking user input
                    while (!scanner.hasNextInt()) {
                        System.out.println("Input a valid number!");
                        scanner.next();
                    }

                    //Assigning user input to variables
                    baseNumber = scanner.nextInt();

                    //Declaring variables for base conversion
                    int remainder;
                    String remainderString;

                    //Base Conversion
                    while (trackingNumber2 > 0) {
                        remainder = trackingNumber2 % baseNumber;
                        switch (remainder) {
                            case 10:
                                remainderString = "A";
                                break;
                            case 11:
                                remainderString = "B";
                                break;
                            case 12:
                                remainderString = "C";
                                break;
                            case 13:
                                remainderString = "D";
                                break;
                            case 14:
                                remainderString = "E";
                                break;
                            case 15:
                                remainderString = "F";
                                break;
                            case 16:
                                remainderString = "G";
                                break;
                            default:
                                remainderString = Integer.toString(remainder);
                                break;
                        }
                        convertedNumber = remainderString + convertedNumber;
                        trackingNumber2 /= baseNumber;
                    }

                    //Printing converted number
                    System.out.println(inputNum2 + " in base 10 is " + convertedNumber + " in base " + baseNumber);
                    break;
                case 3:
                    //Quitting the menu
                    System.out.println("Bye!");
                    quit = true;
                    break;
                default:
                    //Default menu option
                    System.out.println("That is not a valid input! Please enter any character to continue.");
                    scanner.next();
                    break;
            }
        }

    }//end main
}//end NallakaMWhileLoopLab
