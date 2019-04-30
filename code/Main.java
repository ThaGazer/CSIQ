/*
 * Author: ThaGazer
 * File: null.java
 * Date: 4/26/2019
 */

import Solutions.*;

import java.util.*;

/**
 * This is just a place to write varying computer science interview questions
 */
public class Main {

  private static final String msgEntry = ":>";
  private static final String msgHelp = "help\nlist\n[section][problem] ex. a1";

  private static final String[][] Questions = {
          {"General",
                  "Find the most frequent int in an array",
                  "Find pairs in an integer array whose sum is equal to 10 (bonus: do it in linear time)",
                  "Given 2 integer arrays, determine of the 2nd array is a rotated version of the 1st array. Ex. Original Array A={1,2,3,5,6,7,8} Rotated Array B={5,6,7,8,1,2,3}",
                  "Write fibbonaci iteratively and recursively (bonus: use dynamic programming)",
                  "Write fibbonaci iteratively and recursively (bonus: use dynamic programming)",
                  "Find the common elements of 2 int arrays",
                  "Implement binary search of a sorted array of integers",
                  "Implement binary search in a rotated array (ex. {5,6,7,8,1,2,3})",
                  "Use dynamic programming to find the first X prime numbers",
                  "Write a function that prints out the binary form of an int",
                  "Implement parseInt",
                  "Implement squareroot function",
                  "Implement an exponent function (bonus: now try in log(n) time)",
                  "Write a multiply function that multiples 2 integers without using *",
                  "Given a function rand5() that returns a random int between 0 and 5, implement rand7()",
                  "Given a 2D array of 1s and 0s, count the number of \"islands of 1s\" (e.g. groups of connecting 1s)"},

          {"Strings",
                  "Find the first non-repeated character in a String",
                  "Reverse a String iteratively and recursively",
                  "Determine if 2 Strings are anagrams",
                  "Check if String is a palindrome",
                  "Check if a String is composed of all unique characters",
                  "Determine if a String is an int or a double",
                  "Find the shortest palindrome in a String",
                  "Print all permutations of a String"},

          {"Trees",
                  "Implement a BST with insert and delete functions",
                  "Print a tree using BFS and DFS",
                  "Write a function that determines if a tree is a BST",
                  "Find the smallest element in a BST",
                  "Find the 2nd largest number in a BST",
                  "Given a binary tree which is a sum tree (child nodes add to parent), write an algorithm to determine whether the tree is a valid sum tree",
                  "Find the distance between 2 nodes in a BST and a normal binary tree",
                  "Print the coordinates of every node in a binary tree, where root is 0,0",
                  "Print a tree by levels",
                  "Given a binary tree which is a sum tree, write an algorithm to determine whether the tree is a valid sum tree",
                  "Given a tree, verify that it contains a subtree.",
                  "Find the max distance between 2 nodes in a BST.",
                  "Construct a BST given the pre-order and in-order traversal Strings"},

          {"Lists",
                  "Implement a stack with push and pop functions",
                  "Implement a queue with queue and dequeue functions",
                  "Find the minimum element in a stack in O(1) time",
                  "Write a function that sorts a stack (bonus: sort the stack in place without extra memory)",
                  "Implement a binary min heap. Turn it into a binary max heap",
                  "Implement a queue using 2 stacks",
                  "Implement a linked list (with insert and delete functions)",
                  "Find the Nth element in a linked list",
                  "Remove the Nth element of a linked list",
                  "Check if a linked list has cycles",
                  "Given a circular linked list, find the node at the beginning of the loop. Example: A-->B-->C --> D-->E -->C, C is the node that begins the loop",
                  "Check whether a link list is a palindrome",
                  "Reverse a linked list iteratively and recursively"},

          {"Sorting",
                  "Implement bubble sort",
                  "Implement selection sort",
                  "Implement insertion sort",
                  "Implement merge sort",
                  "Implement quick sort"}
  };

  public static void main(String[] args) {
    Main m = new Main();
    Question quest = new Question();
    Scanner scn = new Scanner(System.in);

    do {
      System.out.print(msgEntry);

      String line = scn.nextLine();

      try {
        m.handleUserInput(line).Solve();
      } catch(Exception e) {
        System.err.println(e.getMessage());
        System.exit(1);
      }
    }while(true);
  }

  private Question handleUserInput(String line) throws Exception {
    switch(line) {
      case "list":
        listQuestions();
        break;
      case "help":
        listHelp();
        break;
      case "quit":
        System.exit(0);
        break;
      default:
        String[] lnSplit = line.split(" ");
        if(lnSplit.length == 2) {
          return selectProblem(lnSplit[0].charAt(0),
                  Integer.parseInt(lnSplit[1]));
        } else {
          throw new Exception("Unknown command");
        }
    }
    return new Question();
  }

  private Question selectProblem(char sec, int num) throws Exception {
    switch(sec) {
      case 'a':
        switch(num) {
          case 1:
            return new Question();
          case 2:
            return new Question();
          case 3:
            return new Question();
          case 4:
            return new Question();
          case 5:
            return new Question();
          case 6:
            return new Question();
          case 7:
            return new Question();
          case 8:
            return new Question();
          case 9:
            return new Question();
          case 10:
            return new Question();
          case 11:
            return new Question();
          case 12:
            return new Question();
          case 13:
            return new Question();
          case 14:
            return new Question();
          case 15:
            return new Question();
          default:
            throw new Exception("unknown section number");
        }
      case 'b':
        switch(num) {
          case 1:
            return new Question();
          case 2:
            return new Question();
          case 3:
            return new Question();
          case 4:
            return new Question();
          case 5:
            return new Question();
          case 6:
            return new Question();
          case 7:
            return new Question();
          case 8:
            return new Question();
          default:
            throw new Exception("unknown section number");
        }
      case 'c':

        switch(num) {
          case 1:
            return new Question();
          case 2:
            return new Question();
          case 3:
            return new Question();
          case 4:
            return new Question();
          case 5:
            return new Question();
          case 6:
            return new Question();
          case 7:
            return new Question();
          case 8:
            return new Question();
          case 9:
            return new Question();
          case 10:
            return new Question();
          case 11:
            return new Question();
          case 12:
            return new Question();
          case 13:
            return new Question();
          default:
            throw new Exception("unknown section number");
        }
      case 'd':
        switch(num) {
          case 1:
            return new Question();
          case 2:
            return new Question();
          case 3:
            return new Question();
          case 4:
            return new Question();
          case 5:
            return new Question();
          case 6:
            return new Question();
          case 7:
            return new Question();
          case 8:
            return new Question();
          case 9:
            return new Question();
          case 10:
            return new Question();
          case 11:
            return new Question();
          case 12:
            return new Question();
          case 13:
            return new Question();
          case 14:
            return new Question();
          default:
            throw new Exception("unknown section number");
        }
      case 'e':
        switch(num) {
          case 1:
            return new Question();
          case 2:
            return new Question();
          case 3:
            return new Question();
          case 4:
            return new Question();
          case 5:
            return new Question();
          default:
            throw new Exception("unknown section number");
        }
      default:
        throw new Exception("unknown question section");
    }
  }

  private void listQuestions() {
    for(int i = 0; i < Questions.length; i++) {
      for(int j = 0; j < Questions[i].length; j++) {
        if(j == 0) {
          System.out.println((char)('A'+i) + ". " + Questions[i][j]);
        } else {
          System.out.println("  " + j + ". " + Questions[i][j]);
        }
      }
    }
  }

  private void listHelp() {
    System.out.println(msgHelp);
  }
}
