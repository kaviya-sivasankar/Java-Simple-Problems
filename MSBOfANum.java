import java.util.Scanner;

public class MSBOfANum{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("enter the number: ");

int number = sc.nextInt();

while(number > 10){

 number /= 10 ;
}
System.out.println("MSB of a number is: " + number);
}

}