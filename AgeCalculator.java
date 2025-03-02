import java.util.Scanner;

import java.time.Period;

import java.time.LocalDate;

public class AgeCalculator{

   public static void main(String[] args){

     Scanner scanner = new Scanner(System.in);

       System.out.print("Enter the year : ");

     int year = scanner.nextInt();

      System.out.print("Enter the month : ");

     int month = scanner.nextInt();

      System.out.print("Enter the date : ");

     int date = scanner.nextInt();

     LocalDate today = LocalDate.now();

     LocalDate birthday  = LocalDate.of(year,month,date);

    int age = Period.between(birthday,today).getYears();

      System.out.println("Age is: " + age);
  }
}