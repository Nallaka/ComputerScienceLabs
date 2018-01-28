package me.nallaka.ComputerScienceLabs.arraylistlabs.funhouselab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListFunHouse {

  public static ArrayList<Integer> getListOfFactors(int number) {
    ArrayList<Integer> listOfFactors = new ArrayList<>();
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        listOfFactors.add(i);
      }
    }

    return listOfFactors;
  }

  public static ArrayList<Integer> keepOnlyCompositeNumbers(List<Integer> nums) {
    ArrayList<Integer> newList = new ArrayList<>();
    for (int num : nums) {
      boolean isComposite = false;
      for (int i = 2; i < num; i++) {
        if (num % i == 0) {
          isComposite = true;
        }
      }
      if (isComposite) {
        newList.add(num);
      }
    }
    return newList;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int menuChoice;
    boolean quit = false;
    ArrayList<Integer> factors;

    while (!quit) {
      System.out.println("Welcome to the Main Menu\nPlease choose one of the following choices:\n1) Get a list of factors\n2) Keep only composite numbers\n3) Exit the Program ");
      if (scanner.hasNextInt()) {
        menuChoice = scanner.nextInt();
      } else {
        System.out.println("Please use a valid input");
        continue;
      }
      switch (menuChoice) {
        case 1:
          System.out.println("Input a number::");
          int number = scanner.nextInt();
          factors = getListOfFactors(number);
          System.out.println(factors.toString());
          break;
        case 2:
          scanner.nextLine();
          System.out.println("Please input a list of numbers separated by a space::");
          String input = scanner.nextLine();
          Scanner chopper = new Scanner(input);
          ArrayList<Integer> intList = new ArrayList<>();

          while (chopper.hasNextInt()) {
            intList.add(chopper.nextInt());
          }

          System.out.println("Original List: " + intList.toString());
          intList = keepOnlyCompositeNumbers(intList);
          System.out.println("Composite List: " + intList.toString());

          break;
        case 3:
          System.out.println("Bye! Thank you for using the program!");
          quit = true;
          break;
        default:
          System.out.println("This is an invalid input, please try again");
          break;
      }
    }
  }

}

