/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 7/9/2019
 */
package Solutions.General;

import Solutions.Question;

import java.util.Random;

public class Rand7 extends Question {

  public Rand7() {
    this.question = "Given a function rand5() that returns a random int " +
            "between 0 and 5, implement rand7()";
  }

  @Override
  public void solution() {
    System.out.println("A random number between 0 and 7: " + rand7());
  }

  int rand7() {
    Rand5 rnd = new Rand5();
    return (rnd.rand5() + rnd.rand5()) % 7;
  }
}
