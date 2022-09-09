package SubString_of_String;

import java.util.Scanner;

public class substring {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter a string: ");
    String str = scan.nextLine();

    String sub;

    for (int i = 0; i < str.length(); i++) {
      for (int j = i + 1; j <= str.length(); j++) {
        sub = str.substring(i, j);
        System.out.println(sub);
      }
    }

    scan.close();
  }
}
