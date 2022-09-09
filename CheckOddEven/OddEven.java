package CheckOddEven;

import java.util.Scanner;

public class OddEven {

  static void CheckingOddEven(int x) {
    if (x % 2 == 0) {
      System.out.println("Number is even");
    } else {
      System.out.println("Number is odd");
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int x = scan.nextInt();

    CheckingOddEven(x);

    scan.close();
  }
}
