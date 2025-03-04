import java.util.Scanner;

public class Taxifares{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.print("Enter Taxi Number: ");

String taxiNo = sc.next();

System.out.print("Enter distance travelled: ");

int distance = sc.nextInt();

int amount = 0;

if(distance >0){

if(distance <= 5){

amount = 100;
}
else if(distance <= 15)

amount = 100 + (distance -5)*10;

else if(distance <= 25)

amount = 100 + (10*10) + (distance - 15) * 8;

else

amount = 100 + (10*10) + (10*8) + (distance - 25)*5;

System.out.println("Taxi No: " + taxiNo);

System.out.println("Distance Covered: " + distance);

System.out.println("Amount: " + amount);
}
}
}
