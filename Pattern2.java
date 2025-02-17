//reverse 

import java.util.Scanner;

public class Pattern2{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("enter the number: ");

int num =scanner.nextInt();

for(int row = 1;row<=num;row++){

for(int column =1;column<=num-row+1;column++){

System.out.print(column);
}

System.out.println();

}
}
}