/*
 * Author: ThaGazer
 * File:Solutions/ null.java
 * Date: 5/6/2019
 */
package Solutions.General;

import Solutions.Question;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeMap;

public class IntPairs extends Question {

  private int ARRAY_LENGTH = new Random().nextInt(50) + 1;
  private int PAIRED_SUM = new Random().nextInt(50) + 1;


  public IntPairs() {
    this.question = "Find pairs in an integer array whose sum is equal to a " +
            "random number (bonus: do it in linear time)";
  }

  @Override
  public void solve() {
    super.solve();

    int[] arr = new int[ARRAY_LENGTH];
    genIntArray(arr);

    System.out.println("Searching for pairs that sum to: " + PAIRED_SUM);

    HashSet<Integer> checkedInt = new HashSet<>();
    TreeMap<Integer, Integer> pairs = new TreeMap<>();
    for(int i : arr) {
      int oppoPair = PAIRED_SUM - i;

      if(oppoPair > 0 && checkedInt.contains(oppoPair)) {
        pairs.put(i, oppoPair);
      }

      checkedInt.add(i);
    }

    System.out.println("Pairs that sum to " + PAIRED_SUM + " are: \n" + pairs);
  }
}
