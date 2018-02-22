package me.nallaka.ComputerScienceLabs.interfacelabs.sortbylength;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class SortByLength {

  public static void main(String[] args) throws FileNotFoundException {
    Scanner file = new Scanner(new File("src/me/nallaka/ComputerScienceLabs/interfacelabs/sortbylength/words.dat"));

    int numberOfWords = file.nextInt();

    ArrayList<String> words = new ArrayList<>();

    for (int i = 0; i <= numberOfWords; i++) {
      words.add(file.nextLine());
    }

    for (int i = 1; i <= words.size() ; i++) {
      if (words.get(i).length() < words.get(i - 1).length()) {
        words.add(i - 1, words.get(i));
        words.remove(i + 1);
        i--;
      } else if(words.get(i).length() == words.get(i - 1).length()) {
        int compare = words.get(i).compareTo(words.get(i-1));

        if (compare < 0) {
          words.add(i - 1, words.get(i));
          words.remove(i + 1);
          i--;
        }
      }
    }
  }
}
