import java.util.Scanner;

//Create a program to calculate product of two floating point numbers
public class Challenge5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Floating Number A:");
        float a=sc.nextFloat();
        System.out.print("Enter Second Floating Number A:");
        float b=sc.nextFloat();

        float mul=a*b;
        System.out.println("Product of two Floating Points:"+ mul);
    }
}
