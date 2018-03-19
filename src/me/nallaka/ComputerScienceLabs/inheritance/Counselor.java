package me.nallaka.ComputerScienceLabs.inheritance;

public class Counselor extends Person {

  public Counselor(int age, String name, String gender) {
    super(age, name, gender);
  }

  public void giveAdvice() {
    System.out.println("You'll do great in College! You have great grades and colleges are knocking at your door!");
  }

  @Override
  public void doJob() {
    giveAdvice();
  }
}
