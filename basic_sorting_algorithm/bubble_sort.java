package basic_sorting_algorithm;
import java.util.*;

public class bubble_sort {
    // public static void bubble_sorting(int arr[]){
    //         int n = arr.length;
    //         for(int i= 0 ; i<n-1;i++){
    //             for(int j = 0; j<n-1-i ;j++){
    //                 if(arr[j]> arr[j+1]){
    //                     int temp = arr[j];
    //                     arr[j] = arr[j+1];
    //                     arr[j+1] = temp;
    //                 }

    //             }
                

    //         }
    //         System.out.println(Arrays.toString(arr));
    // }


public static void bubbleSort(int arr[]){
    int swap = 0;
    for (int turn = 0 ;turn <arr.length-1;turn++){
        
        for (int j = 0; j< arr.length -1-turn;j++ ){
            if(arr[j]> arr[j+1]){
                swap++;
                int temp  = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
           
        }
        if(swap == 0){
            System.out.println("array already sorted" + Arrays.toString(arr));
            break;
        }
    }
    System.out.println(Arrays.toString(arr));
}
// selection sort
public static void selectionSort(int arr[]){
    for (int i = 0 ; i< arr.length-1 ; i++){
        int minPos = i;
        for(int j = i+1; j< arr.length ; j++){
            if(arr[minPos]< arr[j]){
                minPos = j;
            }
        }
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
    }
    System.out.println(Arrays.toString(arr));
}

public static void insertionSort(int arr[]){
    for(int i = 1; i<arr.length; i++ ){
        int curr = arr[i];
        int prev = i-1;

        while (prev >= 0 && arr[prev] > curr ) {
            arr[prev + 1 ] = arr[prev];
            prev--;
            System.out.print("turn " + i); 
               System.out.println(Arrays.toString( arr));

            
        }
        arr[prev + 1] = curr;
    }
    System.out.println(Arrays.toString(arr));

}

public static void countingSort(int arr[]){
    int largest = Integer.MIN_VALUE;
    for(int i = 0;i<arr.length; i++){
        if(largest < arr[i]){
            largest = arr[i];
        }
    }
    int count[] =  new int[largest+1];

    for(int i = 0 ;i< arr.length ; i++){
            count[arr[i]]++;
    }
    System.out.println(Arrays.toString(count));
    int j =0;
    for(int i =0; i<count.length; i++ ){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
    }
    System.out.println(Arrays.toString(arr));


}

    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        int fifty_element[] = {5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 
            5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 5, 4, 1, 3, 2, 
            5, 4, 1, 3, 2, 5, 4, 1, 3, 2
           };
        int sort_Arr[] = {1,2,3,4,5};
        //bubble_sorting(arr);
        
        //  Arrays.sort(fifty_element,Collections.reverseOrder());
        //  System.out.println(++arr[0]);
         countingSort(fifty_element);
        


    }
}
