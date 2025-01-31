import java.util.Scanner;

  public class CheckPrime{

     public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

    if(isPrime(n)){

        System.out.println(n +" " + "is prime number");

     }
    else{
       System.out.println(n +" " + "Not a prime Number");

     }

      in.close();
     }


    public static boolean isPrime(int n){


      if(n <= 1){    

        return false;   // Not a Prime

     }

     if(n % 2 == 0 || n % 3 == 0){

       return false;   // Not a Prime

     }

     for(int i = 5; i * i <= n; i+=6){

     if(n % i == 0 || n % (i+2) == 0)    //Not a prime 

       return false;

     }
       return true;

    }

}