package QaInterview;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfOccurrences {
    public static void main(String[] args) {
        String str="hello world";
        Map<Character,Integer> count=new HashMap<>();
        for(char c :str.toCharArray()){
            count.put(c,count.getOrDefault(c,0)+1);
        }
        System.out.println(count);
    }
}
