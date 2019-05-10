/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 5/9/2019
 */
package Solutions.General;

import Solutions.Question;

import java.util.Arrays;

public class RotatedArrays extends Question {

  private final int ARRAY_LENGTH = Integer.MAX_VALUE/(Integer.MAX_VALUE/4);

  public RotatedArrays() {
    this.question = "Given 2 integer arrays, determine of the 2nd array is a rotated version of the 1st array. Ex. Original Array A={1,2,3,5,6,7,8} Rotated Array B={5,6,7,8,1,2,3}";
  }

  public void solve() {
    int[] arr1 = new int[ARRAY_LENGTH];
    int[] arr2 = new int[ARRAY_LENGTH];

    genIntArray(arr1);
    genIntArray(arr2);

    if(checkRotation(arr1, arr2)) {
      System.out.println("Is a Rotation");
    } else {
      System.out.println("Is not a Rotation");
    }
  }

  private boolean checkRotation(int[] a1, int[] a2) {
    for(int idx1 = 0, idx2 = a1.length/2; idx1 < a1.length; idx1++, idx2=(++idx2%a2.length)) {
      if(a1[idx1] != a2[idx2]) {
        return false;
      }
    }
    return true;
  }
}
