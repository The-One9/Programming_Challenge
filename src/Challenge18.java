//Bitwise XOR(^) operator
import java.util.Scanner;

public class Challenge18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st Number :");
        int a=sc.nextInt();
        System.out.print("Enter 2nd Number :");
        int b=sc.nextInt();

        int result= a ^ b;
        System.out.println("Result: "+result);
    }
}

