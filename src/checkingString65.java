import java.util.Scanner;

public class checkingString65 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.print("Enter Your word:");
            String Word=sc.next();
            if (Word.equals("exit")){
                break;
            }
        }
        System.out.println("Successfully Exited:");
    }
}
