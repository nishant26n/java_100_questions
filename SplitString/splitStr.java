package SplitString;

public class splitStr {

  public static void main(String[] args) {
    String str = "This code is written by Nishant Rajpoot.";

    String[] words = str.split("\\s"); //splits the string based on whitespace

    for (String i : words) {
      System.out.println(i);
    }
  }
}
