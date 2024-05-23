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

    System.out.println("Insert number: ");
    int number = sc.nextInt();

    System.out.println(findSum(number));

    sc.close();
  }

  /* Solve 1 with math formula */
  public static int findSum(int n) {
    return n * (n + 1) / 2;
  }
}
/* Solve 2 */
