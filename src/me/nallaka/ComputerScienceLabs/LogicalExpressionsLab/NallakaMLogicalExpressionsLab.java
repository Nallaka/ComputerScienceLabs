package me.nallaka.ComputerScienceLabs.LogicalExpressionsLab;

import java.util.Scanner;
public class NallakaMLogicalExpressionsLab {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = -1;
        while(choice !=2){
            System.out.println("Choose one of the following:\n1)Evaluate Expression\n2)Quit");
            if(in.hasNextInt()) {
                choice = in.nextInt();
                if(choice ==1)
                    evaluate();
                else if(choice !=2)
                    System.out.println("Invalid Choice.");
            }else
                System.out.println("Invalid choice");
        }
    }

    public static void evaluate(){
        Scanner kb = new Scanner(System.in);
        System.out.println("Using appropriate characters(T,F,!,(,),&&,||) provide a logical expression to evaluate(no spaces)::");
        String exp = kb.nextLine();
        while (exp.length() != 1) {

            /*
            * Logical NOT's
            */

            //Creating a boolean to keep track (in each loop) whether Logical NOT's are used
            boolean logicalNotUsed = false;

            //Checking for and replacing all instances of logical NOT's
            while (exp.contains("!F") || exp.contains("!T")) {
                exp = exp.replaceAll("!F", "T");
                exp = exp.replaceAll("!T", "F");
                logicalNotUsed = true;
            }

            //Checking if logical NOT's are used in this loop instance and if so, printing the result of changes
            if (exp.length() != 1 && logicalNotUsed) {
                System.out.println(exp);
                //NOTE: Continue is used to ensure that each step doesn't create a previous check.
                //This keeps the precedence in the right order
                continue;
            }

            /*
            * De Morgan's First Law
            */

            //Creating a boolean to keep track (in each loop) whether De Morgan's first law is used
            boolean deMorgansLawUsed = false;

            //Checking for and replacing all instances of De Morgan's first law with their equivalents
            while (exp.contains("!(T||T)") || exp.contains("!(F||T)") || exp.contains("!(T||F)") || exp.contains("!(F||F)")){
                exp = exp.replaceAll("!\\(T\\|\\|T\\)", "!T&&!T");
                exp = exp.replaceAll("!\\(F\\|\\|T\\)", "!F&&!T");
                exp = exp.replaceAll("!\\(T\\|\\|F\\)", "!T&&!F");
                exp = exp.replaceAll("!\\(F\\|\\|F\\)", "!F&&!F");
                deMorgansLawUsed = true;
            }

            //Checking if De Morgan's law is used in this loop instance and if so, printing the result of changes
            if (exp.length() != 1 && deMorgansLawUsed) {
                System.out.println(exp);
                continue;
            }


            /*
            * De Morgan's Second Law
            */

            //Creating a boolean to keep track (in each loop) whether De Morgan's second law is used
            boolean deMorgansSecondLawUsed = false;

            //Checking for and replacing all instances of De Morgan's second law with their equivalents
            while (exp.contains("!(T&&T)") || exp.contains("!(F&&T)") || exp.contains("!(T&&F)") || exp.contains("!(F&&F)")) {
                exp = exp.replaceAll("!\\(T&&T\\)", "!T||!T");
                exp = exp.replaceAll("!\\(F&&T\\)", "!F||!T");
                exp = exp.replaceAll("!\\(T&&F\\)", "!T||!F");
                exp = exp.replaceAll("!\\(F&&F\\)", "!F||!F");
                deMorgansSecondLawUsed = true;
            }

            //Checking if De Morgan's second law is used in this loop instance and if so, printing the result of changes
            if (exp.length() != 1 && deMorgansSecondLawUsed) {
                System.out.println(exp);
                continue;
            }

            /*
            * Logical OR's
            */

            //Creating a boolean to keep track (in each loop) whether Logical OR's are used
            boolean logicalOrParenthesesUsed = false;
            boolean logicalOrUsed = false;

            //Checking for logical OR's in parentheses and solving those first
            while (exp.contains("(T||T)") || exp.contains("(T||F)") || exp.contains("(F||T)") || exp.contains("(F||F)")) {
                exp = exp.replaceAll("\\(T\\|\\|T\\)", "T");
                exp = exp.replaceAll("\\(T\\|\\|F\\)", "T");
                exp = exp.replaceAll("\\(F\\|\\|T\\)", "T");
                exp = exp.replaceAll("\\(F\\|\\|F\\)", "F");
                logicalOrParenthesesUsed = true;
            }

            //Checking if logical OR's in parentheses are used in this loop instance and if so, printing the result of changes
            if (exp.length() != 1 && logicalOrParenthesesUsed) {
                System.out.println(exp);
                continue;
            }

            //Checking for logical OR's and solving those
            while (exp.contains("T||T") || exp.contains("T||F") || exp.contains("F||T") || exp.contains("F||F")) {
                exp = exp.replaceAll("T\\|\\|T", "T");
                exp = exp.replaceAll("T\\|\\|F", "T");
                exp = exp.replaceAll("F\\|\\|T", "T");
                exp = exp.replaceAll("F\\|\\|F", "F");
                logicalOrUsed = true;

            }

            //Checking if logical OR's are used in this loop instance and if so, printing the result of changes
            if (exp.length() != 1 && logicalOrUsed) {
                System.out.println(exp);
                continue;
            }

            /*
            * Logical AND's
            */

            //Creating a boolean to keep track (in each loop) whether Logical AND's are used
            boolean logicalAndParenthesesUsed = false;
            boolean logicalAndUsed = false;

            //Checking for logical AND's in parentheses and solving those first
            while (exp.contains("(T&&T)") || exp.contains("(T&&F)") || exp.contains("(F&&T)") || exp.contains("(F&&F)")) {
                exp = exp.replaceAll("\\(T&&T\\)", "T");
                exp = exp.replaceAll("\\(T&&F\\)", "F");
                exp = exp.replaceAll("\\(F&&T\\)", "F");
                exp = exp.replaceAll("\\(F&&F\\)", "F");
                logicalAndParenthesesUsed = true;

            }

            //Checking if logical AND's in parentheses are used in this loop instance and if so, printing the result of changes
            if (exp.length() != 1 && logicalAndParenthesesUsed) {
                System.out.println(exp);
                continue;
            }

            //Checking for logical AND's and solving them
            while (exp.contains("T&&T") || exp.contains("T&&F") || exp.contains("F&&T") || exp.contains("F&&F")) {
                exp = exp.replaceAll("T&&T", "T");
                exp = exp.replaceAll("T&&F", "F");
                exp = exp.replaceAll("F&&T", "F");
                exp = exp.replaceAll("F&&F", "F");
                logicalAndUsed = true;
            }

            //Checking if logical AND's are used in this loop instance and if so, printing the result of changes
            if (exp.length() != 1 && logicalAndUsed) {
                System.out.println(exp);
            }
        }
        System.out.println(exp);
    }
}