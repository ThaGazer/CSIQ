package Solutions.General;

import Solutions.Question;
import java.util.Random;

public class Rand5 extends Question {

  public Rand5() {
    this.question = "Implement rand5() that returns a number between 0 and 5";
  }

  @Override
  public void solution() {
    System.out.println(rand5());
  }

  int rand5() {
    return new Random().nextInt(5);
  }
}
