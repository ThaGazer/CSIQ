/*
 * Author: ThaGazer
 * File:Solutions/ null.java
 * Date: 5/6/2019
 */
package Solutions.General;

import Solutions.Question;
import java.util.Random;

public class IntPairs extends Question {

  private int ARRAY_LENGTH = new Random().nextInt(Integer.MAX_VALUE/32) + 1;
  private int PAIRED_SUM = new Random().nextInt(Integer.MAX_VALUE/32) + 1;


  public IntPairs() {
    this.question = "Find pairs in an integer array whose sum is equal to a " +
            "random number (bonus: do it in linear time)";
  }

  @Override
  public String getQuestion() {
    return this.question;
  }

  @Override
  public void solve() {
    super.solve();

    int[] arr = new int[ARRAY_LENGTH];
    genIntArray(arr);

    System.out.println("");
    for(int i : arr) {

    }
  }
}
