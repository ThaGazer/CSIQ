/*
 * Author: ThaGazer
 * File: null.java
 * Date: 4/26/2019
 */
package Solutions;

import java.util.Objects;

public class Question {

  //messages to be prints to user
  private static final String msgBaseQuestion = "What does life even mean...";

  protected String questionName;

  public Question() {
  }

  public Question(String name) throws Exception {
    if(Objects.nonNull(name)) {
      questionName = name;
    } else {
      throw new Exception();
    }
  }

  public void Solve() {
    System.out.println(msgBaseQuestion);
  }
}
