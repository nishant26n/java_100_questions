package CompareTwoString;

import java.util.Scanner;

public class compare {

  static void comaparision(String str1, String str2) {
    int l1 = str1.length();
    int l2 = str2.length();

    if (l1 > l2) {
      System.out.println(l1 - l2);
    } else if (l2 > l1) {
      System.out.println(l2 - l1);
    } else {
      System.out.println("0");
    }
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter String one: ");
    String str1 = scan.nextLine();

    System.out.println("Enter String two: ");
    String str2 = scan.nextLine();

    comaparision(str1, str2);

    scan.close();
  }
}
