package Prime_number;

public class prime {

  static boolean isPrime(int num) {
    if (num == 1 || num == 0) return false;

    for (int i = 2; i < num; i++) {
      if (num % i == 0) return false;
    }

    return true;
  }

  public static void main(String[] args) {
    int num = 100;

    for (int i = 1; i <= num; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }
}
