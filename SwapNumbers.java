// swap two numbers without third variable

import java.util.Scanner;

  public class SwapNumbers{

    public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter first number: ");

     int num1 = scanner.nextInt();

      System.out.print("Enter second number: ");

     int num2 = scanner.nextInt();

      swap(num1,num2);
}

   public static void swap(int num1 , int num2){


     System.out.println("Before Swapping num1= "+num1 +" "+ "num2= " +num2);

      num1 = num1 + num2;

      num2 = num1 - num2;

      num1 = num1 - num2;

    System.out.println("After Swapping num1= " + num1 +" "+ "num2= " + num2);

}

}