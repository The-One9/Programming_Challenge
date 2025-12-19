//Number is leap year or not

import java.time.Year;
import java.util.Scanner;
public class Challenge13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year that you want to check:");
        int year=sc.nextInt();

        if (year%400 == 0){
            System.out.println("Year is a leap Year:"+year);
        } else if (year%4==0 && year%100 !=0) {
            System.out.println("Year is leap Year"+year);
        }else {
            System.out.println("Year is not a leap year"+year);
        }

   if (year%400==0 ||(year%4==0 && year%100 !=0)){
       System.out.println("Year is leap year:"+year);
   }else {
       System.out.println("Year is not leap year:"+ year);
   }



    }

}
