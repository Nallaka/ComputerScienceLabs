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
        while(exp.length()!=1){

            /*
            * De Morgan's First Law
            */

            //Creating a boolean to keep track (in each loop) whether De Morgan's first law is used
            boolean deMorgansLawUsed = false;

            //Checking for and replacing all instances of De Morgan's first law with their equivalents
            if (exp.contains("!(T||T)")) {
                exp = exp.replaceAll("!\\(T\\|\\|T\\)", "!T&&!T");
                deMorgansLawUsed = true;
            }
            if (exp.contains("!(F||T)")) {
                exp = exp.replaceAll("!\\(F\\|\\|T\\)", "!F&&!T");
                deMorgansLawUsed = true;
            }
            if (exp.contains("!(T||F)")) {
                exp = exp.replaceAll("!\\(T\\|\\|F\\)", "!T&&!F");
                deMorgansLawUsed = true;
            }
            if (exp.contains("!(F||F)")) {
                exp = exp.replaceAll("!\\(F\\|\\|F\\)", "!F&&!F");
                deMorgansLawUsed = true;
            }

            /*
            * De Morgan's Second Law
            */

            //Checking if De Morgan's law is used in this loop instance and if so, printing the result of changes
            if (exp.length() != 1 && deMorgansLawUsed) {
                System.out.println(exp);
            }

            //Creating a boolean to keep track (in each loop) whether De Morgan's second law is used
            boolean deMorgansSecondLawUsed = false;

            //Checking for and replacing all instances of De Morgan's second law with their equivalents
            if (exp.contains("!(T&&T)")) {
                exp = exp.replaceAll("!\\(T&&T\\)", "!T||!T");
                deMorgansSecondLawUsed = true;
            }
            if (exp.contains("!(F&&T)")) {
                exp = exp.replaceAll("!\\(F&&T\\)", "!F||!T");
                deMorgansSecondLawUsed = true;
            }
            if (exp.contains("!(T&&F)")) {
                exp = exp.replaceAll("!\\(T&&F\\)", "!T||!F");
                deMorgansSecondLawUsed = true;
            }
            if (exp.contains("!(F&&F)")) {
                exp = exp.replaceAll("!\\(F&&F\\)", "!F||!F");
                deMorgansSecondLawUsed = true;
            }

            //Checking if De Morgan's second law is used in this loop instance and if so, printing the result of changes
            if (exp.length() != 1 && deMorgansSecondLawUsed) {
                System.out.println(exp);
            }

            /*
            * Logical NOT's
            */

            //Creating a boolean to keep track (in each loop) whether Logical NOT's are used
            boolean logicalNotUsed = false;

            if (exp.contains("!F")) {
                exp = exp = exp.replaceAll("!F", "T");
                logicalNotUsed = true;
            }
            if (exp.contains("!T")) {
                exp = exp.replaceAll("!T", "F");
                logicalNotUsed = true;
            }

            //Checking if logical NOT's are used in this loop instance and if so, printing the result of changes
            if (exp.length() != 1 && logicalNotUsed) {
                System.out.println(exp);
            }

            /*
            * Logical OR's
            */

            //Creating a boolean to keep track (in each loop) whether Logical OR's are used
            boolean logicalOrUsed = false;

            if (exp.contains("T||T")) {
                exp = exp.replaceAll("T\\|\\|T", "T");
                logicalOrUsed = true;
            }
            if (exp.contains("T||F")) {
                exp = exp.replaceAll("T\\|\\|F", "T");
                logicalOrUsed = true;
            }
            if (exp.contains("F||T")) {
                exp = exp.replaceAll("F\\|\\|T", "T");
                logicalOrUsed = true;
            }
            if (exp.contains("F||F")) {
                exp = exp.replaceAll("F\\|\\|F", "F");
                logicalOrUsed = true;
            }

            //Checking if logical OR's are used in this loop instance and if so, printing the result of changes
            if (exp.length() != 1 && logicalOrUsed) {
                System.out.println(exp);
            }

            /*
            * Logical AND's
            */

            //Creating a boolean to keep track (in each loop) whether Logical AND's are used
            boolean logicalAndUsed = false;

            if (exp.contains("T&&T")) {
                exp = exp.replaceAll("T&&T", "T");
                logicalAndUsed = true;
            }
            if (exp.contains("T&&F")) {
                exp = exp.replaceAll("T&&F", "F");
                logicalAndUsed = true;
            }
            if (exp.contains("F&&T")) {
                exp = exp.replaceAll("F&&T", "F");
                logicalAndUsed = true;
            }
            if (exp.contains("F&&F")) {
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