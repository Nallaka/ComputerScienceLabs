package me.nallaka.ComputerScienceLabs.interfacelabs.sortbyvowels;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import me.nallaka.ComputerScienceLabs.interfacelabs.sortbylength.SortByLength;

public class SortByVowels {

  public class Word implements Comparable<String> {

    String word;

    public Word(String word) {
      this.word = word;
    }

    public String getWord() {
      return word;
    }

    @Override
    public int compareTo(String other) {
      int vowelThis = 0;
      int vowelThat = 0;

      for (int i = 0; i < this.word.length(); i++) {
        if (this.word.toLowerCase().charAt(i) == 'a' || this.word.toLowerCase().charAt(i) == 'e'
            || this.word.toLowerCase().charAt(i) == 'i' || this.word.toLowerCase().charAt(i) == 'o'
            || this.word.toLowerCase().charAt(i) == 'u') {
          vowelThis++;
        }
      }

      for (int i = 0; i < other.length(); i++) {
        if (this.word.toLowerCase().charAt(i) == 'a' || this.word.toLowerCase().charAt(i) == 'e'
            || this.word.toLowerCase().charAt(i) == 'i' || this.word.toLowerCase().charAt(i) == 'o'
            || this.word.toLowerCase().charAt(i) == 'u') {
          vowelThat++;
        }
      }

      return vowelThis - vowelThat;
    }
  }

  public static void main(String[] args) throws FileNotFoundException {
    Scanner file = new Scanner(
        new File("src/me/nallaka/ComputerScienceLabs/interfacelabs/sortbyvowel/words.dat"));

    int numberOfWords = file.nextInt();

    ArrayList<Word> words = new ArrayList<>();

    for (int i = 0; i <= numberOfWords; i++) {
      words.add(new Word(file.nextLine()));
    }

    while (!SortByLength.isAlphabetized(words)) {
      for (int i = 1; i < words.size(); i++) {
        if (words.get(i).compareTo(words.get(i - 1)) < 0) {
          words.add(i - 1, words.get(i));
          words.remove(i + 1);
          i--;
        }
      }
    }

    for (Word word: words) {
      System.out.println(word.getWord());
    }
    //test
  }

}
