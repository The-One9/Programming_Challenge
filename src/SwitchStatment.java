import java.util.Scanner;

public class SwitchStatment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Day: ");
        int day = sc.nextInt();
        SwitchStatment ss=new SwitchStatment();
        ss.oldSwitch(day);
        ss.newSwitch(day);
    }
    public void newSwitch(int day){
        String dayStr=switch (day){
            case 1->"Monday";
            case 2->"Tuesday";
            case 3->"Wednesday";
            case 4->"Thursday";
            case 5->"Friday";
            case 6->"Saturday";
            case 7->"Sunday";
            default -> "Invalid Day";
        };
        System.out.println(dayStr);

        }


    public void oldSwitch(int day){
        switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }


}
