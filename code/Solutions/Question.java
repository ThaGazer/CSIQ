/*
 * Author: ThaGazer
 * File:Solutions/ null.java
 * Date: 4/30/2019
 */
package Solutions;

public class Question implements Problem {

  protected String question = "What is the meaning of being?";

  public Question() {
  }

  @Override
  public String getQuestion() {
    return question;
  }

  @Override
  public void solve() {
    System.out.println("To be or not to be");
  }
}
