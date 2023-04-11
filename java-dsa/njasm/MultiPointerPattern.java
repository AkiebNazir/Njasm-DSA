package njasm;

import java.util.Arrays;

public class MultiPointerPattern {
    
    // get the two integer in an array whose is equal to zero..!
    static String twoPointer(int[] arr){
        String s;
        for (int i=0, j=arr.length - 1; i < arr.length && j > 0;){
            
            if (arr[i] + arr[j] == 0){
              s = String.format("found at index %d and %d",i,j);
                return s;
            } else if (arr[i] + arr[j] < 0){
                i++;
            }else {
                j--;
            }
        }
        s = String.format("didn't not found any match");
        return s;
    }

    // function to return an array with unique elements(remove duplicates)
    static int[] uniqueArray(int[] arr){
        int i = 0;
        int j = 1;
        while (j < arr.length){
            if (arr[i] == arr[j]){
                j += 1;
            } else {
                i += 1;
                arr[i] = arr[j]; 
            }
        }
        arr = Arrays.copyOfRange(arr, 0, i+1);
        return arr;
    }



    // find the maxSum of n element in an array...!
    static int maxSubArraySum(int[] arr, int num){
        int maxSum = 0;
        int tempSum = 0;
        if (arr.length < num){
            return -1;
        }
        for(int i = 0; i < num; i++){
            tempSum += arr[i];
        }
        maxSum = tempSum;
        for (int i = 0; i < arr.length-num; i++){
            tempSum = tempSum - arr[i] + arr[num + i];
            if (tempSum > maxSum){
                maxSum = tempSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println("Multipoint Problems and how to solve them..!");
        int[] arr = {-10, -9, -5, -3, -1, 2, 0, 7, 9, 12, 15, 90};
        String s = twoPointer(arr);
        System.out.println(s);


        // get the unique elements of a sorted array
        int[] arr1 = {1,2,2,2,2,2,2,3,3,3,5};
        System.out.print("Unique array: ");
        System.out.println(Arrays.toString(uniqueArray(arr1)));


        // get the maxSubArraySum
        int[] arr2 = {5,9,5,8,7,3,2,5,6};
        int result = maxSubArraySum(arr2, 3);
        System.out.printf("max sub-array sum is: %d", result);
    }

}
