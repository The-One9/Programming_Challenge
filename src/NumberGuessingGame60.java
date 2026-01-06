import java.util.Scanner;

public class NumberGuessingGame60 {
    public static void main(String[] args) {
        System.out.println("Welcome to Number Guessing Game");
        Scanner sc=new Scanner(System.in);
        int num=5,guess;
        do {
            System.out.print("Please Enter a Number Between 0 to 10:");
            guess= sc.nextInt();
        }while (num !=guess);
        System.out.println("You Guess the Correct Number:"+num);


    }
}
