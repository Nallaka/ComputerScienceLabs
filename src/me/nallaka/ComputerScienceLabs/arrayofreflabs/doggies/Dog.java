package me.nallaka.ComputerScienceLabs.arrayofreflabs.doggies;

public class Dog {

  private int age;
  private String name;

  public Dog(int a, String n) {
    this.age = a;
    this.name = n;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String toString() {
    return "" + age + " " + name;
  }
}
