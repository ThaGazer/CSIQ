/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 5/16/2019
 */
package Solutions.General;

import Solutions.Question;

import java.util.Random;

public class NonMultiMultiply extends Question {

  public NonMultiMultiply() {
    this.question = "Write a multiply function that multiples 2 integers without using *";
  }

  @Override
  public void solve() {
    Random rnd = new Random(System.currentTimeMillis());
    int x = rnd.nextInt(Integer.MAX_VALUE);
    int y = rnd.nextInt(Integer.MAX_VALUE);

    System.out.println("Multiplying " + x + " and " + y);

    long sum = 0;
    for(int i = 0; i < y; i++) {
      sum += x;
    }

    System.out.println("The sum of " + x + " and " + y + " is " + sum);
  }
}
