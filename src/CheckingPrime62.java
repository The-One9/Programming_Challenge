import java.util.Scanner;

public class CheckingPrime62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter Your Number:");
        int num=sc.nextInt();
        System.out.println("Your Number is "+(isPrime(num)?"Prime":"Not Prime"));

    }
    public static boolean isPrime(int num){
        for (int i=2;i<num;i++){
            if (num%i==0){
                return false;
            }
        }
        return true;
    }
}
