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
  private static final String msgHelp = "help\nlist\n[section][problem] ex. a1";

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
        //TODO return loop continuation/no need to loop forever
        m.handleUserInput(line);

      } catch(Exception e) {
        System.err.println(e.getMessage());
        System.exit(1);
      }
    }while(true);
  }

  private void handleUserInput(String line) throws Exception {
    switch(line) {
      case "list":
      case "l":
        listQuestions();
        break;
      case "help":
      case "h":
        listHelp();
        break;
      case "quit":
      case "q":
      case "exit":
        System.exit(0);
        break;
      default:
        handleQuestionSolution(line);    
    }
  }
  
  private void handleQuestionSolution(String line) throws Exception {
    Question quest;
    String[] lnSplit = line.split(" ");
    
    if(lnSplit.length == 2) {
      quest = Objects.requireNonNull(selectProblem(lnSplit[0].charAt(0),
              Integer.parseInt(lnSplit[1])));

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
            return null;
          case 11:
            return new ParseInt();
          case 12:
            return new SquareRoot();
          case 13:
            return new NonMultiMultiply();
          case 14:
            //TODO Exponent
            return null;
          case 15:
            //TODO Rand7
            return null;
          case 16:
            //TODO IslandGroupings
            return null;
          default:
            throw new Exception("unknown section number");
        }
      case 'b':
        switch(num) {
          case 1:
            //TODO NonRepeat
            return null;
          case 2:
            //TODO ItrReverse
            return null;
          case 3:
            //TODO RecurReverse
            return null;
          case 4:
            //TODO Anagrams
            return null;
          case 5:
            //TODO Palindrome
            return null;
          case 6:
            //TODO MinPalindrome
            return null;
          case 7:
            //TODO Unique
            return null;
          case 8:
            //TODO IsNum
            return null;
          case 9:
            //TODO Permutations
            return null;
          default:
            throw new Exception("unknown section number");
        }
      case 'c':

        switch(num) {
          case 1:
            //TODO OutBFS
            return null;
          case 2:
            //TODO OutDFS
            return null;
          case 3:
            //TODO BST
            return null;
          case 4:
            //TODO IsBST
            return null;
          case 5:
            //TODO MinElement
            return null;
          case 6:
            //TODO NextMinElement
            return null;
          case 7:
            //TODO IsSumTree
            return null;
          case 8:
            //TODO NodeDistance
            return null;
          case 9:
            //TODO NodeCoordinates
            return null;
          case 10:
            //TODO TreeByLevel
            return null;
          case 11:
            //TODO IsSumTree
            return null;
          case 12:
            //TODO ContainsSubTree
            return null;
          case 13:
            //TODO PreOrderTraversal
            return null;
          case 14:
            //TODO InOrderTraversal
            return null;
          default:
            throw new Exception("unknown section number");
        }
      case 'd':
        switch(num) {
          case 1:
            //TODO Stack
            return null;
          case 2:
            //TODO Queue
            return null;
          case 3:
            //TODO MinStack
            return null;
          case 4:
            //TODO SortedStack
            return null;
          case 5:
            //TODO MinHeap
            return null;
          case 6:
            //TODO Que2Stacks
            return null;
          case 7:
            //TODO LinkedList
            return null;
          case 8:
            //TODO ContainsElement
            return null;
          case 9:
            //TODO RemoveNthElement
            return null;
          case 10:
            //TODO ContainsCycle
            return null;
          case 11:
            //TODO FindStartNode
            return null;
          case 12:
            //TODO ContainsPalindrome
            return null;
          case 13:
            //TODO ReverseIteratively
            return null;
          case 14:
            //TODO ReverseRecursively
            return null;
          default:
            throw new Exception("unknown section number");
        }
      case 'e':
        switch(num) {
          case 1:
            //TODO BubbleSort
            return null;
          case 2:
            //TODO SelectionSort
            return null;
          case 3:
            //TODO InsertionSort
            return null;
          case 4:
            //TODO MergeSort
            return null;
          case 5:
            //TODO QuickSort
            return null;
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
