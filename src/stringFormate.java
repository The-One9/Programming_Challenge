public class stringFormate {
    public static void main(String[] args) {
        String name="Sandeep";
        int marks=45;
        System.out.println("hello "+name+" Your marks is :"+marks); //normal print statement for string that uses more memory due Concatination.
        System.out.printf("hello %s,your marks is %d",name,marks); //printf save memory because is print all the statement in single line.

    }
}
