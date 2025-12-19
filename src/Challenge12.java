import java.util.Scanner;

//Checking greatest of three number
public class Challenge12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter All Three Numbers:");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();

        if (num1>=num2 && num1>=num3){
            System.out.println("Number is Greatest of all :"+num1);
        }
        else if (num2>=num1 && num2>=num3) {
            System.out.println("Number is Greatest of all :"+num2);
        }
        else {
            System.out.println("Number is Greatest of all :"+num3);
        }
    }
}
