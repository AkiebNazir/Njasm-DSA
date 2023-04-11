package njasm;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 3};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    static int findMax(int[] arr, int start, int end){
        int max = start;
        for (int i = start; i <= end; i++){
            if (arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
    static int[] selectionSort(int[] arr){
        for (int i=0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr));
            int j = arr.length-i-1;
            int maxInd = findMax(arr, 0, j);
            System.out.println(maxInd);
            int temp = arr[j];
            arr[j] = arr[maxInd];
            arr[maxInd] = temp;
        }
        return arr;

    }

    static int[] bubbleSort(int[] arr){
        int i = 0;
        while (i < arr.length){
            for (int j = 1;j <= arr.length-i-1;j++){
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;   
                }
            }
            i++;
        }
        return arr;
    }
}