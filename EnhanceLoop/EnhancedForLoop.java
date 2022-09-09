package EnhanceLoop;

public class EnhancedForLoop {

  static void forInteger() {
    int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23 };

    for (int i : primes) {
      System.out.println(i);
    }
  }

  static void forString() {
    String languages[] = { "C++", "Java", "Pyhton", "Javascript" };

    for (String i : languages) {
      System.out.println(i);
    }
  }

  public static void main(String[] args) {
    forInteger();
    forString();
  }
}
