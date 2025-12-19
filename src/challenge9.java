import java.util.Scanner;

//Fahrenheit to Celsius
public class challenge9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Temperature in Fahrenheit:");
        float f=sc.nextFloat();
        float celsius=(f-32)*5/9;

        System.out.println("Fahrenheit to Celsius:"+celsius+"C");
    }
}
