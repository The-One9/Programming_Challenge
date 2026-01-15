public class ArrayToString {
    public static void main(String[] args) {
        String[] aar=new String[]{"This is ","the best"," java"," course"," on You tube"};
    StringBuilder sb=new StringBuilder();
    for (String str:aar){
        sb.append(str).append(" ");
    }
        System.out.println(sb);
    }

}
