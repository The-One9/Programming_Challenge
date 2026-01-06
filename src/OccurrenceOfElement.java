import InterviewChallenges.ArrayUtility;

import java.util.Scanner;

public class OccurrenceOfElement {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int [] arr= ArrayUtility.InputArray();
        System.out.print("Enter Your Element to be found:");
        int element=Sc.nextInt();
        int occ=occurrence(arr,element);
        System.out.println("Your Element is Found "+occ+" times");
    }
    public static int occurrence(int [] arr,int element){
        int occ=0;
                for(int num:arr){
                    if(num==element){
                        occ++;
                    }
                }
        return occ;
    }
}

