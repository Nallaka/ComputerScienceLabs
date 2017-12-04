package me.nallaka.ComputerScienceLabs.ArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

    public static int sumArray(int[] randomIntArray, int boundOne, int boundTwo) {
        int runningSum = 0;
        for (int i = boundOne; i <= boundTwo ; i++) {
            runningSum = runningSum + randomIntArray[i];
        }
        return runningSum;
    }

    public static int countArray(int[] randomIntArray, int value) {
        //Takes in avalue to look for and returns the number of occurances
        int runningTotal = 0;
        for (int i = 0; i < randomIntArray.length; i++) {
            if (randomIntArray[i] == value) {
                runningTotal++;
            }
        }
        return runningTotal;
    }

    public static int[] multiplyArray(int[] randomIntArray, int value) {
        ///takes in value and returns array multiplied by that value
        int[] tempArray = new int[randomIntArray.length];
        for (int i = 0; i < randomIntArray.length; i++) {
            tempArray[i] = randomIntArray[i] * value;
        }
        return tempArray;
    }

    public static int[] removeArray(int[] randomIntArray, int value) {
        //takes in value to remove and returns new array without the removed values
        int totalOccurances = 0;
        for (int aRandomIntArray : randomIntArray) {
            if (aRandomIntArray == value) {
                totalOccurances++;
            }
        }
        int[] tempArray = new int[randomIntArray.length-totalOccurances];
        int newArrayIndex = 0;
        for (int i = 0; i < randomIntArray.length; i++) {
            if (randomIntArray[i] != value) {
                tempArray[newArrayIndex] = randomIntArray[i];
                newArrayIndex++;
            }
        }

        return tempArray;
    }

    public static void regenArray(int[] randomIntArray) {
        for (int i = 0; i < randomIntArray.length; i++) {
            randomIntArray[i] = (int) (Math.random() * 11);
        }
    }

    public static String printMethodInfo() {
        return ("sumArray takes in integers as bounds and returns the sum of the values between those indexes" +
                "\ncountArray takes in a value and returns the number of occurrences of that value" +
                "\nmultiplyArray take sin a value and returns the array multiplied by that value" +
                "\nremoveArray takes in a value to remove and returns a new array without the removed values" +
                "\nregenArray creates a new array.\n");
    }


    public static String toString(int[] randomIntArray) {
        return "Your current array is: " + Arrays.toString(randomIntArray);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice;
        boolean quit = false;
        while (!quit) {
            System.out.println("Welcome to the Main Menu. Please choose one of the following options:\n1) Work with a new array\n2) Quit");
            if (scanner.hasNextInt()) {
                menuChoice = scanner.nextInt();
            } else {
                System.out.println("Please use a valid input!");
                continue;
            }
            switch (menuChoice) {
                case 1:
                    int[] randomIntArray =  new int[25];
                    regenArray(randomIntArray);
                    boolean arrayQuit = false;
                    while (!arrayQuit) {
                        System.out.println("Welcome to the Array Menu. Please choose one of the following methods:\n1) sumArray\n2) countArray\n3) multiplyArray\n4) removeArray\n5) regenArray\n6) Method Info\n7) Quit");
                        System.out.println(toString(randomIntArray));
                        if (scanner.hasNextInt()) {
                            menuChoice = scanner.nextInt();
                        } else {
                            System.out.println("Please use a valid input!");
                            continue;
                        }

                        switch (menuChoice) {
                            case 1:
                                System.out.println("Input a lower and upper bound separated with a space:");
                                int boundOne, boundTwo;
                                boundOne = scanner.nextInt();
                                boundTwo = scanner.nextInt();
                                System.out.println("The sum of the numbers inbetween indexes " + boundOne + " and " + boundTwo + " is " + sumArray(randomIntArray, boundOne, boundTwo));
                                break;
                            case 2:
                                System.out.println("Please input a value to look for:");
                                int value = scanner.nextInt();
                                System.out.println("The value " + value + " occurs " + countArray(randomIntArray, value) + " times in the array.");
                                break;
                            case 3:
                                System.out.println("Input a value to multiply by:");
                                int multiplyValue = scanner.nextInt();
                                System.out.println("The current array multiplied by " + multiplyValue + " is " + Arrays.toString(multiplyArray(randomIntArray, multiplyValue)));
                                break;
                            case 4:
                                System.out.println("Please input a value to remove:");
                                int valueToRemove = scanner.nextInt();
                                System.out.println("The array without the value " + valueToRemove + " is " + Arrays.toString(removeArray(randomIntArray, valueToRemove)));
                                break;
                            case 5:
                                System.out.println("Generating a new array...");
                                regenArray(randomIntArray);
                                System.out.println(Arrays.toString(randomIntArray));
                                break;
                            case 6:
                                System.out.println(printMethodInfo());
                                break;
                            case 7:
                                arrayQuit = true;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Thank you for using the program!");
                    quit = true;
                    break;
            }
        }
    }
}
