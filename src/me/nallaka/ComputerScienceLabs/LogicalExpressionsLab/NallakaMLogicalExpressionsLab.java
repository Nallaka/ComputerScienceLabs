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

            //Checking for first De Morgan's law and implementing the law to the exp string
            boolean deMorgansLawUsed = false;
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
            if (deMorgansLawUsed) {
                System.out.println(exp);
            }


            //Checking for 2nd de Morgan's law and implementing the law to the exp string
            boolean deMorgansSecondLawUsed = false;

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

            if (deMorgansSecondLawUsed) {
                System.out.println(exp);
            }

            //Checking for Logical NOT "!" statements and replacing all instances of that with the respective boolean value
            boolean logicalNotUsed = false;

            if (exp.contains("!F")) {
                exp = exp = exp.replaceAll("!F", "T");
                logicalNotUsed = true;
            }
            if (exp.contains("!T")) {
                exp = exp.replaceAll("!T", "F");
                logicalNotUsed = true;
            }

            if (logicalNotUsed) {
                System.out.println(exp);
            }

            //Checking all logical OR "||" expressions
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

            if (logicalOrUsed) {
                System.out.println(exp);
            }

            //Checking all logical AND "&&" expressions
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

            if (logicalAndUsed) {
                System.out.println(exp);
            }
        }
    }
}