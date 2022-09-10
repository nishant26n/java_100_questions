package Matrix;

public class transpose {
  static final int size = 4;

  static void transposeMatrix(int A[][], int B[][]) {
    int i, j;
    for (i = 0; i < size; i++) for (j = 0; j < size; j++) B[i][j] = A[j][i];
  }

  public static void main(String[] args) {
    int A[][] = {
      { 1, 1, 1, 1 },
      { 2, 2, 2, 2 },
      { 3, 3, 3, 3 },
      { 4, 4, 4, 4 },
    };

    int B[][] = new int[size][size], i, j;

    transposeMatrix(A, B);

    System.out.println("\nResultant matrix: ");

    for (i = 0; i < size; i++) {
      for (j = 0; j < size; j++) {
        System.out.print(B[i][j] + " ");
      }
      System.out.println();
    }
  }
}
