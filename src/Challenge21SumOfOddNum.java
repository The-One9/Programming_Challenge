import java.util.Scanner;

//sum of all odd number
public class Challenge21SumOfOddNum {
    public static int sumOfOddNumber(int n){
        int sum=0;
        int i=1;
        while(i<=n){
           sum +=i;
            i +=2;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome of to sum of odd numbers");
        System.out.print("Enter Your Number:");
        int n=sc.nextInt();
        int sum=sumOfOddNumber(n);
        System.out.println("sum of "+n+" is :"+sum);

    }
}
