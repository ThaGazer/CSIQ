package Solutions;/*
 * Author: ThaGazer
 * File:Solutions/ JUnit5 Test Class.java.java
 * Date: 4/30/2019
 */

import Solutions.General.FrequentInt;
import Solutions.General.IntPairs;
import Solutions.General.IterFibonacci;
import org.junit.jupiter.api.Test;

class QuestionTest {

  @Test
  public void FrequentIntTest() {
    tests(new FrequentInt());
  }

  @Test
  public void IntPairsTest() {
    tests(new IntPairs());
  }

  @Test
  public void IterFibonacci() {
    tests(new IterFibonacci());
  }

  private void tests(Question quest) {
    System.out.println("\n[Test]" + quest.getQuestion());
    quest.solve();
  }
}