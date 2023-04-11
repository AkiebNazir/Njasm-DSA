package njasm;

public class MissingZeroToNum {
    public static void main(String[] args) {
        int[] arr = {5,1,0,4,2,3};
        System.out.println(findMissingNum(arr));
    }
    static int findMissingNum(int[] arr){
        int i = 0;
        for (i = 0; i < arr.length;){
            if (arr[i] != arr.length){
                if (arr[i] != i){
                    int temp = arr[i];
                    arr[i] = arr[temp];
                    arr[temp] = temp;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        } 
        for (int j = 0; j < arr.length; j++){
            if (arr[j] != j){
                return j;
            }
        }

        return arr.length;
    }    
}
