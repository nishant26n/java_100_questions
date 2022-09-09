package Armstrong_number;

import java.util.Scanner;

public class armstrong {

  // 153 = (1*1*1)+(5*5*5)+(3*3*3)
  // where:
  // (1*1*1)=1
  // (5*5*5)=125
  // (3*3*3)=27
  // So:
  // 1+125+27=153

  static int power(int n, int r) {
    int p = 1;

    for (int i = 1; i <= r; i++) {
      p = p * n;
    }
    return p;
  }

  public static void main(String[] args) {
    int n, sum = 0, temp, remainder, digits = 0;

    Scanner scan = new Scanner(System.in);

    System.out.println(
      "Enter a number to check if the number is armstrong or not: "
    );
    n = scan.nextInt();

    temp = n;

    // Count number of digits
    while (temp != 0) {
      digits++;
      temp = temp / 10;
    }

    temp = n;

    while (temp != 0) {
      remainder = temp % 10;
      sum = sum + power(remainder, digits);
      temp = temp / 10;
    }

    if (n == sum) {
      System.out.println(n + " is an armstrong number");
    } else {
      System.out.println(n + " is not an armstrong number");
    }

    scan.close();
  }
}
