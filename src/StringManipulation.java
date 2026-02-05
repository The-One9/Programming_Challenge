public class StringManipulation {
    public static void main(String[] args) {
        String firstName="Umar";
        String lastName="Mujtaba";
        String fullName=firstName+" "+lastName;
        String fullName1=firstName.concat(" ").concat(lastName);
        System.out.println(fullName.toUpperCase());
        System.out.println(fullName1.toUpperCase());
    }
}
