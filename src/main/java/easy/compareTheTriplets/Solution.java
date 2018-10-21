package main.java.easy.compareTheTriplets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {


  static Integer[] compareTriplets(List<Integer> a, List<Integer> b) {

    Integer[] ar = {0, 0};
    IntStream.range(0, a.size())
        .parallel()
        .forEach(i -> {
          if (a.get(i) > b.get(i))
            ar[0]++;
          if (a.get(i) < b.get(i))
            ar[1]++;
        });

    return ar;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    List<Integer> b = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    Integer[] result = compareTriplets(a, b);

    bufferedWriter.write(
        Arrays.stream(result)
            .map(Object::toString)
            .collect(joining(" "))
            + "\n"
    );


    bufferedReader.close();
    bufferedWriter.close();
  }

}
