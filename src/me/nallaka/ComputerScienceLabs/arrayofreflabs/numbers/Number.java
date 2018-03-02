package me.nallaka.ComputerScienceLabs.arrayofreflabs.numbers;

public class Number {

  private Integer number;

  public Number() {
    this.number = 0;
  }

  public Number(int num) {
    this.number = num;
  }

  public void setNumber(int num) {
    this.number = num;
  }

  public int getNumber() {
    return number;
  }

  public boolean isOdd() {
    return this.number % 2 != 0;
  }

  public boolean isPerfect() {
    int total = 0;
    for (int i = 1; i <= this.number; i++) {
      if (this.number % i == 0) {
        total += i;
      }
    }

    return total == this.number;
  }

  public String toString() {
    return Integer.toString(this.number);
  }

  public static void main(String[] args) {
    int[] nums = {7, 28, 496, 1111, 199, 201, 17};
    for (int num : nums) {
      Number one = new Number(num);
      System.out.println(one.isOdd() ? one + " is odd.\n" : one + " is not odd.\n");
      System.out.println(one.isPerfect() ? one + " is perfect.\n" : one + " is not perfect.\n");
    }
  }
}
