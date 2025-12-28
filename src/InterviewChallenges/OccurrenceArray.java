package InterviewChallenges;

import java.util.Scanner;

public class OccurrenceArray {
    public static int Occurrence(int[] numArray,int num){
        int occ=0;
        int i=0;
        while(i<numArray.length){
            if(numArray[i]==num){
                occ++;
            }
                i++;

        }
        return occ;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] numArray=ArrayUtility.InputArray();
        System.out.print("Enter Your Number that You want find: ");
        int num=sc.nextInt();
        int occ=Occurrence(numArray,num);
        System.out.print("Your number "+ num +" is Found times "+occ);

    }
}
