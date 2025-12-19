import java.util.Scanner;

//create a program of two number that performs all (+,-,*,/,%).
public class Challenge4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter First Number A:");
        int a= sc.nextInt();
        System.out.print("Enter second Number B:");
        int b= sc.nextInt();
        System.out.println("Addtion of two number:"+ (a+b));
        System.out.println("Substraction of two number:"+ (a-b));
        System.out.println("Multiplication of two number:"+ a*b);
        System.out.println("Division of two number:"+ a/b);
        System.out.println("Modulus of two number:"+ a%b);
    }
}
