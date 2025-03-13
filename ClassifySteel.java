import java.util.Scanner;
public class ClassifySteel{

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

int h = sc.nextInt() ;

float c  = sc.nextFloat();

int ts = sc.nextInt();

classifyGivenSteel(h,c,ts);
}

static void classifyGivenSteel(int h , float c, int ts){

if( h > 60 && c > 0.8 && ts > 5700)

System.out.println(" Class A");

else if(h > 60 && c > 0.8)

System.out.println("Class B");

else if(h > 60 &&  ts > 5700)

System.out.println("Class C");

else if( c > 0.8 && ts > 5700)

System.out.println("Class D");

else if (h > 60 || c > 0.8 || ts > 5700)

System.out.println("Class E");

else 

System.out.println( "Class F");

}
}