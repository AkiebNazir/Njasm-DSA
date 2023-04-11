package njasm;

import java.util.HashMap;

public class CharCount {

    public static HashMap<Character, Integer> CountChar(String str){
        HashMap<Character, Integer> letterCount = new HashMap<>();
        for (char c: str.toCharArray()){
            c = Character.toLowerCase(c);
            if (Character.isAlphabetic(c) || Character.isDigit(c)){
                letterCount.put(c, letterCount.getOrDefault(c, 0) + 1);
            }
        }
        return letterCount;
    }
    public static void main(String[] args) {
        String str = "hello hello world ";
        HashMap<Character, Integer> letterCount = CountChar(str);
        System.out.println(letterCount);


    }
}

