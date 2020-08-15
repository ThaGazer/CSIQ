/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 6/28/2019
 */
package Solutions.General;

import Solutions.Question;

import java.util.ArrayList;
import java.util.Random;

public class IslandGroupings extends Question {

  private final Random rnd = new Random(System.nanoTime());

  //private final int ARRAY_LENGTH = rnd.nextInt(500);
  private final int ARRAY_LENGTH = 10;

  public IslandGroupings() {
    this.question = "Given a 2D array of 1s and 0s, count the number of " +
            "\"islands of 1s\" (e.g. groups of connecting 1s)";
  }

  @Override
  public void solution() {
    int[] arr = genIntArray(ARRAY_LENGTH);

    System.out.println("Groupings of 1s: " + findGroupings_Count(arr));
  }

  private int findGroupings_Count(int[] arr) {
    int count_groups = 0;
    int count_1 = 0;

    for(int i : arr) {
      if(i == 1) {
        count_1++;
      } else {
        if(count_1 > 1) {
          count_groups++;
        }
        count_1 = 0;
      }
    }

    //catch trailing groups
    if(count_1 > 1) {
      count_groups++;
    }

    return count_groups;
  }

  //TODO Store each grouping of ones and count them
  private int findGroupings_Stored(int[] arr) {
    return 0;
  }

  private int[] genIntArray(int size) {
    int[] arr = new int[size];

    System.out.println("Test array:");
    for(int i = 0; i < size; i++) {
      arr[i] = rnd.nextInt(2);
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    return arr;
  }
}
