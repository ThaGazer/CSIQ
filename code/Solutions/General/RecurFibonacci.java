/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 5/7/2019
 */
package Solutions.General;

import Solutions.Question;

public class RecurFibonacci extends Question {

  private final int MAX_DEPTH = 64;

  public RecurFibonacci() {
    this.question = "Write fibonacci recursively (bonus: use dynamic programming)";
  }

  @Override
  public void solution() {
    System.out.print("1, 1, ");
    recur(1L, 1L, 0);
  }

  private void recur(Long x, Long y, int depth) {
    if(depth < 64) {
      long nextNum = x + y;
      System.out.print(nextNum + ", ");
      recur(y, x+y, ++depth);
    } else {
      System.out.println();
    }
  }
}
