import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Factorial of Number Using Recursion\n");
        System.out.print("Enter Your Number:");
        int num=sc.nextInt();
        long fact=factorialForLoop(num);
        System.out.println("Factorial of Number Using Loop:"+fact);
        long factRec=factorialRecursion(num);
        System.out.println("Factorial of Number Using Recursion:"+factRec);


    }
    public static long factorialForLoop(int num){
        long fact=1;
        for (int i=1;i<=num;i++){
            fact *=i;
        }
        return fact;
    }
    public static long factorialRecursion(int num){
        System.out.println("Factorial called for:"+num);
        if(num==1){
            return 1;
        }
        return num*factorialRecursion(num-1);
    }
}
