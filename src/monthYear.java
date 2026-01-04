import java.util.Scanner;

public class monthYear {
    public String year(int month){
        String monthStr=switch (month){
            case 1->"January";
            case 2->"February";
            case 3->"March";
            case 4->"April";
            case 5->"May";
            case 6->"June";
            case 7->"July";
            case 8->"August";
            case 9->"September";
            case 10->"October";
            case 11->"November";
            case 12->"December";
            default -> "Invalid Input";
        };
        System.out.println(monthStr);
        return monthStr;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Find Month of Given Number");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Your Number:");
        int num= sc.nextInt();
        monthYear my=new monthYear();
        my.year(num);
    }
}
