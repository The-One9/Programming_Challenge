class Pen{

    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    public void printType(){
        System.out.println(this.type);
    }
}
class StudentInfo {
    String name;
    int age;
    int rollNo;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollNo);
    }
    StudentInfo(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }
}

public class Oops {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "Ballpoint";

        StudentInfo s1 = new StudentInfo("John", 19, 100);
        s1.name = "Alice";
        s1.age = 20;
        s1.rollNo = 101;
        s1.printInfo();

        pen1.write();
        pen1.printColor();
        pen1.printType();
        pen2.write();
        pen2.printColor();
        pen2.printType();



    }
}
