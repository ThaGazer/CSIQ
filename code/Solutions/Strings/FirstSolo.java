/*
 * Author: ThaGazer
 * File:Solutions.Strings/ null.java
 * Date: 7/10/2019
 */
package Solutions.Strings;

import Solutions.Question;

import java.util.Random;

public class FirstSolo extends Question {

  private Random rnd = new Random(System.nanoTime());

  private final int ASCII_SPACE = 32;
  private final int ASCII_DEL = 127;

  public FirstSolo() {
    this.question = "Find the first non-repeated character in a String";
  }

  public void solution() {

  }

  private Character findSolo(String str) {
    Character cur = str.charAt(0), pre = cur;

    for(int i = 1; i < str.length(); i++) {
      cur = str.charAt(i);
      if(!cur.equals(pre)) {
        return pre;
      } else {
        pre = cur;
      }
    }
    return pre;
  }

  private String genString() {
    StringBuilder builder = new StringBuilder();

    for(int i = 0; i < rnd.nextInt(1000); i++) {
      builder.append(rnd.nextInt(ASCII_SPACE)+ASCII_DEL);
    }
      
    return builder.toString();
  }
}
