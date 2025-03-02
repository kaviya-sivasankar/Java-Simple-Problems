import java.util.Scanner;

public class CalculateHrsMinSec{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter the noOfDays: ");

int days = sc.nextInt();

int hours = days * 24;

int min = days * 24 * 60;

int sec = days * 24 * 60 * 60;

System.out.print("In " + days+ " " + "days it is " + hours +" hrs " + min + " minutes " + sec +" seconds");
}
}