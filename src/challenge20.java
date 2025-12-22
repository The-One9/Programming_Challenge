// multiplication of table
import java.util.Scanner;

public class challenge20 {
    public static void table(int tab){
        int i=1;
        while (i<=10){
            System.out.println(tab +"x" +i+"="+tab*i);
            i++;
        }
    }

    public static void main(String[] args) {
        System.out.println("Multiplication of Table");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int tab= sc.nextInt();
        table(tab);



    }
}
