import java.util.Scanner;

public class userOutPut {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please Enter Your Message:");
        String message = sc.nextLine();
        System.out.println("Umar Mujtaba " + message);
    }
}
