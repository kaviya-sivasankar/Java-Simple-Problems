// Temperature Convertion from Celsius to Fahrenheit


import java.util.Scanner;

public class Temperature{

  public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a Celsius : ");

   double tempC = scanner.nextDouble();

   double tempF = tempC * (9.0/5.0) + 32;  

      System.out.println("Fahrenheit is : " + tempF);
      scanner.close();
   }
}
