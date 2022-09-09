package UserInput;

import java.util.Scanner;

public class Input {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Entet an Integer value and a string value: ");
    // Integer input
    int x = scan.nextInt();
    //String input
    String str = scan.nextLine();

    //Printing Integer value
    System.out.println("Integer: " + x);

    //Printing String value
    System.out.println("String: " + str);

    scan.close();
  }
}
