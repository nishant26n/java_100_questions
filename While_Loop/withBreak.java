package While_Loop;

import java.util.Scanner;

class withBreak {

  public static void main(String[] args) {
    int n;

    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.println("Input as an integer: ");
      n = scan.nextInt();

      if (n == 0) {
        break;
      }
      System.out.println("You entered: " + n);
    }

    scan.close();
  }
}
