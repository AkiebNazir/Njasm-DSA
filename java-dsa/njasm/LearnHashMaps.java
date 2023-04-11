package njasm;

import java.util.HashMap;

public class LearnHashMaps {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        // map.put('A', 1);
        map.put('B', 2);
        map.put('C', 3);
        map.put('D', 4);
        map.put('E', 5);
        int a = map.getOrDefault('A', 0);
        System.out.println(map.toString());
        System.out.println(a);
        for (Character key : map.keySet()){
            System.out.println(key);
        }
    }
}
