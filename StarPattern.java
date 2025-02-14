//star-pattern-1

import java.util.Scanner;

  public class StarPattern{

    public static void main(String[] args){

      Scanner scanner = new Scanner(System.in);

         System.out.print("Enter the number to print star pattern: ");

         int num = scanner.nextInt();

      for(int row = 1; row<=num; row++){

        for(int column = 1; column<=row; column++){

          System.out.print("* ");
   }
          System.out.println();

   }
 }
}