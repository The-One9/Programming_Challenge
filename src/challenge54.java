import java.util.Scanner;

public class challenge54 {
    public static void main(String[] args) {
        System.out.println("Welcome to odd even checking of given number");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number for Checking:");
        int num=sc.nextInt();
        String oddEven=num%2==0?"Even":"Odd";
        System.out.println("Your Number is "+ oddEven);
    }
}
