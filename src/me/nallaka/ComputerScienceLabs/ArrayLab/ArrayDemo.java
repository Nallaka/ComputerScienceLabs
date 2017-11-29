package me.nallaka.ComputerScienceLabs.ArrayLab;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
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
                    Array array = new Array();
                    boolean arrayQuit = false;
                    while (!arrayQuit) {
                        System.out.println("Welcome to the Array Menu. Please choose one of the following methods:\n1) sumArray\n2) countArray\n3) multiplyArray\n4) removeArray\n5) Method Info\n6) Quit");
                        if (scanner.hasNextInt()) {
                            menuChoice = scanner.nextInt();
                        } else {
                            System.out.println("Please use a valid input!");
                            continue;
                        }
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Input a lower and upper bound seperated with a space:");
                                int boundOne, boundTwo;
                                boundOne = scanner.nextInt();
                                boundTwo = scanner.nextInt();
                                System.out.println(array.sumArray(boundOne, boundTwo));
                                break;
                            case 2:
                                System.out.println("Please input a value to look for:");
                                int value = scanner.nextInt();
                                array.countArray(value);
                                break;
                            case 3:
                                System.out.println("Input a value to multiply by:");
                                int multiplyValue = scanner.nextInt();
                                System.out.println(Arrays.toString(array.multiplyArray(multiplyValue)));
                                break;
                            case 4:
                                System.out.println("Please input a value to remove:");
                                int valueToRemove = scanner.nextInt();
                                System.out.println(Arrays.toString(array.removeArray(valueToRemove)));
                                break;
                            case 5:
                                System.out.println(array.printMethodInfo());
                                break;
                            case 6:
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
