package me.nallaka.ComputerScienceLabs.interfacelabs.sortbylength;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SortByLength {

  public static boolean isAlphabetized(ArrayList<Word> words) {
    for (int i = 1; i < words.size(); i++) {
      if (words.get(i).compareTo(words.get(i-1)) < 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) throws FileNotFoundException {
    Scanner file = new Scanner(new File("src/me/nallaka/ComputerScienceLabs/interfacelabs/sortbylength/words.dat"));

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
  }
}
