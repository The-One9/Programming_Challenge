import java.util.Scanner;

//odd even using bitwise operator
public class Challenge19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=sc.nextInt();

        if ((num & 1)==1){
            System.out.println("Number is odd: "+num);
        }else {
            System.out.println("Number is even");
        }
    }
}
