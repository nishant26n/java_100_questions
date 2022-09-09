package While_Loop;

import java.util.Scanner;

public class breakAndCont {

  public static void main(String[] args) {
    int n;

    Scanner scan = new Scanner(System.in);
    while (true) {
      System.out.println("Input as an integer: ");
      n = scan.nextInt();

      if (n != 0) {
        System.out.println("You entered " + n);
        continue;
      } else break;
    }

    scan.close();
  }
}
