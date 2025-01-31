// Check Armstrong Number

import java.util.Scanner;

public class Armstrong{

public static void main(String[] args){

Scanner in = new Scanner(System.in);

int n = in.nextInt();

if(checkArmstrong(n)){

System.out.println(n + " is Armstrong number");

}
else {
System.out.println(n + " not a Armstrong number");

}


}

static Boolean checkArmstrong(int n){

int original = n;

int sum = 0;

while(n > 0){

int rem = n % 10; 

n = n / 10;

sum = sum + rem * rem * rem;

}

return sum == original;

}

}