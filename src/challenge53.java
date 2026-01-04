import java.util.Scanner;

public class challenge53 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to find to minimum of two number");
        System.out.println("Enter Your First Number: ");
        int num1= sc.nextInt();
        System.out.println("Enter Your Second Number: ");
        int num2=sc.nextInt();

        int minimum=num1<num2?num1:num2;
        System.out.println(minimum+" is Minimum Number");

    }
}
