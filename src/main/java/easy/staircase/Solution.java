package main.java.easy.staircase;

import java.util.Scanner;

public class Solution {

  // Complete the staircase function below.
  static void staircase(int n) {
    System.out.println(n);
//    for (int i = 0; i < n; i++) {
//      System.out.println(i);
//
////      for (int j = 0; j < n; j++) {
////        if (i + j > n / 2) {
////          System.out.println("#");
////        }
////        else{
////          System.out.println(" ");
////        }
////      }
//    }
  }




  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    staircase(n);

    scanner.close();
  }

}
