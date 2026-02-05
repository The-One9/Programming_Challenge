import java.util.Scanner;

public class RandomGuess {

    int random;
    RandomGuess(){
        random=(int)Math.ceil(Math.random()*100);
    }
    int guess(int guessNumber){
        return guessNumber-random;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        RandomGuess RG=new RandomGuess();
        System.out.println("Welcome to Guessing Game, Guess the number between 1 to 100");

        int guess;
        int result;
        do {
            System.out.print("Guess The Number:");
            guess=sc.nextInt();
            result= RG.guess(guess);
            if (result==0){
                System.out.println("You Guess the correct Number");
            } else if (result<0) {
                System.out.println("Please Guess Higher");
            }else {
                System.out.println("Please Guess lower");
            }
        }while (result!=0);
    }
}
