import java.util.Scanner;

public class Challenge55 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to Find Absolute Value of Given Number");
        System.out.print("Enter Your Number:");
        int num=sc.nextInt();
        int result=num>0?num:-num;   // using ternary operator
        System.out.println("Absolute number of given "+result);
        if(num>0){ // using if eles
            System.out.println("Absolute number of given "+num);
        }else {
            System.out.println("Absolute number of given "+(-num));
        }
    }
}
