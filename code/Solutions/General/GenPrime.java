/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 5/16/2019
 */
package Solutions.General;

import Solutions.Question;

import java.util.*;
import java.util.concurrent.atomic.AtomicBoolean;

public class GenPrime extends Question {

  private static TreeSet<Integer> primes = new TreeSet<>();

  public GenPrime() {
    this.question = "Use dynamic programming to find the first X prime numbers";
  }

  @Override
  public void solve() {
    int amount = new Random(System.currentTimeMillis()).nextInt(21)+1;
    System.out.println("Showing " + amount + " prime numbers:");

    System.out.println(nextSieve(amount));
  }

  private SortedSet<Integer> nextSieve(int amount) {
    if(primes.isEmpty()) {
      primes.add(2);
    }

    for(int i = Objects.requireNonNull(primes.last())+1; primes.size() < amount; i++) {
       if(!containsMultiple(i)) {
         primes.add(i);
       }
    }

    return subgroup(amount);
  }

  private boolean containsMultiple(int val) {
    AtomicBoolean ret = new AtomicBoolean(false);
    primes.forEach((k) -> {
      if((val%k) == 0) {
        ret.set(true);
      }
    });

    return ret.get();
  }

  //TODO this is stupid. Has to be better way to subset
  private SortedSet<Integer> subgroup(int amount) {
    SortedSet<Integer> sg = new TreeSet<>();

    Iterator<Integer> iter = primes.iterator();
    while(sg.size() < amount && iter.hasNext()) {
      sg.add(iter.next());
    }

    return sg;
  }
}
