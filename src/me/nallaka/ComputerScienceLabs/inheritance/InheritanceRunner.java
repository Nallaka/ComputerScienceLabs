package me.nallaka.ComputerScienceLabs.inheritance;

public class InheritanceRunner {

  public static void main(String[] args) {
    Person[] schoolPeople = new Person[7];

    schoolPeople[1] = new Principal(45, "Kevin Keidel", "Male");
    schoolPeople[2] = new Teacher(26, "Sielbeck", "female", "English");
    schoolPeople[3] = new Teacher(35, "Popovich", "male", "History");
    schoolPeople[4] = new Teacher(56, "Hood", "female", "Math");
    schoolPeople[5] = new Teacher(69, "Marrero", "female", "Science");
  }
}
