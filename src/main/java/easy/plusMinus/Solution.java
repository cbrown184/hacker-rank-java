package main.java.easy.plusMinus;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

  // Complete the plusMinus function below.

  static double roundDouble(double value, int places) {
    if (places < 0) throw new IllegalArgumentException();

    long factor = (long) Math.pow(10, places);
    value = value * factor;
    long tmp = Math.round(value);
    return (double) tmp / factor;
  }

  static void plusMinus(int[] arr) {

    Arrays.stream(arr).forEach(x -> {
      double pos = 0, neg = 0, zer =0;
      if(x > 0)
        pos ++;
      else if(x < 0)
        neg ++;
      else
        zer ++;

      System.out.println(roundDouble(arr.length/pos, 6));
      System.out.println(roundDouble(arr.length/neg, 6));
      System.out.println(roundDouble(arr.length/pos, 6));
    });

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    int n = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] arr = new int[n];

    String[] arrItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < n; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr[i] = arrItem;
    }

    plusMinus(arr);

    scanner.close();
  }

}
