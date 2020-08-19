/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 8/18/2019
 */
package Solutions.General;

import Solutions.Question;

public class FizzBuzz extends Question {

  private static final String fizz = "fizz";
  private static final String buzz = "buzz";

  public FizzBuzz() {}

  @Override
  public boolean solve(int i) {
    switch(i) {
      case 0:
        solution();
        break;
      case 1:
        solution1();
        break;
      case 2:
        solution2();
        break;
      case 3:
        solution3();
        break;
      default:
        return false;
    }
    return true;
  }

  @Override
  public void solution() {
    for(int i = 0; i < 10000; i++) {
      System.out.print(i+": ");

      if(i % 3 == 0 && i % 5 == 0) {
        System.out.println(fizz+buzz);
      } else if(i % 3 == 0) {
        System.out.println(fizz);
      } else if(i % 5 == 0) {
        System.out.println(buzz);
      } else {
        System.out.println("x");
      }
    }
  }

  private void solution1() {
    for(int i = 0; i < 10000; i++) {
      System.out.print(i+": ");

      if(i % 15 == 0 ) {
        System.out.println(fizz+buzz);
      } else if(i % 3 == 0) {
        System.out.println(fizz);
      } else if(i % 5 == 0) {
        System.out.println(buzz);
      } else {
        System.out.println("x");
      }
    }
  }

  private void solution2() {
    StringBuilder message = new StringBuilder();

    for(int i = 0; i < 10000; i++) {
      message.append(i).append(": ");

      if(i % 15 == 0 ) {
        message.append(fizz).append(buzz).append("\n");
      } else if(i % 3 == 0) {
        message.append(fizz).append("\n");
      } else if(i % 5 == 0) {
        message.append(buzz).append("\n");
      } else {
        message.append("x\n");
      }
    }

    System.out.println(message.toString());
  }

  private void solution3() {
    for(int i = 0; i < 10000; i++) {

    }
  }
}
