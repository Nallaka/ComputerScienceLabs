package me.nallaka.ComputerScienceLabs.inheritance;

import java.util.Scanner;

public class InheritanceRunner {

  public static void main(String[] args) {
    Person[] schoolPeople = new Person[7];

    schoolPeople[0] = new Principal(45, "Kevin Keidel", "Male");
    schoolPeople[1] = new Teacher(26, "Sielbeck", "female", "English");
    schoolPeople[2] = new Teacher(35, "Popovich", "male", "History");
    schoolPeople[3] = new Teacher(56, "Hood", "female", "Math");
    schoolPeople[4] = new Teacher(69, "Marrero", "female", "Science");
    schoolPeople[5] = new Counselor(35, "Turner", "male");
    schoolPeople[6] = new Counselor(46, "Rogers", "female");

    Scanner scanner = new Scanner(System.in);
    int menuChoice;
    boolean quit = false;

    while (!quit) {
      System.out.println("Welcome to the Main Menu\nPlease choose one of the following choices:\n1) Principals\n2) Teachers\n3) Counselors\n4) Quit");
      if (scanner.hasNextInt()) {
        menuChoice = scanner.nextInt();
      } else {
        System.out.println("Please use a valid input");
        continue;
      }
      switch (menuChoice) {
        case 1:
          System.out.println("Choose one of the following:\n1) Keidel");
          int principalChoice = scanner.nextInt();
          switch (principalChoice) {
            case 1:
              System.out.println("Choose one of the following:\n1) Name\n2) Age\n3) Gender\n4) Do Job\n5) Print Info");
              int choice = scanner.nextInt();
              switch (choice) {
                case 1:
                  System.out.println(schoolPeople[0].getName());
                  break;
                case 2:
                  System.out.println(schoolPeople[0].getAge());
                  break;
                case 3:
                  System.out.println(schoolPeople[0].getGender());
                  break;
                case 4:
                  schoolPeople[0].doJob();
                  break;
                case 5:
                  System.out.println(schoolPeople[0].toString());
                  break;
                default:
                  continue;
              }
          }
          break;
        case 2:
          System.out.println("Choose one of the following:\n1) Sielbeck\n2) Popovich\n3) Hood\n4) Marrero");
          int teacherChoice = scanner.nextInt();
          System.out.println("\"Choose one of the following:\\n1) Name\\n2) Age\\n3) Gender\\n4) Do Job\\n5) Print Info\"");
            int choice = scanner.nextInt();
            switch (choice) {
              case 1:
                System.out.println(schoolPeople[teacherChoice].getName());
                break;
              case 2:
                System.out.println(schoolPeople[teacherChoice].getAge());
                break;
              case 3:
                System.out.println(schoolPeople[teacherChoice].getGender());
                break;
              case 4:
                schoolPeople[teacherChoice].doJob();
                break;
              case 5:
                System.out.println(schoolPeople[teacherChoice].toString());
            }
          break;
        case 3:
          System.out.println("Choose one of the following:\n1) Turner\n2) Rogers");
          int counselorChoice = scanner.nextInt();
          System.out.println("\"Choose one of the following:\\n1) Name\\n2) Age\\n3) Gender\\n4) Do Job\\n5) Print Info\"");
          int choice2 = scanner.nextInt();
          switch (choice2) {
            case 1:
              System.out.println(schoolPeople[counselorChoice + 4].getName());
              break;
            case 2:
              System.out.println(schoolPeople[counselorChoice + 4].getAge());
              break;
            case 3:
              System.out.println(schoolPeople[counselorChoice + 4].getGender());
              break;
            case 4:
              schoolPeople[counselorChoice + 4].doJob();
              break;
            case 5:
              System.out.println(schoolPeople[counselorChoice + 4].toString());
          }
          break;
        case 4:
          quit = true;
          break;
        default:
          System.out.println("This is an invalid input, please try again");
          break;
      }
    }
  }
}
