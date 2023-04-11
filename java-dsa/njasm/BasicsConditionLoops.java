package njasm;

import java.util.Scanner;

public class BasicsConditionLoops {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = in.nextInt();
        if (a == 10){
            System.out.println("yes its true");
        } else {
            System.out.println("not its not true");
        }
        in.close();
        for (int x = 0; x < 10; x++){
            System.out.println("the number is: " + x);
        }
        int y = 0;
        while (y < 10){
            System.out.println(y);
            y += 1;
        }
    }
}
