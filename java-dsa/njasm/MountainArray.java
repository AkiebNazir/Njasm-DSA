package njasm;

public class MountainArray {
    // find the peak of a mountain array
    public static void main(String[] args) {
        int[] arr = {2,6,9,10,40,100,50,34,20,11,9,5,2,1};
        System.out.println(PeakValue(arr));
        int [] arr1 = {6,0,1,2,5,6};
        System.out.println(PivotOfArray(arr1));
    }


    static int PivotOfArray(int[] arr){
        int start = 0;
        int end = arr.length;
        while (start <= end){
            int mid = (start + end)/2;
            if (arr[start]> arr[mid]){
                return start;
            } else if (arr[start]>arr[mid]){
                end = mid- 1;
            }else if (arr[mid - 1]< arr[mid] && arr[mid+1] < arr[mid]){
                return mid;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int PeakValue(int[] arr){
        int start = 0;
        int end = arr.length;
        while (start <= end){
            int mid = (start + end)/2;
            if (arr[mid - 1]< arr[mid] && arr[mid+1] < arr[mid]){
                return arr[mid];
            } else if (arr[mid-1] > arr[mid]){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
