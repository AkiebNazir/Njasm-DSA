package njasm;

import java.util.HashMap;

public class MissingNumProb {
    public static void main(String[] args) {
        int[] arr = {104,100,101,102};
        System.out.println(FindMissingNum(arr));
    }
    static int FindMissingNum(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int[] minMax = FindMaxNum(arr);
        int[] new_array = new int[minMax[1]-minMax[0]+1];
        int i = 0;
        for (int elem = minMax[0]; elem <= minMax[1]; elem++){
            new_array[i] = elem;
            i++;
        }
        HashMap<Integer, Integer> original_array = new HashMap<>();
        HashMap<Integer, Integer> sorted_array = new HashMap<>();
        for (int el : arr){
            original_array.put(el, original_array.getOrDefault(el, 0)+1);
        }
        for (int el : new_array){
            sorted_array.put(el, sorted_array.getOrDefault(el, 0)+1);
        }
        for (Integer a: sorted_array.keySet()){
            if (original_array.get(a) != sorted_array.get(a)){
                return a;
            }
        }
        return -1;
    }
    private static int[] FindMaxNum(int[] arr) {
        int[] minmax = new int[2];
        minmax[0] = arr[0];
        minmax[1] = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > minmax[1]){
                minmax[1] = arr[i];
            } else if (arr[i] < minmax[0]) {
                minmax[0] = arr[i];
            }
        }
        return minmax;
    }
}
