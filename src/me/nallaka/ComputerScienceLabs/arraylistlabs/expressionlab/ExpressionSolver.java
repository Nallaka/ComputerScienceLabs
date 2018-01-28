package me.nallaka.ComputerScienceLabs.arraylistlabs.expressionlab;

import java.util.ArrayList;
import java.util.Scanner;

public class ExpressionSolver {

  public static void solveExpression(String expression) {
    Scanner chopper = new Scanner(expression);
    ArrayList<String> expressionList = new ArrayList<>();

    while (chopper.hasNext()) {
      expressionList.add(chopper.next());
    }

    while (expressionList.contains("+") || expressionList.contains("-") || expressionList
        .contains("*") || expressionList.contains("/")) {
      if (expressionList.contains("*") || expressionList.contains("/")) {
        if ((expressionList.indexOf("*") < expressionList.indexOf("/")) || (
            expressionList.contains("*") && !expressionList.contains("/"))) {
          int index = expressionList.indexOf("*");
          int answer = Integer.parseInt(expressionList.get(index - 1)) * Integer
              .parseInt(expressionList.get(index + 1));
          expressionList.set(index - 1, Integer.toString(answer));
          expressionList.remove(index + 1);
          expressionList.remove(index);
        }

        if ((expressionList.indexOf("/") < expressionList.indexOf("*")) || (
            expressionList.contains("/") && !expressionList.contains("*"))) {
          int index = expressionList.indexOf("/");
          int answer = Integer.parseInt(expressionList.get(index - 1)) / Integer
              .parseInt(expressionList.get(index + 1));
          expressionList.set(index - 1, Integer.toString(answer));
          expressionList.remove(index + 1);
          expressionList.remove(index);
        }
      }

      if (expressionList.contains("+") || expressionList.contains("-")) {
        if ((expressionList.indexOf("+") < expressionList.indexOf("-")) || (
            expressionList.contains("+") && !expressionList.contains("-"))) {
          int index = expressionList.indexOf("+");
          int answer = Integer.parseInt(expressionList.get(index - 1)) + Integer
              .parseInt(expressionList.get(index + 1));
          expressionList.set(index - 1, Integer.toString(answer));
          expressionList.remove(index + 1);
          expressionList.remove(index);
        }

        if ((expressionList.indexOf("-") < expressionList.indexOf("+")) || (
            expressionList.contains("-") && !expressionList.contains("+"))) {
          int index = expressionList.indexOf("-");
          int answer = Integer.parseInt(expressionList.get(index - 1)) - Integer
              .parseInt(expressionList.get(index + 1));
          expressionList.set(index - 1, Integer.toString(answer));
          expressionList.remove(index + 1);
          expressionList.remove(index);
        }
      }
      System.out.println(expression + " = " + expressionList.get(0));
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int menuChoice;
    boolean quit = false;

    while (!quit) {
      System.out.println("Welcome to the Main Menu\nPlease choose one of the following choices:\n1) Solve an expression\n2) Exit the Program ");
      if (scanner.hasNextInt()) {
        menuChoice = scanner.nextInt();
      } else {
        System.out.println("Please use a valid input");
        continue;
      }
      switch (menuChoice) {
        case 1:
          System.out.println("Please input an expression with spaces in between each value");
          Scanner input = new Scanner(System.in);
          String expression = input.nextLine();

          solveExpression(expression);
          break;
        case 2:
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
