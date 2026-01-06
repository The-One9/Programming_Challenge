import InterviewChallenges.ArrayUtility;

import java.util.Scanner;

public class MaxArray63 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr= ArrayUtility.InputArray();
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            if(max<num){
                max=num;
            }
        }
        System.out.println("Maximum Number is "+max);
    }
}
