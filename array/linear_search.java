package array;


public class linear_search {
    public static int getLargestNumber(int arr[]){
        int largest = Integer.MIN_VALUE;
       for(int i = 0; i< arr.length; i++){
        if(largest< arr[i]){
            largest = arr[i];
        }
        

       }
    return largest;
    }
    public static int linaear_search(int arr[], int key){
        if(arr.length == 0){
            return -1;
        }
        for(int i=0; i<arr.length ; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[] = {2,4,5,67,86,33,7};
        int found = linaear_search(arr, 67);
        int largest = getLargestNumber(arr);
        System.out.println("largest number in arr -> "+ largest);
     
        System.out.println("Key found at index of -> " + found);
    }
}
