import java.util.Scanner;

public class Challenge25GCD { // method to calculate GCD
    public static int GCD(int first,int second) {
        int gcd=1;
        int least=least(first,second);
        int i=2;
        while (i<=least) {
            if (first % i == 0 && second % i == 0) {
                gcd = i;
            }
            i++;
        }
    return gcd;
    }
    public static int least(int num1,int num2){
        if(num1<num2){
            return num1;
        }else {
            return num2;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your First Number:");
        int num1=sc.nextInt();
        System.out.print("Enter Your Second Number:");
        int num2=sc.nextInt();
        int gcd=GCD(num1,num2);
        System.out.println("GDC of Number :"+gcd);
    }
}
