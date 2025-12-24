package InterviewChallenges;

import java.util.Scanner;

//factorial of number
public class Challenge22factorialNumber {
    public static long factorialNumber(int num){
        long fact = 1;
        int i=2;
        while (i<=num){
            fact *=i;
            i++;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to factorial of Number");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number:");
        int num=sc.nextInt();
        long fact=factorialNumber(num);
        System.out.println("Factorial of "+num+ "=" +fact);
    }
}
