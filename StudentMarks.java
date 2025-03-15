import java.util.Scanner;

public class StudentMarks{

   public static void main(String[] args){

   Scanner sub = new Scanner(System.in);

   System.out.println("Enter  your marks for 5 subjects");
 
    int sub1 = sub.nextInt();

    int sub2 = sub.nextInt();

    int sub3 = sub.nextInt();

    int sub4 = sub.nextInt();

    int sub5 = sub.nextInt();

 if((sub1 >=0 && sub1 <= 100) && 
   (sub2 >=0 && sub2 <=100) &&
   (sub3 >=0 && sub3 <= 100) && 
  (sub4 >=0 && sub4 <= 100) && 
  (sub5 >=0 && sub5 <= 100)){

    int total = sub1 + sub2 + sub3 + sub4 + sub5;

      System.out.println("The sum of the marks: " + total);

   double percentage = total / 5.0;

     System.out.println("the % of your marks is: " + percentage);
   }
 }
}