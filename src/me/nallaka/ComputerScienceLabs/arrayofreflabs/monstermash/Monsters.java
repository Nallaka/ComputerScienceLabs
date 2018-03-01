package me.nallaka.ComputerScienceLabs.arrayofreflabs.monstermash;

import java.util.Arrays;
import java.util.Scanner;

public class Monsters {

  private Monster[] myMonsters;

  public Monsters(int size) {
    this.myMonsters = new Monster[size];
  }

  public void add(int spot, Monster monster) {
    this.myMonsters[spot] = monster;
  }

  public String getLargest() {
    int max = Integer.MIN_VALUE;
    int place = 0;
    for (int i = 0; i < myMonsters.length; i++) {
      if (myMonsters[i].getWeight() > max) {
        max = myMonsters[i].getWeight();
        place = i;
      }
    }
    return "" + myMonsters[place].getHeight() + " " + myMonsters[place].getWeight() + " "
        + myMonsters[place].getAge();
  }

  public String getSmallest() {
    int max = Integer.MAX_VALUE;
    int place = 0;
    for (int i = 0; i < myMonsters.length; i++) {
      if (myMonsters[i].getWeight() < max) {
        max = myMonsters[i].getWeight();
        place = i;
      }
    }
    return "" + myMonsters[place].getHeight() + " " + myMonsters[place].getWeight() + " "
        + myMonsters[place].getAge();
  }

  @Override
  public String toString() {
    return "Monsters: " + Arrays.toString(myMonsters);
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("How many monsters are in the herd? :: ");
    int size = keyboard.nextInt();
    Monsters herd = new Monsters(size);

    for (int i = 0; i < size; i++) {
      //read in monster values

      //ask for ht
      System.out.println("Enter the height ::");
      int height = keyboard.nextInt();
      //ask for wt
      System.out.println("Enter the weight ::");
      int weight = keyboard.nextInt();
      //ask for age
      System.out.println("Enter the age ::");
      int age = keyboard.nextInt();

      //instantiate a new Monster() and add it to the herd
      herd.add(i, new Monster(height, weight, age));
    }

    System.out.println("HERD :: " + herd + "\n");

    System.out.println("Largest:: " + herd.getLargest());

    System.out.println("Smallest:: " + herd.getSmallest());
  }
}
