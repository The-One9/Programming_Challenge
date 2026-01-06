import java.util.Scanner;

public class passwordChecker59 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String password;
        do {
            System.out.println("Please enter Your Password");
            password=sc.next();
        }while (!isValidPassword(password));
        System.out.println("This is Correct Password:"+password);
    }
    public static boolean isValidPassword(String password){
        return password.length()>6;
    }
}
