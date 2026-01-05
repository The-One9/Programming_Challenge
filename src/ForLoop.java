import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(num +" X "+ num*i);
        }
    }
}
