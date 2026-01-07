import InterviewChallenges.ArrayUtility;

import java.util.Scanner;

public class SumPositive66 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to sum of positive Numbers");
        int[]arr= ArrayUtility.InputArray();

        int sum=0;
        for(int num:arr){
            if(num<0){
                continue;
            }
            sum+=num;

        }
        System.out.println("Sum of positive number:"+sum);

    }
}
