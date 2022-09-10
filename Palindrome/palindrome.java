package Palindrome;

import java.util.Scanner;

public class palindrome {

  static boolean palindromeOrNot(String str) {
    String nStr = "";
    char ch;

    for (int i = 0; i < str.length(); i++) {
      ch = str.charAt(i);
      nStr = ch + nStr;
    }

    if (str.equals(nStr)) {
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a string to check if palindrome or not: ");
    String str = scan.nextLine();

    System.out.println(palindromeOrNot(str));

    scan.close();
  }
}
