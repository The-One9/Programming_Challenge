package InterviewChallenges;

import java.util.Scanner;

public class challenge24Lcm {
    public static int LCM(int first,int second) {
         int i=1;
         while (i<=second){
             int factor=first*i;
             if(factor%second==0){
                 return factor;
             }
             i++;
         }

    return 0;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to LCM");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number:");
        int first=sc.nextInt();
        System.out.print("Enter Second Number");
        int second=sc.nextInt();
        int lcm=LCM(first,second);
        System.out.println("List Comman Factor "+first+" and "+second +" is "+lcm);
    }
}
