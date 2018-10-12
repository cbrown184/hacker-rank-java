package main.java.easy.javaIfElse;

import java.util.*;

public class Solution {



  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int N = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    //If N is odd, print Weird
    if (N%2 == 1)
      System.out.println("Weird");
    //If N is even and in the inclusive range of 2 to 5, print Not Weird
    if(N%2==0 && N>=2 && N<=5)
      System.out.println("Not Weird");
    //If  is even and in the inclusive range of 6 to 20, print Weird
    if(N%2==0 && N>=6 && N<=20)
      System.out.println("Weird");
    //If  is even and greater than 20, print Not Weird
    if(N%2==0 && N>20)
      System.out.println("Weird");

    scanner.close();
  }
}

