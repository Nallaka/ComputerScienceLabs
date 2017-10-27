package me.nallaka.ComputerScienceLabs.GeometryLab;

import java.util.Scanner;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 10/26/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods:
 */
public class NallakaMGeometryDemo {
    /**
     * @Name: main
     * Purpose: N/A
     * Input: None
     * Return: None
     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int menuChoice = 0;
        int roundChoice = 0;
        boolean quit = false;

        while (!quit) {
            System.out.println("Welcome to the Main Menu\nPlease choose one of the following choices:\n1) Work with Triangles\n2) Work with Rectangles\n3) Exit the Program ");
            if (scanner.hasNextInt()) {
                menuChoice = scanner.nextInt();
            } else {
                System.out.println("Please use a valid input");
                continue;
            }
            switch (menuChoice) {
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Bye! Thank you for using this program!");
                    quit = true;
                    break;
                default:
                    System.out.println("This is an invalid input, please try again");
                    break;
            }
        }
    }
}//end NallakaMGeometryDemo