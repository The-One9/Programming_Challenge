import java.util.Scanner;

//age determination
public class Challenge15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();

        if (age>=60){
            System.out.println("Your are senior citizen");
        } else if (age>=20) {
            System.out.println("Your are adult");
        } else if (age>=13) {
            System.out.println("Your are teen");
        }else {
            System.out.println("Your are child");
        }
    }
}
