package me.nallaka.ComputerScienceLabs.arraylistlabs.madliblab;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MadLibLab {

  public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner(System.in);
    int menuChoice;
    boolean quit = false;

    while (!quit) {
      System.out.println("Welcome to the Main Menu\nPlease choose one of the following choices:\n1) Generate a Mad Lib\n2) Exit the Program ");
      if (scanner.hasNextInt()) {
        menuChoice = scanner.nextInt();
      } else {
        System.out.println("Please use a valid input");
        continue;
      }
      switch (menuChoice) {
        case 1:
          Scanner nouns = new Scanner(new File("src/me/nallaka/ComputerScienceLabs/arraylistlabs/madliblab/nouns.dat"));
          Scanner verbs = new Scanner(new File("src/me/nallaka/ComputerScienceLabs/arraylistlabs/madliblab/verbs.dat"));
          Scanner adjectives = new Scanner(new File("src/me/nallaka/ComputerScienceLabs/arraylistlabs/madliblab/adjectives.dat"));
          Scanner story = new Scanner(new File("src/me/nallaka/ComputerScienceLabs/arraylistlabs/madliblab/story.dat"));

          ArrayList<String> nounList = new ArrayList<>();
          ArrayList<String> verbList = new ArrayList<>();
          ArrayList<String> adjectiveList = new ArrayList<>();
          ArrayList<String> storyList = new ArrayList<>();

          while (nouns.hasNext()) {
            nounList.add(nouns.nextLine());
          }

          while (verbs.hasNext()) {
            verbList.add(verbs.nextLine());
          }

          while (adjectives.hasNext()) {
            adjectiveList.add(adjectives.nextLine());
          }

          while (story.hasNext()) {
            storyList.add(story.next());
          }
          //The # @ after the & & # while the # @ the #
          while (storyList.contains("#")) {
            storyList.set(storyList.indexOf("#"), nounList.get((int) (Math.random() * nounList.size())));
          }

          while (storyList.contains("@")) {
            storyList.set(storyList.indexOf("@"), verbList.get((int) (Math.random() * verbList.size())));
          }

          while (storyList.contains("&")) {
            storyList.set(storyList.indexOf("&"), adjectiveList.get((int) (Math.random() * adjectiveList.size())));
          }

          String madLib = "";

          for (String word : storyList) {
            madLib = madLib.concat(word + " ");
          }

          System.out.println(madLib + "\n");
          break;
        case 2:
          System.out.println("Bye! Thank you for using the program!");
          quit = true;
          break;
        default:
          System.out.println("This is an invalid input, please try again");
          break;
      }
    }
  }
}
