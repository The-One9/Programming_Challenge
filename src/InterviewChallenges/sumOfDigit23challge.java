package InterviewChallenges;

import java.util.Scanner;

public class sumOfDigit23challge {
    public static int sumofdigit(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num= num/10;

        }
        return sum;

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Sum of its Digits");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int num=sc.nextInt();
        int sum=sumofdigit(num);
        System.out.println("Sum of "+num+" is :"+sum);
    }
}
