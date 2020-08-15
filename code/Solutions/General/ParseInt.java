/*
 * Author: ThaGazer
 * File:Solutions.General/ null.java
 * Date: 5/22/2019
 */
package Solutions.General;

import Solutions.Question;
import java.util.Random;

public class ParseInt extends Question {

  private Random rnd = new Random(System.currentTimeMillis());

  public ParseInt() {
    this.question = "Implement parseInt";
  }

  @Override
  public void solution() {
    String strInt = genInt(rnd.nextInt(8)+1);
    System.out.println("String:" + strInt);
    System.out.println("Integer:" + parseInt(strInt));
  }

  private String genInt(int size) {
    StringBuilder num = new StringBuilder();
    for(int i = 0; i < size; i++) {
      num.append(rnd.nextInt(9));
    }
    return num.toString();
  }

  private long parseInt(String num) {
    long convertNum = 0;
    for(int i = 0, j = num.length()-1; i < num.length(); i++,j--) {
      convertNum += (Character.getNumericValue(num.charAt(i))*(int)(Math.pow(10,j)));
    }
    return convertNum;
  }
}
