import java.util.Scanner;

public class challenge26NumIsPrime {
    public static boolean IsPrime(int num){
        int i=2;
        while (i< num){
            if(num%i==0){
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Check Number is Prime Or Not");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int num= sc.nextInt();
        boolean isPrime=IsPrime(num);
        if(isPrime){
            System.out.println("Your Number is prime: "+num);
        }else {
            System.out.println("Your Number is Not Prime: "+num);
        }
    }
}
