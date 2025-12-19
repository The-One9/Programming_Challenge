import java.util.Scanner;

//Odd even Check
public class Challenge11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number :");
        int num=sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Number is Even:"+num);
        }else {
            System.out.println("Number is Odd:"+num);
        }
    }
}
