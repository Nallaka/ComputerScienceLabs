package me.nallaka.ComputerScienceLabs;

import java.util.Scanner;

public class MenuTemplate {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int menuChoice;
    boolean quit = false;

    while (!quit) {
      System.out.println("Welcome to the Main Menu\nPlease choose one of the following choices:\n1)");
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
          quit = true;
          break;
        default:
          System.out.println("This is an invalid input, please try again");
          break;
      }
    }
  }
}
