import java.util.Scanner;

public class challenge56 {
    public static void main(String[] args) {
        System.out.println("Welcome to Check Score");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Score:");
        int marks=sc.nextInt();
        String category=marks>80?"High":(marks>50?"Moderate":"Low");
        System.out.println("Your Score is "+category);
    }
}
