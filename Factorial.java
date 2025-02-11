//Factorial

import java.util.Scanner;

  public class Factorial{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to find its Factorial: ");
 
        int n = scanner.nextInt();

        System.out.println(fact(n));

}

   static int fact(int n){

      int result = 1;

   if(n == 0){

      return 1;
  }

   for(int i=1; i <= n; i++){

     result *= i;
  }

     return result;
  }
}