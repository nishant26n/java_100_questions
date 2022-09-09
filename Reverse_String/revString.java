package Reverse_String;

import java.util.Scanner;

public class revString {

  static void Rev_String(String str) {
    String nStr = "";
    char ch;

    System.out.println("Original word: " + str);

    for (int i = 0; i < str.length(); i++) {
      ch = str.charAt(i);
      nStr = ch + nStr;
    }
    System.out.println("Reverse Word: " + nStr);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String str = scan.nextLine();

    Rev_String(str);

    scan.close();
  }
}
