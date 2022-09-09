package Temperature_Conversion;

import java.util.Scanner;

public class Conversion {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter temperature in Fahrenhiet: ");
    double far_temp = scan.nextDouble();

    double cel_temp = (far_temp - 32) * 5 / 9;
    System.out.println("Temperature in Celcius: " + cel_temp);

    scan.close();
  }
}
