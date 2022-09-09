package SimpleForLoop;

public class SimpleFor {

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println("Hello");
    }

    for (int i = 0; i < 5; i++) {
      for (int j = i + 1; j < 5; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
