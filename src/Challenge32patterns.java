import java.util.Scanner;

public class Challenge32patterns {
    public static void Patterns(int num){
        System.out.println("Right Half Pyramid");
        int row=0;
        while (row<num){
            System.out.print("*");
            int column=0;
            while(column<row){
                System.out.print(" *");
                column++;
            }
            System.out.println();
            row++;
        }

    }
    public static void Pattern2(int maxrow){
        System.out.println("Reverse Right Half Pyramid");
        int row=maxrow;
        while(row>0){
            int column=0;
            while (column<row){
                System.out.print("* ");
                column++;
            }
            System.out.println();
            row--;
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome to Print Patterns");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int num=sc.nextInt();
        Patterns(num);
        Pattern2(num);
    }
}
