package Largest_number;

public class Largest {

  static int getLargest(int[] arr) {
    int temp;

    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr[arr.length - 1];
  }

  public static void main(String[] args) {
    int arr[] = { 1, 2, 8, 10, 6, 7 };

    System.out.println(getLargest(arr));
  }
}
