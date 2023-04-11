package njasm;

import java.util.Arrays;

public class CyclicSortAlgo {
    public static void main(String[] args){
        int[] arr = {5,3,1,6,2,4};
        System.out.println(Arrays.toString(SortArrayCyclic(arr)));
    }

   static int[] SortArrayCyclic(int[] arr) {
        for (int i = 0; i < arr.length;){
            if (arr[i] != i+1){
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            } else{
                i++;
            }
        }
        return arr;
    }

    
}
