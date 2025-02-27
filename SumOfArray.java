//sum of elements of an array

import java.util.Scanner;

  public class SumOfArray{

   public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the size of an array: ");

    int n = scanner.nextInt();

    int[] arr = new int[n];

       System.out.println("Enter the elements of an array");

   for(int i = 0; i<n; i++){

    arr[i] = scanner.nextInt();

}

   int sum = 0;

   for(int num : arr){

     sum += num;

}

   System.out.print("The sum of an array is: " + sum);

   scanner.close();

 }
}



