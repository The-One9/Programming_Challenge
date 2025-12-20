import java.util.Scanner;

//bitwise & operator
public class Challenge16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your 1st number:");
        int a=sc.nextInt();
        System.out.print("Enter your 2nd number:");
        int b=sc.nextInt();

        int result= a & b;
        System.out.println("Result "+result);
    }
}
