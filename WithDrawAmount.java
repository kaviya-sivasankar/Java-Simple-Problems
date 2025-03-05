import java.util.Scanner;

public class WithDrawAmount{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter how many 100 rupee note you want: ");

int noOFhundred = scanner.nextInt();

System.out.print("Enter how many 500 rupee note you want: ");

int noOfFiveHundred = scanner.nextInt();

System.out.print("Enter how many 1000 rupee note you want: ");

int noOfThousand = scanner.nextInt();

int totalAmount = noOFhundred*100 +noOfFiveHundred*500 + noOfThousand *1000;

System.out.print("the total amount is : " + totalAmount);

}

}