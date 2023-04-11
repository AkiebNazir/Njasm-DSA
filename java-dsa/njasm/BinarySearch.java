package njasm;

public class BinarySearch {
    // create a function to search an element in a sorted array
    static int SearchElement(int[] arr, int target){
        int start = 0;
        int end = arr.length;
        while (start <= end){
            int mid = (start + end)/2;
            if (target == arr[mid]){
                 return mid;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 9, 11, 12, 23, 26, 36, 39, 58, 60, 100};
        int target = 12;
        int result = SearchElement(arr, target);
        System.out.println(result);
    }
}
