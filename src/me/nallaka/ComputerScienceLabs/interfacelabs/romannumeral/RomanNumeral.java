package me.nallaka.ComputerScienceLabs.interfacelabs.romannumeral;

public class RomanNumeral {

  private Integer number;
  private String roman;

  private final static int[] NUMBERS = {1000, 900, 500, 400, 100, 90,
      50, 40, 10, 9, 5, 4, 1};

  private final static String[] LETTERS = {"M", "CM", "D", "CD", "C", "XC",
      "L", "XL", "X", "IX", "V", "IV", "I"};

  public RomanNumeral(String str) {
    setRoman(str);
    int value = 0;
    for (int i = 0; i < LETTERS.length; i++) {
      if (str.contains(LETTERS[i])) {
        value += NUMBERS[i];
      }
    }
    setNumber(value);
  }

  public RomanNumeral(Integer orig) {
    int number = orig;
    setNumber(orig);
    StringBuilder numeral = new StringBuilder();
    for (int i = 0; i < NUMBERS.length; i++) {
      if (NUMBERS[i] <= number) {
        numeral.append(LETTERS[i]);
        number -= NUMBERS[i];
      }
    }
    setRoman(numeral.toString());
  }


  public void setNumber(Integer number) {
    this.number = number;
    StringBuilder numeral = new StringBuilder();
    for (int i = 0; i < NUMBERS.length; i++) {
      if (NUMBERS[i] <= number) {
        numeral.append(LETTERS[i]);
        number -= NUMBERS[i];
      }
    }
    setRoman(numeral.toString());
  }

  public void setRoman(String roman) {
    this.roman = roman;
  }


  public Integer getNumber() {
    return number;
  }

  public String getRoman() {
    return roman;
  }

  public int compareTo(RomanNumeral r) {
    return 0;
  }

  @Override
  public String toString() {
    return (this.roman);
  }

  public static void main(String args[]) {
    RomanNumeral test = new RomanNumeral(10);
    System.out.println("10 is " + test.toString());

    test.setNumber(100);
    System.out.println("100 is " + test.toString());

    test.setNumber(1000);
    System.out.println("1000 is " + test.toString());

    test.setNumber(2500);
    System.out.println("2500 is " + test.toString());

    test = new RomanNumeral(1500);
    System.out.println("1500 is " + test.toString());

    test.setNumber(23);
    System.out.println("23 is " + test.toString());

    test.setNumber(38);
    System.out.println("38 is " + test.toString());

    test.setNumber(49);
    System.out.println("49 is " + test.toString());

    test.setRoman("LXXVII");
    System.out.println("LXXVII is " + test.getNumber() + "\n");

    test.setRoman("XLIX");
    System.out.println("XLIX is " + test.getNumber() + "\n");

    test.setRoman("XX");
    System.out.println("XX is " + test.getNumber() + "\n");

    test.setRoman("XLIX");
    System.out.println("XLIX is " + test.getNumber() + "\n");

    RomanNumeral rOne = new RomanNumeral("XXI");
    RomanNumeral rTwo = new RomanNumeral("XXV");

    System.out.println("\nRoman 1 :: " + rOne);
    System.out.println("Roman 2 :: " + rTwo);

    System.out.print("\nrOne.equals(rTwo) == ");
    System.out.println(rOne.equals(rTwo));

    System.out.print("\nrOne.compareTo(rTwo) == ");
    System.out.println(rOne.compareTo(rTwo));
    System.out.print("\nrTwo.compareTo(rOne) == ");
    System.out.println(rTwo.compareTo(rOne));
  }
}
