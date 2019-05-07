/*
 * Author: ThaGazer
 * File:Solutions/ null.java
 * Date: 4/30/2019
 */
package Solutions;

import java.util.Arrays;
import java.util.Random;

public class Question implements Problem {

  protected String question = "What is the meaning of being?";

  public Question() {
  }

  @Override
  public String getQuestion() {
    return question;
  }

  @Override
  public void solve() {
    System.out.println(getQuestion());
  }

  protected void genIntArray(int[] arr) {
    System.out.print("Test array:\n");
    for(int i = 0; i < arr.length; i++) {
      arr[i] = new Random().nextInt(50);
    }
    System.out.println(Arrays.toString(arr) + "\n");
  }
}
