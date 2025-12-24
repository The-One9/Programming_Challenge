package Array;

import java.util.Scanner;

public class ArraySearching {
    public static boolean arrSearch(int[]arr,int num){
        int i=0;
        while (i< arr.length){
            if(arr[i]==num) {
                return true;
            }
            i++;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr={23,45,6,7,89,36,5,9,12,13};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int num= sc.nextInt();
        boolean arrSearch =arrSearch(arr,num);
        if (arrSearch){
            System.out.println("Your Number In The Array ");
        }else {
            System.out.println("Your Number Is Not In the Array");
        }
    }
}
