package Factorial;

import java.util.Scanner;

public class Factorial {

  public static int solveFactorial(int num) {
    int fact = 1;
    for (int i = 1; i <= num; i++) {
      fact = fact * i;
    }
    return fact;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = scan.nextInt();

    System.out.println(solveFactorial(num));
    scan.close();
  }
}
