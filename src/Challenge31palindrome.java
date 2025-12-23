import java.util.Scanner;

public class Challenge31palindrome {
    public static int reverse(int num){
        int reverse=0;
        while (num>0){
            int digit=num%10;
            reverse =reverse*10+digit;
            num=num/10;
        }
        return reverse;
    }
    public static boolean isPalindrome(int num){
        int reverse=reverse(num);
        return num==reverse;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number:");
        int num=sc.nextInt();
        boolean ispalindrome=isPalindrome(num);
        if(ispalindrome){
            System.out.println("Number is Palindrome");
        }
        else {
            System.out.println("Number is not Palindrome");
        }
    }
}
