package njasm;

import java.util.HashMap;

public class AnagramCheck {
    static boolean checkAnagram(String s1, String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++){
            char c1 = s1.charAt(i);
            System.out.println(c1);
            m1.put(c1, m1.getOrDefault(c1, 0)+1);
        }
        for (int i = 0; i < s2.length(); i++){
            char c2 = s2.charAt(i);  
            m2.put(c2, m2.getOrDefault(c2, 0) + 1);
        }
        // System.out.println(m1);  
        // System.out.println(m2);
        for (Character key : m1.keySet()){
            if (m1.get(key) != m2.get(key)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "aakaaai";
        String s2 = "akaaaak";
        System.out.println(checkAnagram(s1, s2));
    }
}
