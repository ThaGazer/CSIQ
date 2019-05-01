/*
 * Author: ThaGazer
 * File:Solutions/ null.java
 * Date: 4/30/2019
 */
package Solutions;

import java.util.Random;

public class FrequentInt extends Question {

  private int ARRAY_LENGTH;

  public FrequentInt() {
    this.question = "Find the most frequent int in an array";
    ARRAY_LENGTH = new Random().nextInt(50) + 1;
  }

  @Override
  public void solve() {
    int[] arr = new int[ARRAY_LENGTH];
    genIntArray(arr);

    //sort then count streaks
    //double loop search
    //mapping
    //...
  }

  private void genIntArray(int[] arr) {
    System.out.print("Test array:\n[");
    for(int i = 0; i < ARRAY_LENGTH; i++) {
      arr[i] = new Random().nextInt(50);
      System.out.print(arr[i] + ",");
    }
    System.out.println("]");
  }
}
