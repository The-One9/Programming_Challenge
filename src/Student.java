public class Student {
    String name;
    int age;
    String rollNo;
    String house;

    public Student(String name,int age,String rollNo, String house) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student Detail:{Name:"+ name +",Age:"+ age +",RollNo:"+ rollNo +",House:"+
                house+"}" ;
    }

    public static void main(String[] args) {
        Student stu=new Student("Umar",26,"35","Red");
        System.out.println(stu);
    }
}
