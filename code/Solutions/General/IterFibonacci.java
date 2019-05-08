/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 5/7/2019
 */
package Solutions.General;

import Solutions.Question;

import java.util.ArrayList;

public class IterFibonacci extends Question {

  private final int MAX_ITER = 72;

  public IterFibonacci() {
    this.question = "Write fibonacci iteratively(bonus: use dynamic programming)";
  }

  @Override
  public void solve() {
    ArrayList<Long> fib = new ArrayList<>();
    fib.add(1L);
    fib.add(1L);
    for(int i = 2; i < MAX_ITER; i++) {
      fib.add(fib.get(i-2) + fib.get(i-1));
    }

    System.out.println(fib);
  }
}
