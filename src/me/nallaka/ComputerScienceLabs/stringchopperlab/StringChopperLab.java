package me.nallaka.ComputerScienceLabs.stringchopperlab;

import java.util.Scanner;

public class StringChopperLab {

    public static int countLine(String input) {
        int count = 0;
        Scanner lineChopper = new Scanner(input);

        while (lineChopper.hasNextInt()) {
            lineChopper.nextInt();
            count++;
        }

        return count;
    }

    public static int sumLine(String input) {
        int sum = 0;
        Scanner lineChopper = new Scanner(input);

        while (lineChopper.hasNextInt()) {
            sum += lineChopper.nextInt();
        }

        return sum;
    }

    public static double avgLine(String input) {
        double totalInts = 0;
        double sum = 0;
        Scanner lineChopper = new Scanner(input);

        while (lineChopper.hasNextDouble()) {
            totalInts++;
            sum += lineChopper.nextDouble();
        }

        return sum/totalInts;
    }

    public static int countEven(String input) {
        int totalEven = 0;
        Scanner lineChopper = new Scanner(input);

        while (lineChopper.hasNextInt()) {
            if (lineChopper.nextInt() % 2 == 0) {
                totalEven++;
            }
        }

        return totalEven;
    }

    public static int countOdd(String input) {
        int totalEven = 0;
        Scanner lineChopper = new Scanner(input);

        while (lineChopper.hasNextInt()) {
            if (lineChopper.nextInt() % 2 == 1) {
                totalEven++;
            }
        }

        return totalEven;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice;
        boolean quit = false;
        while (!quit) {
            System.out.println("Welcome to the Main Menu. Please choose one of the following labs:\n1) LineCounterLab\n2) LineTotallerLab\n3) AverageLineLab\n4) OddEvenLineLab\n5) Quit");
            if (scanner.hasNextInt()) {
                menuChoice = scanner.nextInt();
            } else {
                System.out.println("Please use a valid input!");
                continue;
            }
            switch (menuChoice) {
                case 1:
                    System.out.println("Takes in a group of numbers and counts how many there are.");
                    scanner.nextLine();
                    System.out.println("Please input numbers, each separated by a space::");
                    String toCount = scanner.nextLine();
                    System.out.println("Count = " + countLine(toCount) + "\n");
                    break;
                case 2:
                    System.out.println("Takes in a group of numbers and prints the sum.");
                    scanner.nextLine();
                    System.out.println("Please input numbers, each separated by a space::");
                    String toSum = scanner.nextLine();
                    System.out.println("Sum = " + sumLine(toSum) + "\n");
                    break;
                case 3:
                    System.out.println("Takes in a group of numbers and prints the average.");
                    scanner.nextLine();
                    System.out.println("Please input numbers, each separated by a space::");
                    String toAvg = scanner.nextLine();
                    double avg = avgLine(toAvg);
                    System.out.format("Average = %.3f%n", avg);
                    break;
                case 4:
                    System.out.println("Takes in a group of numbers and prints how many are even and how many are odd.");
                    scanner.nextLine();
                    System.out.println("Please input numbers, each separated by a space::");
                    String toSort = scanner.nextLine();
                    System.out.println("Even count = " + countEven(toSort) + " Odd count = " + countOdd(toSort) + "\n");
                    break;
                case 5:
                    System.out.println("Thank you for using the program!");
                    quit = true;
                    break;
            }
        }
    }
}
