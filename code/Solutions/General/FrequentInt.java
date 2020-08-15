/*
 * Author: ThaGazer
 * File:Solutions/ null.java
 * Date: 4/30/2019
 */
package Solutions.General;

import Solutions.Question;

import java.util.HashMap;
import java.util.Random;

public class FrequentInt extends Question {

  private int ARRAY_LENGTH = new Random().nextInt(50) + 1;

  public FrequentInt() {
    this.question = "Find the most frequent int in an array";
  }

  @Override
  public void solution() {
    int[] arr = new int[ARRAY_LENGTH];
    genIntArray(arr);

    //sort then count streaks
    //double loop search
    //mapping
    //...
    HashMap<Integer, Integer> freqInt = new HashMap<>();

    for(int i : arr) {
      if(freqInt.containsKey(i)) {
        freqInt.replace(i, freqInt.get(i)+1);
      } else {
        freqInt.put(i, 1);
      }
    }

    int mostFreq = 0;
    int mostVal = -1;

    System.out.println("Count:");
    for(Integer i : freqInt.keySet()) {
      if(freqInt.get(i) > mostFreq) {
        mostFreq = freqInt.get(i);
        mostVal = i;
      }
      System.out.println(i + " : " + freqInt.get(i));
    }
    System.out.println("The most frequent integer is: " + mostVal);
  }
}
