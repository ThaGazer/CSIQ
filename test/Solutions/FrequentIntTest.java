package Solutions;/*
 * Author: ThaGazer
 * File:Solutions/ JUnit5 Test Class.java.java
 * Date: 4/30/2019
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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