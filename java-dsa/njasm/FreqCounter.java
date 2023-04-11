package njasm;

import java.util.HashMap;
import java.util.Map.Entry;

public class FreqCounter {
    /**
     * @param l1 int[]
     * @param l2 int[]
     * @return boolean
     */
    static boolean checkFreq(int[] l1, int[] l2) {
        if (l1.length != l2.length){
            return false;
        }
        HashMap<Integer, Integer> m1 = new HashMap<>();
        HashMap<Integer, Integer> m2 = new HashMap<>();
        for (int i1 : l1) {
            m1.putIfAbsent(i1, 0);
            m1.put(i1, +1);
        }
        for (int i2 : l2) {
            m2.putIfAbsent(i2, 0);
            m2.put(i2, +1);
        }
        System.out.println(m1);
        System.out.println(m2);
        for (Entry<Integer, Integer> entry : m1.entrySet()) {
            Integer k = entry.getKey();
            if (m2.get(
                    k * k) != entry.getValue()) {

                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] l1 = { 1, 2, 3 };
        int[] l2 = { 4, 1, 9 };
        boolean t = checkFreq(l1, l2);
        System.out.println(t);
        HashMap<String, Integer> newm = new HashMap<>();
        newm.put("one", 1);
        newm.put("two", 2);
        System.out.println(newm.get("one"));
        System.out.println(newm.get("three"));
    }

}
