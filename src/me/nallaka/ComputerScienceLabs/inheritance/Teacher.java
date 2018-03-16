package me.nallaka.ComputerScienceLabs.inheritance;

public class Teacher extends Person {
  private String subject;

  public Teacher(int age, String name, String gender, String subject) {
    super(age, name, gender);
    this.subject = subject;
  }

  public void teachLesson() {
    System.out.println("Ok boys and girls, today we are going to discuss the exciting subject of " + subject);
  }

  @Override
  public String toString() {
    return "Person{" +
        ", name='" + this.getName() + '\'' +
        "age=" + this.getAge() +
        ", gender='" + this.getGender() + '\'' +
        ", subject='" + this.subject + '\'' +
        '}';
  }
}
