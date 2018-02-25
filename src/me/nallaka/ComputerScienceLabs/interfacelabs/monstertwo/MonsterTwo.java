package me.nallaka.ComputerScienceLabs.interfacelabs.monstertwo;

public class MonsterTwo implements Comparable<MonsterTwo> {

  private int myWeight;
  private int myHeight;
  private int myAge;

  //write a default Constructor
  public MonsterTwo() {
    this.myWeight = 0;
    this.myHeight = 0;
    this.myAge = 0;
  }

  //write an initialization constructor with int parameters ht and wt
  public MonsterTwo(int myHeight) {
    this.myHeight = myHeight;
    this.myWeight = 0;
    this.myAge = 0;
  }

  //write an initialization constructor with int parameters ht, wt, and age
  public MonsterTwo(int myHeight, int myWeight) {
    this.myHeight = myHeight;
    this.myWeight = myWeight;
    this.myAge = 0;
  }

  //modifiers - write set methods for height, weight, and age
  public MonsterTwo(int myHeight, int myWeight, int myAge) {
    this.myHeight = myHeight;
    this.myWeight = myWeight;
    this.myAge = myAge;
  }

  //modifiers - write set methods for height, weight, and age
  public void setMyWeight(int myWeight) {
    this.myWeight = myWeight;
  }

  public void setMyHeight(int myHeight) {
    this.myHeight = myHeight;
  }

  public void setMyAge(int myAge) {
    this.myAge = myAge;
  }

  //accessors - write get methods for height, weight, and age
  public int getMyWeight() {
    return myWeight;
  }

  public int getMyHeight() {
    return myHeight;
  }

  public int getMyAge() {
    return myAge;
  }

  //creates a new copy of this Object
  public MonsterTwo clone() {
    return new MonsterTwo(this.getMyHeight(), this.getMyWeight(), this.getMyAge());
  }

  public boolean equals(MonsterTwo monsterTwo) {
    return (this.getMyHeight() == monsterTwo.getMyHeight() && this.getMyWeight() == monsterTwo
        .getMyWeight() && this.getMyAge() == monsterTwo.getMyAge());
  }

  @Override
  public int compareTo(MonsterTwo monsterTwo) {
    if (this.equals(monsterTwo)) {
      return 0;
    } else if (this.getMyHeight() == monsterTwo.getMyHeight()) {
      if (this.getMyWeight() == monsterTwo.getMyWeight()) {
        if (this.getMyAge() < monsterTwo.getMyAge()) {
          return -1;
        } else {
          return 1;
        }
      } else {
        if (this.getMyWeight() < monsterTwo.getMyWeight()) {
          return -1;
        } else {
          return 1;
        }
      }
    } else {
      if (this.getMyHeight() < monsterTwo.getMyHeight()) {
        return -1;
      } else {
        return 1;
      }
    }
  }

  //write a toString() method


  @Override
  public String toString() {
    return "" + this.getMyHeight() + " " + this.getMyWeight() + " " + this.getMyAge();
  }

  public static void main(String args[]) {
    MonsterTwo zero = new MonsterTwo();
    MonsterTwo one = new MonsterTwo(8);
    MonsterTwo sue = new MonsterTwo(9, 4);
    MonsterTwo harry = new MonsterTwo(1, 2, 3);
    System.out.println("\nzero MonsterTwo :: " + zero);
    System.out.println("\none MonsterTwo :: " + one);
    System.out.println("\nsue MonsterTwo :: " + sue);
    System.out.println("\nharry MonsterTwo :: " + harry);

    System.out.println("\nchanging harry's properties ");
    harry.setMyHeight(7);
    harry.setMyWeight(6);
    harry.setMyAge(5);
    System.out.println("\nharry MonsterTwo :: " + harry);

    System.out.println("\ncloning harry");
    sue = harry.clone();
    System.out.println("\nsue MonsterTwo :: " + sue);

    MonsterTwo mOne = new MonsterTwo(33, 33, 11);
    MonsterTwo mTwo = new MonsterTwo(55, 33, 11);

    System.out.println("\nMonsterTwo 1 :: " + mOne);
    System.out.println("\nMonsterTwo 2 :: " + mTwo);

    System.out.print("\nmOne.equals(mTwo) == ");
    System.out.println(mOne.equals(mTwo));

    System.out.print("\nmOne.compareTo(mTwo) == ");
    System.out.println(mOne.compareTo(mTwo));
    System.out.print("\nmTwo.compareTo(mOne) == ");
    System.out.println(mTwo.compareTo(mOne));
  }
}
