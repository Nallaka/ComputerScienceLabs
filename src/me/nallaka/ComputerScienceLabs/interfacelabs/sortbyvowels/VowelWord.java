package me.nallaka.ComputerScienceLabs.interfacelabs.sortbyvowels;

public class VowelWord implements Comparable<VowelWord> {
  private String word;

  public VowelWord(String word) {
    this.word = word.toLowerCase();
  }

  public int getVowelCount() {
    int vowelCount = 0;
    for (int i = 0; i < this.getWord().length(); i++) {
      if (this.getWord().charAt(i) == 'a' || this.getWord().charAt(i) == 'e'
          || this.getWord().charAt(i) == 'i' || this.getWord().charAt(i) == 'o'
          || this.getWord().charAt(i) == 'u') {
        vowelCount++;
      }
    }
    return vowelCount;
  }

  @Override
  public int compareTo(VowelWord otherWord) {
    if (this.getVowelCount() != otherWord.getVowelCount()) {
      return this.getVowelCount() - otherWord.getVowelCount();
    } else {
      return this.getWord().compareTo(otherWord.getWord());
    }
  }

  public String getWord() {
    return word;
  }

}
