/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 5/13/2019
 */
package Solutions.General;

import Solutions.Question;

import java.util.Random;

public class SquareRoot extends Question {

  public SquareRoot() {
    this.question = "Implement square root function";
  }

  @Override
  public void solve() {
    int x = new Random(System.currentTimeMillis()).nextInt();

    System.out.println("The square root of " + x + " is: ");

    System.out.println(squareRoot(x));
  }

  private double squareRoot(double x) {
    if(x == 0) {
      return 0;
    }
    double l = 0.0, r = 1.0;
    while(ce(l,r)) {
      l = r;
      r = ((x/r) + r) / 2.0;
    }
    return r;
  }

  /**
   * Stands for closeEnough
   * to check if two doubles are close enough to each other to be considered the same
   * @param x 1st double
   * @param y 2nd double
   * @return if the two double are equivalent
   */
  private boolean ce(double x, double y) {
    return !(Math.abs(x-y) < .0001);
  }
}
