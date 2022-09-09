package Swapping_without_variable;

public class WithoutVariable {

  public static void main(String[] args) {
    int x = 10;
    int y = 20;

    // Swapping without third variable
    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println(x);
    System.out.println(y);
  }
}
