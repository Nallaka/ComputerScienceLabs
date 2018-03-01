package me.nallaka.ComputerScienceLabs.arrayofreflabs.monstermash;

public class Monster {
  private int height, weight,  age;

  public Monster(int height, int weight, int age) {
    this.height = height;
    this.weight = weight;
    this.age = age;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public int getHeight() {

    return height;
  }

  public int getWeight() {
    return weight;
  }

  public int getAge() {
    return age;
  }
}
