package njasm;

import java.util.ArrayList;
import java.util.Arrays;

public class PremitiveTypes {

    public static void main(String[] args) {
        System.out.println("premitive data types in java..!");
        int x = 33;
        char a = 'a';
        float f = 33.44f;
        long l = 999999999999999999L;    // by default int Using L become long 18 integer long
        double d = 3432432.3423423; // any decimal number by default is double in java
        boolean b = true; // or false
        System.out.println(x);
        System.out.println(a);
        System.out.println(f);
        System.out.println(l);
        System.out.println(d);
        System.out.println(b);

        // 
        ArrayList<String> str = new ArrayList<>(10);
        str.add("Akieb");
        str.add("Nazir");
        str.add("Shah");
        System.out.println(str.contains("Nazir"));
        int[] arr = {1,3,4,5,6}; 
        System.out.println(Arrays.toString(arr));
    }
}
