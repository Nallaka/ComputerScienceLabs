package me.nallaka.ComputerScienceLabs.inheritance;

public class Person {
  private int age;
  private String name, gender;

  public Person(int age, String name, String gender) {
    this.age = age;
    this.name = name;
    this.gender = gender;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public void doJob() {

  }

  @Override
  public String toString() {
    return "Person{" +
        ", name='" + name + '\'' +
        "age=" + age +
        ", gender='" + gender + '\'' +
        '}';
  }
}
