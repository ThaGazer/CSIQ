package Solutions;/*
 * Author: ThaGazer
 * File:Solutions/ JUnit5 Test Class.java.java
 * Date: 4/30/2019
 */

import Solutions.General.FrequentInt;
import org.junit.jupiter.api.Test;

class FrequentIntTest {

  private Question question = new FrequentInt();

  @Test
  void solveTest() {
    question.solve();
  }

  @Test
  void getterTest() {
    System.out.println(question.getQuestion());
  }
}