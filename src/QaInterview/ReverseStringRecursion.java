package QaInterview;

public class ReverseStringRecursion {
    static String reverse(String s1){
        if(s1.isEmpty()){
            return s1;
        }
        return reverse(s1.substring(1))+s1.charAt(0);
    }


public static void main(String[] args) {
    String s2 = "ReverseString";
    System.out.println(reverse(s2));

}
}