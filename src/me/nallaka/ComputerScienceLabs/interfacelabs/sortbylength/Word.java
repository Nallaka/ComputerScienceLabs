package me.nallaka.ComputerScienceLabs.interfacelabs.sortbylength;

public class Word implements Comparable<Word> {

  private String word;

  public Word(String word) {
    this.word = word.toLowerCase();
  }

  public String getWord() {
    return word;
  }

  @Override
  public int compareTo(Word otherWord) {
    if (this.getWord().length() != otherWord.getWord().length()) {
      return this.getWord().length() - otherWord.getWord().length();
    } else {
      return this.getWord().compareTo(otherWord.getWord());
    }
  }
}
