import java.util.Scanner;

//Swaping of numbers
public class Challange3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first Number to be Swap A:");
        int a=sc.nextInt();
        System.out.print("Enter second Number to be Swap B:");
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("Swapping Done");
        System.out.println("After swap A: " + a);
        System.out.println("After Swap B: " + b);
    }
}
