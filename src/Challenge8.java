import java.util.Scanner;

//SimpleInterest
public class Challenge8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Principle Amount RS:");
        int p= sc.nextInt();
        System.out.print("Enter Rate of Interest R:");
        double r=sc.nextDouble();
        System.out.print("Enter Time in Year T:");
        int t=sc.nextInt();


        double simpleInterest=(p*r*t)/100;
        System.out.println("Simple Interest:"+simpleInterest);

        double comInt=p*Math.pow((1+ r/100),t);
        System.out.println("Compound Interest:"+comInt);
    }
}
