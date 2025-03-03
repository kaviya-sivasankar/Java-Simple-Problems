import java.util.Scanner;

public class AddedFraction{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the firstNo: ");

double num1 = sc.nextDouble();

System.out.print("Enter the secondNo: ");

double num2 = sc.nextDouble();

double sum = num1+num2;

double answer = sum - (int)sum;

System.out.println("the answer is: " + answer);
}
}