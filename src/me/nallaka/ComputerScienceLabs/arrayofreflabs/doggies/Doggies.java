package me.nallaka.ComputerScienceLabs.arrayofreflabs.doggies;

import java.util.Arrays;
import java.util.Scanner;

public class Doggies {

  private Dog[] pups;

  public Doggies(int size) {
    pups = new Dog[size];
  }

  public void add(int spot, int age, String name) {
    pups[spot] = new Dog(age, name);
  }

  public String getNameOfOldest() {
    int max = Integer.MIN_VALUE;
    String name = "";
    for (int i = 0; i < pups.length; i++) {
      if (pups[i].getAge() > max) {
        max = pups[i].getAge();
        name = pups[i].getName();
      }
    }
    return name;
  }

  public String getNameOfYoungest() {
    int max = Integer.MAX_VALUE;
    String name = "";
    for (int i = 0; i < pups.length; i++) {
      if (pups[i].getAge() < max) {
        max = pups[i].getAge();
        name = pups[i].getName();
      }
    }
    return name;
  }

  public String toString() {
    return "" + Arrays.toString(pups);
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("How many Dogs are in the pack? :: ");
    int size = keyboard.nextInt();
    Doggies pack = new Doggies(size);

    for (int i = 0; i < size; i++) {
      System.out.print("Enter the age :: ");
      int age = keyboard.nextInt();
      System.out.print("Enter the name :: ");
      String name = keyboard.next();
      pack.add(i, age, name);
    }
    System.out.println("pack :: " + pack);
    System.out.println("NAME OF OLDEST :: " + pack.getNameOfOldest());
    System.out.println("NAME OF YOUNGEST :: " + pack.getNameOfYoungest());

  }
}
