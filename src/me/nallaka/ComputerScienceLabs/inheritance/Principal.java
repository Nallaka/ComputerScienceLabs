package me.nallaka.ComputerScienceLabs.inheritance;

public class Principal extends Person {

  public Principal(int age, String name, String gender) {
    super(age, name, gender);
  }

  public void makeAnnouncement() {
    System.out.println("RANDOM DANCE PARTY TIME! Flood the halls and 'DO THE HARLEM SHAKE'");
  }

  @Override
  public void doJob() {
    makeAnnouncement();
  }
}
