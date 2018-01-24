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

    while (expressionList.contains("*") || expressionList.contains("/")) {
      if (expressionList.contains("*")) {
        int index = expressionList.indexOf("*");
        int firstOperand = Integer.parseInt(expressionList.get(index - 1));
        int secondOperand = Integer.parseInt(expressionList.get(index + 1));
        int answer = firstOperand * secondOperand;
        expressionList.remove(index - 1);
        expressionList.remove(index);
        expressionList.set(index + 1, Integer.toString(answer));
      }
      if (expressionList.contains("/")) {
        int index = expressionList.indexOf("/");
        int firstOperand = Integer.parseInt(expressionList.get(index - 1));
        int secondOperand = Integer.parseInt(expressionList.get(index + 1));
        int answer = firstOperand / secondOperand;
        expressionList.remove(index - 1);
        expressionList.remove(index);
        expressionList.set(index + 1, Integer.toString(answer));
      }

      while (expressionList.contains("+") || expressionList.contains("-")) {
        if (expressionList.contains("+")) {
          int index = expressionList.indexOf("+");
          int firstOperand = Integer.parseInt(expressionList.get(index - 1));
          int secondOperand = Integer.parseInt(expressionList.get(index + 1));
          int answer = firstOperand + secondOperand;
          expressionList.remove(index - 1);
          expressionList.remove(index);
          expressionList.set(index + 1, Integer.toString(answer));
        }
        if (expressionList.contains("-")) {
          int index = expressionList.indexOf("-");
          int firstOperand = Integer.parseInt(expressionList.get(index - 1));
          int secondOperand = Integer.parseInt(expressionList.get(index + 1));
          int answer = firstOperand - secondOperand;
          expressionList.remove(index - 1);
          expressionList.remove(index);
          expressionList.set(index + 1, Integer.toString(answer));
        }
      }
    }
  }
}
