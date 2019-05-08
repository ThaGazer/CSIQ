package Solutions;/*
 * Author: ThaGazer
 * File:Solutions/ JUnit5 Test Class.java.java
 * Date: 4/30/2019
 */

import Solutions.General.FrequentInt;
import Solutions.General.IntPairs;
import Solutions.General.IterFibonacci;
import Solutions.General.RecurFibonacci;
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

  @Test
  public void RecurFibonacci() {
    tests(new RecurFibonacci());
  }

  private void tests(Question quest) {
    System.out.println("\n[Test]" + quest.getQuestion());
    quest.solve();
  }
}