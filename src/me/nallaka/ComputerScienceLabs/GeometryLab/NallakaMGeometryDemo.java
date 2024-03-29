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
        boolean quit = false;

        while (!quit) {
            System.out.println("Welcome to the Main Menu\nPlease choose one of the following choices:\n1) Work with Triangles\n2) Work with Quadrilaterals\n3) Exit the Program ");
            if (scanner.hasNextInt()) {
                menuChoice = scanner.nextInt();
            } else {
                System.out.println("Please use a valid input");
                continue;
            }
            switch (menuChoice) {
                case 1:
                    //Triangles
                    boolean triangleQuit = false;
                    NallakaMPointClass pointA = new NallakaMPointClass(0,0);
                    NallakaMPointClass pointB = new NallakaMPointClass(0,0);
                    NallakaMPointClass pointC = new NallakaMPointClass(0,0);
                    NallakaMTriangleClass triangle = new NallakaMTriangleClass(pointA, pointB, pointC);
                    while (!triangleQuit) {
                        System.out.println("Welcome to the Main Menu\nPlease choose one of the following choices:\n1) Create a New Triangle\n2) Find The Area\n3) Find The Perimeter\n4) Quit to Main Menu");
                        if (scanner.hasNextInt()) {
                            menuChoice = scanner.nextInt();
                        } else {
                            System.out.println("Please use a valid input");
                            continue;
                        }
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Enter the x value of point A:");
                                triangle.getA().setX(scanner.nextInt());
                                System.out.println("Enter the y value of point A:");
                                triangle.getA().setY(scanner.nextInt());
                                System.out.println("Enter the x value of point B:");
                                triangle.getB().setX(scanner.nextInt());
                                System.out.println("Enter the y value of point B:");
                                triangle.getB().setY(scanner.nextInt());
                                System.out.println("Enter the x value of point C:");
                                triangle.getC().setX(scanner.nextInt());
                                System.out.println("Enter the y value of point C:");
                                triangle.getC().setY(scanner.nextInt());
                                System.out.println("All values set!");
                                break;
                            case 2:
                                System.out.println(triangle.getArea(pointA, pointB, pointC));
                                break;
                            case 3:
                                System.out.println(triangle.getPerimeter());
                                break;
                            case 4:
                                triangleQuit = true;
                                break;
                            default:
                                System.out.println("This is an invalid input, please try again");
                                break;
                        }
                    }
                    break;
                case 2:
                    //Rectangles
                    boolean rectangleQuit = false;
                    NallakaMPointClass pointA2 = new NallakaMPointClass(0,0);
                    NallakaMPointClass pointB2 = new NallakaMPointClass(0,0);
                    NallakaMPointClass pointC2 = new NallakaMPointClass(0,0);
                    NallakaMPointClass pointD2 = new NallakaMPointClass(0,0);
                    NallakaMQuadClass quad = new NallakaMQuadClass(pointA2, pointB2, pointC2, pointD2);
                    while (!rectangleQuit) {
                        System.out.println("Welcome to the Main Menu\nPlease choose one of the following choices:\n1) Create a New Quadrilateral\n2) Find The Area\n3) Find The Perimeter\n4) Quit to Main Menu");
                        if (scanner.hasNextInt()) {
                            menuChoice = scanner.nextInt();
                        } else {
                            System.out.println("Please use a valid input");
                            continue;
                        }
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Input the coordinates so that when A is connected to B, B is connected to C, C is connected to D, and D is connected to A, it forms a quadrilateral");
                                System.out.println("Enter the x value of point A:");
                                quad.getA().setX(scanner.nextInt());
                                System.out.println("Enter the y value of point A:");
                                quad.getA().setY(scanner.nextInt());
                                System.out.println("Enter the x value of point B:");
                                quad.getB().setX(scanner.nextInt());
                                System.out.println("Enter the y value of point B:");
                                quad.getB().setY(scanner.nextInt());
                                System.out.println("Enter the x value of point C:");
                                quad.getC().setX(scanner.nextInt());
                                System.out.println("Enter the y value of point C:");
                                quad.getC().setY(scanner.nextInt());
                                System.out.println("Enter the x value of point D:");
                                quad.getD().setX(scanner.nextInt());
                                System.out.println("Enter the y value of point D:");
                                quad.getD().setY(scanner.nextInt());
                                System.out.println("All values set!");
                                break;
                            case 2:
                                System.out.println(quad.getArea());
                                break;
                            case 3:
                                System.out.println(quad.getPerimeter());
                                break;
                            case 4:
                                rectangleQuit = true;
                                break;
                            default:
                                System.out.println("This is an invalid input, please try again");
                                break;
                        }
                    }
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