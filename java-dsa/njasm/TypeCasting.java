package njasm;

public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("Type casting in java programming language .. ");
        // always type casting is possible only from higher to lower not lower to higher.
        // example from float to int ... not from int to float

        float a = 10.33f;
        int b = (int)(a); // this will work ---- float to int explicit type casting
        System.out.println("the number is: " + b);

        int c = 'A';   // implicit type casting.............

        System.out.println("type converted to int : " + c);  // internal type casting


    }
}
