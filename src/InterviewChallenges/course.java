package InterviewChallenges;

public class course {
    static int maxCapacity=100;
    String courseName;
    int enrollment;
    String[] enrolledStudent=new String[maxCapacity];

    course(String courseName){
        this.courseName=courseName;
        this.enrollment=0;
        this.enrolledStudent=new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        course.maxCapacity=maxCapacity;
    }
    void enrollStudent(String studentName){
        enrolledStudent[enrollment]=studentName;
        enrollment++;
    }
    void unenrollStudent(String studentName){
        System.out.println("Student Removed");
        enrollment--;
    }
}
