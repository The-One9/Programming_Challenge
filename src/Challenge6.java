import java.util.Scanner;

//Perimeter of Trangle
public class Challenge6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter all Four Sides: ");
        double a=sc.nextInt();
        double b=sc.nextInt();
        double c=sc.nextInt();
        double d=sc.nextInt();

        double perimeter=a+b+c+d;
        System.out.println("Perimeter of Trangle :" +perimeter +"cm" );
    }
}
