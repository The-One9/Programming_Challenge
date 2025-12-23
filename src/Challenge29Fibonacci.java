import java.util.Scanner;

public class Challenge29Fibonacci {
    public static void fibonacci(int num) {
        if(num<0)return;
        System.out.println("0 ");
        if(num==0)return;
        System.out.println("1 ");
        int first=0,second=1;
        while (first+second<=num){
            int third=first+second;
            System.out.println(third+" ");
            first=second;
            second=third;

        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num= sc.nextInt();
        System.out.println("Fibonacci series of Given Number");
        fibonacci(num);
    }
}
