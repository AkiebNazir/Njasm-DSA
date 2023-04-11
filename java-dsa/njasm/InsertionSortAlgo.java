package njasm;

import java.util.Arrays;

public class InsertionSortAlgo {
    public static void main(String[] args){
        int[] arr = {1,2,5,4,6,7,8,9};
        System.out.println(Arrays.toString(SortArray(arr)));
    }
    public static int[] SortArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j > 0; j--){
                if (arr[j-1] < arr[j]){
                    break;
                } else {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
