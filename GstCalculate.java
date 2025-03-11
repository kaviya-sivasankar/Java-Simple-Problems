import java.util.Scanner;

  public class CGSTAndSGST{

   public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the amount of a product: ");

    int amount = scanner.nextInt();

    double cgst = 9.0/100 * amount;    

    double sgst = 11.0/100 * amount;

    double total = amount + cgst + sgst;

    System.out.println("The total amount to pay is: " + total);

  }

}