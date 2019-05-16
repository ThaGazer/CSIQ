package Solutions;/*
 * Author: ThaGazer
 * File:Solutions/ JUnit5 Test Class.java.java
 * Date: 4/30/2019
 */

import Solutions.General.*;
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

  @Test
  public void CommonElementsTest() {
    tests(new CommonElements());
  }

  @Test
  public void CommonElementsAltTest() {
    CommonElements com = new CommonElements();

    System.out.println("\n[Test]" + com.getQuestion());
    com.altSolve();
  }

  @Test
  public void BinarySearchTest() {
    tests(new BinarySearch());
  }

  @Test
  public void Binary2Int() {
    tests(new Binary2Int());
  }

  @Test
  public void SquareRootTest() {
    tests(new SquareRoot());
  }

  private void tests(Question quest) {
    System.out.println("\n[Test]" + quest.getQuestion());
    quest.solve();
  }
}