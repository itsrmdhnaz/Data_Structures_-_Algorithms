package Algorithms;

import java.util.Scanner;

public class sum_first_n {

  public static void main(String[] args) {
    /**
     * example
     * input n = 4
     * output 10 = 1 + 2 + 3 + 4
     *
     * input n = 5
     * output 15 = 1 + 2 + 3 + 4 + 5
     */
    Scanner sc = new Scanner(System.in);

    System.out.print("Insert number: ");
    int number = sc.nextInt();

    System.out.println(findSum(number));
    System.out.println(findSum2(number));

    sc.close();
  }

  /* Solve 1 with math formula */
  public static int findSum(int n) {
    return n * (n + 1) / 2;
  }

  /* Solve 2 with loop */
  public static int findSum2(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      sum += i;
    }
    return sum;
  }
}
