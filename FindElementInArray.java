//find the element in an array

import java.util.Scanner;

  public class FindElementInArray{

     public static void main(String[] args){

       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the size of an array: ");

     int n = scanner.nextInt();

     int[] arr = new int[n];

      System.out.println("Enter the elements of an array: ");

   for(int i=0; i<n; i++){

    arr[i]= scanner.nextInt();

  }

     System.out.print("Enter the element to search: ");

    int key = scanner.nextInt();

    boolean found = false;

  for(int i = 0; i < n; i++){

    if(key == arr[i]){

      found = true;

      System.out.println("The element" + " " + key + " " + "is found in an array");

     break;

   }

  }

    if(!found){

     System.out.println("The element " + " " +key+ " " + "is not found ");

}

    scanner.close();


   }
}

