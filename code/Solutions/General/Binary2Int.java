/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 5/10/2019
 */
package Solutions.General;

import Solutions.Question;


public class Binary2Int extends Question {

  public Binary2Int() {
    this.question = "Write a function that converts an int to binary";
  }

  @Override
  public void solve() {
    int randInt = 128;

    int2bin(randInt);

    System.out.println(randInt + " in binary is ");
  }

  private byte[] int2bin(int x) {
    byte[] i2b = new byte[4];

    for(int i = 0; i < 4; i++) {
      i2b[i] = (byte)((x >> 2^i) & 0xFFFF);
    }
    return i2b;
  }
}
