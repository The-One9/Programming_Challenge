// Grades checking

import java.util.Scanner;

public class Challeng14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Subject Numbers:");
        int math= sc.nextInt();
        int phy= sc.nextInt();
        int chem= sc.nextInt();
        int eng= sc.nextInt();
        int com= sc.nextInt();
        float percentage= (math+phy+chem+eng+com)/5;


        if (percentage>=90){
            System.out.println("You got grade A");
        } else if (percentage>=75) {
            System.out.println("You got grade B");
        } else if (percentage>=60) {
            System.out.println("You got grade C");
        } else if (percentage>=45) {
            System.out.println("You got grade D");
        }else {
            System.out.println("Sorry Yor are not pass");
        }
    }
}
