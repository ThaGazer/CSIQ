/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 5/8/2019
 */
package Solutions.General;

import Solutions.Question;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch extends Question {

  private final int ARRAY_LENGTH= Integer.MAX_VALUE/(Integer.MAX_VALUE/16);

  public BinarySearch() {
    this.question = "Implement binary search of a sorted array of integers";
  }

  @Override
  public void solution() {
    int[] arr = new int[ARRAY_LENGTH];

    genIntArray(arr);

    Arrays.sort(arr);

    int searchNum = new Random().nextInt(ARRAY_LENGTH);

    System.out.println("Searching for: " + searchNum);
    if(binSearch(arr, searchNum)) {
      System.out.println("Found");
    } else {
      System.out.println("Not Found");
    }
  }

  private boolean binSearch(int[] arr, int val) {
    if(arr.length == 1) {
      return arr[0] == val;
    }

    if(arr[arr.length/2] == val) {
      return true;
    } else if(arr[arr.length/2] < val) {
      return binSearch(Arrays.copyOfRange(arr, (arr.length/2), arr.length), val);
    } else if(arr[arr.length/2] > val) {
      return binSearch(Arrays.copyOfRange(arr, 0, (arr.length/2)), val);
    } else {
      return false;
    }
  }
}
