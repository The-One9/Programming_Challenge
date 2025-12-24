package InterviewChallenges;

import java.util.Scanner;

public class Challenge28ReverseNumber {
    public static int reverseNumber(int num){
        int reverse=0;
        while (num>0){
            int digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;

        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Reverse of a number");
        System.out.print("Enter Your Number: ");
        int num=sc.nextInt();
        int revNum=reverseNumber(num);
        System.out.println("Your Reversed Number:"+revNum);
    }
}
