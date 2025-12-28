package InterviewChallenges;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] InputArray(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Element:");
        int size=sc.nextInt();
        int[] arr=new int[size];
        int i=0;
        while(i<size){
            System.out.print("Enter Your Number of Element"+(i+1)+": ");
            arr[i]= sc.nextInt();
            i++;
        }
        return arr;
    }
}
