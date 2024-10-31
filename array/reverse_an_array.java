package array;
import java.util.*;

public class reverse_an_array {
    public static void reveseArray(int arr[]){
        int start = 0 , end = arr.length-1;
        while(start<end){
            int temp = arr[end];
             arr[end] = arr[start];
             arr[start] = temp;
             start++;
             end -- ;

        }
        System.out.println(Arrays.toString(arr));

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        reveseArray(arr);

    }
}
 