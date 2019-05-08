/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 5/8/2019
 */
package Solutions.General;

import Solutions.Question;

import java.util.Arrays;
import java.util.TreeSet;

public class CommonElements extends Question {

  private final int ARRAY_LENGTH = Integer.MAX_VALUE/(Integer.MAX_VALUE/32);

  public CommonElements() {
    this.question = "Find the common elements of 2 int arrays";
  }

  @Override
  public void solve() {
    int[] arr1 = new int[ARRAY_LENGTH];
    int[] arr2 = new int[ARRAY_LENGTH];

    genIntArray(arr1);
    genIntArray(arr2);

    TreeSet<Integer> com = new TreeSet<>();
    for(int i : arr1) {
      com.add(i);
    }

    System.out.print("Common integers: ");
    for(int i : arr2) {
      if(com.contains(i)) {
        System.out.print(i + ", ");
      }
    }
    System.out.println();
  }

  public void altSolve() {
    int[] arr1 = new int[ARRAY_LENGTH];
    int[] arr2 = new int[ARRAY_LENGTH];

    genIntArray(arr1);
    genIntArray(arr2);

    Arrays.sort(arr1);
    Arrays.sort(arr2);

    for(int i = 0, j = 0; i < arr1.length; i++, j++) {
      if(arr1[i] > arr2[j]) {
        i--;
      } else if(arr1[i] < arr2[j]) {
        j--;
      } else {
        System.out.print(arr1[i] + ", ");
      }
    }
  }
}