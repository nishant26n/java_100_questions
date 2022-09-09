package Pink_Floyds_Triangle;

public class pinkfloyd {

  public static void main(String[] args) {
    int k = 1;

    for (int i = 1; i < 15; i++) {
      for (int j = 1; j < i; j++) {
        System.out.print(k + " ");
        k++;
      }
      System.out.println();
    }
  }
}
