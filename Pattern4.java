import java.util.Scanner;

public class Pattern4{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");

int num = scanner.nextInt();

for(int row = 0; row<2*num;row++){

int totColInRow = row > num? 2*num - row:row;


int totNoOfSpace = num - totColInRow;

for(int space =0; space<=totNoOfSpace;space++){

System.out.print(" ");

}

for(int column = 0; column<totColInRow; column++){

System.out.print("* ");

}

System.out.println();

}

}

}