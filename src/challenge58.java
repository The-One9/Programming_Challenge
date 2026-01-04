import java.util.Scanner;

public class challenge58 {
    public static void main(String[] args) {
        System.out.println("Welcome to Calculator \n");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your First Number:");
        int num1=sc.nextInt();
        System.out.print("Enter Your Second Number:");
        int num2=sc.nextInt();
        System.out.print("Enter Operator:");
        String operator=sc.next();

        int result= switch (operator){
            case "+"-> num1+num2;
            case "-"-> num1-num2;
            case "*"-> num1*num2;
            case "/"-> num1/num2;
            default -> 0;
        };
        System.out.println("Your Calculation is:"+result);
    }

}
