package InterviewChallenges;

import java.util.Scanner;

public class ArrayAvgSum {
    public static long sum(int[]numArray){
        long sum=0;
        int i=0;
        while(i<numArray.length) {
            sum+=numArray[i];
            i++;
        }
        return sum;

        }
    public static int average(int[]numArray){
        long sum=sum(numArray);
        return (int)(sum/ numArray.length);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Array Sum of Average");
        int[] numArray=ArrayUtility.InputArray();
        long sum=sum(numArray);
        int avg=average(numArray);
        System.out.println("Sum of Number is "+sum);
        System.out.println("Average of Number is "+avg);




    }
}
