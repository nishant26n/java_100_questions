package IndexOf;

public class indexOf {

  public static void main(String[] args) {
    String str1 = "This is String one";

    // Passing substring

    int index1 = str1.indexOf("one");
    int index2 = str1.indexOf("String");

    System.out.println(
      "Index one is " + index1 + " and index two is " + index2
    );
  }
}
