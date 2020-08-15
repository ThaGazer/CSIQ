package Solutions;

import Solutions.General.GENERAL;

public interface ProblemType {
  int getIndex();
  String getDescription();
  abstract Question getFunction();
}
