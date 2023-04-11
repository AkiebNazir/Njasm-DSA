package njasm;

public class FindTarget {
    static int SearchTarget(int[] arr, int target){
        if (arr.length < 1){
            return -1;
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target){
                return i;
          }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,66,64,63,634,23,15,53};
        int t = 634;
        System.out.printf("The target is at index=%d", SearchTarget(array, t));
    }
}
