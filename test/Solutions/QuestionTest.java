package Solutions;/*
 * Author: ThaGazer
 * File:Solutions/ JUnit5 Test Class.java.java
 * Date: 4/30/2019
 */

import Solutions.General.*;
import Solutions.Strings.FirstSolo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class QuestionTest {

  @Test
  void FrequentIntTest() {
    tests(new FrequentInt());
  }

  @Test
  void IntPairsTest() {
    tests(new IntPairs());
  }

  @Test
  void IterFibonacci() {
    tests(new IterFibonacci());
  }

  @Test
  void RecurFibonacci() {
    tests(new RecurFibonacci());
  }

  @Test
  void CommonElementsTest() {
    tests(new CommonElements());
  }

  @Test
  void CommonElementsAltTest() {

  }

  @Test
  void BinarySearchTest() {
    tests(new BinarySearch());
  }

  @Test
  void Binary2Int() {
    tests(new Binary2Int());
  }

  @Test
  void SquareRootTest() {
    tests(new SquareRoot());
  }

  @Test
  void NonMultiMultiplyTest() {
    tests(new NonMultiMultiply());
  }

  @Test
  void GenPrimTest() {
    tests(new GenPrime());
  }

  @Test
  void ParseIntTest() {
    tests(new ParseInt());
  }

  @Test
  void ExponentTest() {
    tests(new Exponent());
  }

  @Test
  void Rand7Test() {
    for(int i = 0; i < 10000; i++) {
      tests(new Rand7());
    }
  }

  @Test
  void IslandGroupings() {
    tests(new IslandGroupings());
  }

  @Test
  void FirstSoloTest() {
    tests(new FirstSolo());
  }

  @Test
  void FizzBuzzTest() {
    tests(new FizzBuzz());
  }

  private void tests(Question quest) {
    ArrayList<String> times = new ArrayList<>();

    System.out.println("\n[Test]" + quest.getQuestion());

    boolean loop = true;
    int i = 0;
    while(loop) {
      long start, stop;

      try {
        start = System.currentTimeMillis();
        quest.solve(i);
        stop = System.currentTimeMillis();
        times.add("Solution " + i + ": " + (stop - start));
      } catch(Exception e) {
        loop = false;
      }
      i++;
    }
    System.out.println(times.toString());
  }
}