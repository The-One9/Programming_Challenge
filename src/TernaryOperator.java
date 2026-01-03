import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your First Number: ");
        int num1=sc.nextInt();
        System.out.println("Enter Your Second Number: ");
        int num2=sc.nextInt();
       int greaterNumber=num1>num2?num1:num2; //use of Ternary Operator
//        if(num1>num2){
//            greaterNumber=num1;
////            System.out.println(num1+" is Greater");
//        }else {
//            greaterNumber=num2;
//
//        }
        System.out.println(greaterNumber+" is Greater");
    }
}
