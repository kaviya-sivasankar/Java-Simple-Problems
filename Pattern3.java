// 

import java.util.Scanner;

public class Pattern3{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");

int number = scanner.nextInt();

for(int row = 0; row <= 2*number; row++){

int totColInRow = row > number? 2*number - row: row;

for(int column = 0; column<totColInRow; column++){

System.out.print("* ");

}

System.out.println();
}
}
}