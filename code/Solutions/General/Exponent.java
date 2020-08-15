/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 6/28/2019
 */
package Solutions.General;

import Solutions.Question;

import java.util.Random;

public class Exponent extends Question {

  public Exponent() {
    this.question = "Implement an exponent function (bonus: try in log(n) time)";
  }

  @Override
  public void solution() {
    Random rnd = new Random(System.nanoTime());
    int base = 2;
    int power = 8/*rnd.nextInt(32)*/;

    System.out.println(base + " to the " + power + " power is = "
            + expo_simple(base, power));
  }

  private long expo_simple(int b, int p) {
    long sum = 1;
    for(int i = 0; i < p; i++) {
      sum *= b;
    }
    return sum;
  }

  private long expo(double b, double p) {
    return 0L;
  }
}
