package QaInterview;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        int num=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n=n/10;
        }
        if(num==sum){
            System.out.println(num+" is an Armstrong number");
        }else{
            System.out.println(num+" is not an Armstrong number");
        }
    }
}
