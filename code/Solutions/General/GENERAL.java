package Solutions.General;

import Solutions.ProblemType;
import Solutions.Question;

import java.util.Objects;

public enum GENERAL implements ProblemType {
  FREQINT(1,"Find the most frequent int in an array") {
    @Override
    public Question getFunction() {
      return new FrequentInt();
    }
  },
  INTPAIR(2,"Find pairs in an integer array whose sum is equal to 10 (bonus: do it in linear time)") {
    @Override
    public Question getFunction() {
      return new IntPairs();
    }
  },
  ROTARR(3,"Given 2 integer arrays, determine of the 2nd array is a rotated version of the 1st array. Ex. Original Array A={1,2,3,5,6,7,8} Rotated Array B={5,6,7,8,1,2,3}") {
    @Override
    public Question getFunction() {
      return new RotatedArrays();
    }
  },
  ITERFIB(4,"Write fibonacci iteratively(bonus: use dynamic programming)") {
    @Override
    public Question getFunction() {
      return new IterFibonacci();
    }
  },
  RECURFIB(5,"Write fibonacci recursively (bonus: use dynamic programming)") {
    @Override
    public Question getFunction() {
      return new RecurFibonacci();
    }
  },
  COMELE(6,"Find the common elements of 2 int arrays") {
    @Override
    public Question getFunction() {
      return new CommonElements();
    }
  },
  BINSEARCH(7,"Implement binary search of a sorted array of integers") {
    @Override
    public Question getFunction() {
      return new BinarySearch();
    }
  },
  GENPRIME(8,"Use dynamic programming to find the first X prime numbers") {
    @Override
    public Question getFunction() {
      return new GenPrime();
    }
  },
  B2I(9,"Write a function that converts an binary to int") {
    @Override
    public Question getFunction() {
      return new Binary2Int();
    }
  },
  I2B(10,"Write a function that converts an int to binary") {
    @Override
    public Question getFunction() {
      return new Int2Binary();
    }
  },
  PARINT(11,"Implement parseInt") {
    @Override
    public Question getFunction() {
      return new ParseInt();
    }
  },
  SQUAREROOT(12,"Implement square root function") {
    @Override
    public Question getFunction() {
      return new SquareRoot();
    }
  },
  NMM(13,"Write a multiply function that multiples 2 integers without using *") {
    @Override
    public Question getFunction() {
      return new NonMultiMultiply();
    }
  },
  EXP(14,"Implement an exponent function (bonus: try in log(n) time)") {
    @Override
    public Question getFunction() {
      return new Exponent();
    }
  },
  RND5(15,"Implement rand5() that returns a number between 0 and 5") {
    @Override
    public Question getFunction() {
      return new Rand5();
    }
  },
  RND7(16,"Given a function rand5() that returns a random int between 0 and 5, implement rand7()") {
    @Override
    public Question getFunction() {
      return new Rand7();
    }
  },
  ISLANDGRP(17,"Given a 2D array of 1s and 0s, count the number of \"islands of 1s\" (e.g. groups of connecting 1s)") {
    @Override
    public Question getFunction() {
      return new IslandGroupings();
    }
  };

  private static final int LOWER_BOUND = 0;

  private static final String errIndexOB = "Index has exceeded the Lower Bound of General";

  private int index;
  private String description;

  GENERAL(int i, String descrip) {
    setIndex(i);
    setDescription(descrip);
  }

  private void setIndex(int i) {
    if(i < LOWER_BOUND) {
      throw new IllegalArgumentException(errIndexOB);
    }
    index = i;
  }

  private void setDescription(String descrip) {
    description = Objects.requireNonNull(descrip);
  }

  public int getIndex() {
    return index;
  }

  public String getDescription() {
    return description;
  }

  public static GENERAL getByIndex(int i) {
    for(GENERAL g : GENERAL.values()) {
      if(g.getIndex() == i) {
        return g;
      }
    }
    throw new IllegalArgumentException(Integer.toString(i));
  }

  public abstract Question getFunction();
}
