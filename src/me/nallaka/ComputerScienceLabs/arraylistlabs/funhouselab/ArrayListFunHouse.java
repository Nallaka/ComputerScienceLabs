package me.nallaka.ComputerScienceLabs.arraylistlabs.funhouselab;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFunHouse {

  public static ArrayList<Integer> getListOfFactors(int number) {
    ArrayList<Integer> listOfFactors = new ArrayList<>();
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        listOfFactors.add(i);
      }
    }

    return listOfFactors;
  }

  public static void keepOnlyCompositeNumbers(List<Integer> nums) {
    for (int num : nums) {
      boolean isComposite = false;
      for (int i = 2; i < num; i++) {
        if (num % i == 0) {
          isComposite = true;
        }
      }
      if (!isComposite) {
        nums.remove(num);
      }
    }
  }

}

