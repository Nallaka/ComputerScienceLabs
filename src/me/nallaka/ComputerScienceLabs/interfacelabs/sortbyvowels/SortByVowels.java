package me.nallaka.ComputerScienceLabs.interfacelabs.sortbyvowels;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SortByVowels {

  public static boolean isFinal(ArrayList<VowelWord> words) {
    for (int i = 1; i < words.size(); i++) {
      if (words.get(i).compareTo(words.get(i-1)) < 0) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) throws FileNotFoundException {
    Scanner file = new Scanner(
        new File("src/me/nallaka/ComputerScienceLabs/interfacelabs/sortbyvowels/word.dat"));

    int numberOfWords = file.nextInt();

    ArrayList<VowelWord> words = new ArrayList<>();

    for (int i = 0; i <= numberOfWords; i++) {
      words.add(new VowelWord(file.nextLine()));
    }

    while (!isFinal(words)) {
      for (int i = 1; i < words.size(); i++) {
        if (words.get(i).compareTo(words.get(i - 1)) < 0) {
          words.add(i - 1, words.get(i));
          words.remove(i + 1);
          i--;
        }
      }
    }

    for (VowelWord word: words) {
      System.out.println(word.getWord());
    }

  }

}
