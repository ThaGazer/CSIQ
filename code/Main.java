/*
 * Author: ThaGazer
 * File: null.java
 * Date: 4/26/2019
 */


import Solutions.*;
import Solutions.General.*;

import java.util.*;

/**
 * This is just a place to write varying computer science interview questions
 */
public class Main {

  private static final String msgEntry = ":>";
  private static final String msgHelp = "Commands:\n\nhelp\nlist\n[section][problem] ex. a1";

  private static final String[][] Questions = {
          {"General",
                  "Find the most frequent int in an array",
                  "Find pairs in an integer array whose sum is equal to 10 (bonus: do it in linear time)",
                  "Given 2 integer arrays, determine of the 2nd array is a rotated version of the 1st array. Ex. Original Array A={1,2,3,5,6,7,8} Rotated Array B={5,6,7,8,1,2,3}",
                  "Write fibonacci iteratively(bonus: use dynamic programming)",
                  "Write fibonacci recursively (bonus: use dynamic programming)",
                  "Find the common elements of 2 int arrays",
                  "Implement binary search of a sorted array of integers",
                  "Use dynamic programming to find the first X prime numbers",
                  "Write a function that converts an binary to int",
                  "Write a function that converts an int to binary",
                  "Implement parseInt",
                  "Implement square root function",
                  "Write a multiply function that multiples 2 integers without using *",
                  "Implement an exponent function (bonus: try in log(n) time)",
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
                  "Print a tree using BFS",
                  "Print a tree using DFS",
                  "Implement a BST with insert and delete functions",
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
                  "Construct a BST given the pre-order traversal Strings",
                  "Construct a BST given the In-order traversal Strings"},
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
                  "Given a circular linked list, find the node at the beginning of the loop. Example: A-->B-->C-->D-->E-->C, C is the node that begins the loop",
                  "Check whether a link list is a palindrome",
                  "Reverse a linked list iteratively",
                  "Reverse a linked list recursively"},
          {"Sorting",
                  "Implement bubble sort",
                  "Implement selection sort",
                  "Implement insertion sort",
                  "Implement merge sort",
                  "Implement quick sort"}
  };

  public static void main(String[] args) {
    Main m = new Main();
    Scanner scn = new Scanner(System.in);

    do {
      System.out.print(msgEntry);
      String line = scn.nextLine();

      try {
        //TODO return loop continuation /or no need to loop forever?
        m.handleUserInput(line.split(" "));
      } catch(Exception e) {
        System.err.println(e.getMessage());
        System.exit(1);
      }
    } while(true);
  }

  private void handleUserInput(String[] commands) throws Exception {
    switch(commands[0]) {
      case "list":
      case "l":
        listQuestions(commands);
        break;
      case "help":
      case "h":
        printHelp();
        break;
      case "quit":
      case "q":
      case "exit":
        System.exit(0);
        break;
      default:
        handleQuestionSolution(commands);
    }
  }

  private void handleQuestionSolution(String[] command) throws Exception {
    Question quest;

    if(command.length == 2) {
      quest = Objects.requireNonNull(selectProblem(command[0].charAt(0),
              Integer.parseInt(command[1])));

      System.out.println("Question: " + quest.getQuestion() + "\n");
      quest.solve();
    } else {
      throw new Exception("Unknown command");
    }
  }

  private Question selectProblem(char sec, int num) throws Exception {
    switch(sec) {
      case 'a':
        switch(num) {
          case 1:
            return new FrequentInt();
          case 2:
            return new IntPairs();
          case 3:
            return new RotatedArrays();
          case 4:
            return new IterFibonacci();
          case 5:
            return new RecurFibonacci();
          case 6:
            return new CommonElements();
          case 7:
            return new BinarySearch();
          case 8:
            return new GenPrime();
          case 9:
            return new Binary2Int();
          case 10:
            //TODO I2B
            return new Question();
          case 11:
            return new ParseInt();
          case 12:
            return new SquareRoot();
          case 13:
            return new NonMultiMultiply();
          case 14:
            return new Exponent();
          case 15:
            //TODO Rand7
            return new Question();
          case 16:
            //TODO IslandGroupings
            return new Question();
          default:
            throw new Exception("unknown section number");
        }
      case 'b':
        switch(num) {
          case 1:
            //TODO NonRepeat
            return new Question();
          case 2:
            //TODO ItrReverse
            return new Question();
          case 3:
            //TODO RecurReverse
            return new Question();
          case 4:
            //TODO Anagrams
            return new Question();
          case 5:
            //TODO Palindrome
            return new Question();
          case 6:
            //TODO MinPalindrome
            return new Question();
          case 7:
            //TODO Unique
            return new Question();
          case 8:
            //TODO IsNum
            return new Question();
          case 9:
            //TODO Permutations
            return new Question();
          default:
            throw new Exception("unknown section number");
        }
      case 'c':

        switch(num) {
          case 1:
            //TODO OutBFS
            return new Question();
          case 2:
            //TODO OutDFS
            return new Question();
          case 3:
            //TODO BST
            return new Question();
          case 4:
            //TODO IsBST
            return new Question();
          case 5:
            //TODO MinElement
            return new Question();
          case 6:
            //TODO NextMinElement
            return new Question();
          case 7:
            //TODO IsSumTree
            return new Question();
          case 8:
            //TODO NodeDistance
            return new Question();
          case 9:
            //TODO NodeCoordinates
            return new Question();
          case 10:
            //TODO TreeByLevel
            return new Question();
          case 11:
            //TODO IsSumTree
            return new Question();
          case 12:
            //TODO ContainsSubTree
            return new Question();
          case 13:
            //TODO PreOrderTraversal
            return new Question();
          case 14:
            //TODO InOrderTraversal
            return new Question();
          default:
            throw new Exception("unknown section number");
        }
      case 'd':
        switch(num) {
          case 1:
            //TODO Stack
            return new Question();
          case 2:
            //TODO Queue
            return new Question();
          case 3:
            //TODO MinStack
            return new Question();
          case 4:
            //TODO SortedStack
            return new Question();
          case 5:
            //TODO MinHeap
            return new Question();
          case 6:
            //TODO Que2Stacks
            return new Question();
          case 7:
            //TODO LinkedList
            return new Question();
          case 8:
            //TODO ContainsElement
            return new Question();
          case 9:
            //TODO RemoveNthElement
            return new Question();
          case 10:
            //TODO ContainsCycle
            return new Question();
          case 11:
            //TODO FindStartNode
            return new Question();
          case 12:
            //TODO ContainsPalindrome
            return new Question();
          case 13:
            //TODO ReverseIteratively
            return new Question();
          case 14:
            //TODO ReverseRecursively
            return new Question();
          default:
            throw new Exception("unknown section number");
        }
      case 'e':
        switch(num) {
          case 1:
            //TODO BubbleSort
            return new Question();
          case 2:
            //TODO SelectionSort
            return new Question();
          case 3:
            //TODO InsertionSort
            return new Question();
          case 4:
            //TODO MergeSort
            return new Question();
          case 5:
            //TODO QuickSort
            return new Question();
          default:
            throw new Exception("unknown section number");
        }
      default:
        throw new Exception("unknown question section");
    }
  }

  private void listQuestions(String[] command) {
    switch(command.length) {
      case 1:
        for(int i = 0; i < Questions.length; i++) {
          printQuestionGroup(i);
        }
        break;
      case 2:
        printQuestionGroup(command[1].toLowerCase().charAt(0) - 'a');
        break;
      case 3:
        printQuestion(command[1].toLowerCase().charAt(0) - 'a', Integer.parseInt(command[2]));
        break;
    }
  }

  private void printQuestionGroup(int idx) {
    if(idx >= 0 && idx < Questions.length) {
      System.out.print((char) ('A' + idx) + ". ");
      for(int i = 0; i < Questions[idx].length; i++) {
        printQuestion(idx, i);
      }
    }
  }

  private void printQuestion(int i, int j) {
    if(j == 0) {
      System.out.println(Questions[i][j]);
    } else {
      System.out.println("  " + j + ". " + Questions[i][j]);
    }
  }

  private void printHelp() {
    System.out.println(msgHelp);
  }
}
