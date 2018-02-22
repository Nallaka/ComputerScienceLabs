package me.nallaka.ComputerScienceLabs.interfacelabs.monsterlabone;

import java.util.Scanner;

public class Monster1 {

  private String name;
  private int howBig;

  public Monster1(String n, int size) {
    this.name = n;
    this.howBig = size;
  }

  public String getName() {
    return name;
  }

  public int getHowBig() {
    return howBig;
  }

  public boolean isBigger(Monster1 other) {
    return this.getHowBig() > other.getHowBig();
  }

  public boolean isSmaller(Monster1 other) {
    return !isBigger(other);
  }

  public boolean namesTheSame(Monster1 other) {
    return this.name.compareTo(other.getName()) == 0;
  }

  public String toString() {
    return ("Monster: " + this.getName() + " has a size of " + this.getHowBig());
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int menuChoice;
    boolean quit = false;

    while (!quit) {
      System.out.println("Welcome to the Main Menu\nPlease choose one of the following choices:\n1) Compare Two Monsters\n2) Quit");
      if (scanner.hasNextInt()) {
        menuChoice = scanner.nextInt();
      } else {
        System.out.println("Please use a valid input");
        continue;
      }
      switch (menuChoice) {
        case 1:
          scanner.nextLine();
          System.out.println("Enter 1st Monster's Name: ");
          String nameOne = scanner.nextLine();
          System.out.println("Enter 1st Monster's Size: ");
          int sizeOne = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Enter 2nd Monster's Name: ");
          String nameTwo = scanner.nextLine();
          System.out.println("Enter 2nd Monster's Size: ");
          int sizeTwo = scanner.nextInt();

          Monster1 monster1 = new Monster1(nameOne, sizeOne);
          Monster1 monster2 = new Monster1(nameTwo, sizeTwo);

          System.out.println(monster1.toString());
          System.out.println(monster2.toString());
          System.out.println();

          if (monster1.isBigger(monster2)) {
            System.out.println("Monster " + monster1.getName() + "is bigger than Monster 2");
          } else {
            System.out.println("Monster " + monster1.getName() + "is smaller than Monster 2");
          }

          System.out.println();

          if (monster1.namesTheSame(monster2)) {
            System.out.println("Monster one has the same name as Monster two.");
          } else {
            System.out.println("Monster one does not have the same name as Monster two.");
          }
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

