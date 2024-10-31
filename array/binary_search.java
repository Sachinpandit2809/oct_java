package array;

public class binary_search {
    public static int binary_search(int arr[], int key){
        int start =  0 ;
         int end = arr.length - 1;
         
         while (start<=end) {
            int  mid =  (start+end)/2;
            if(arr[mid] == key){
                return mid;
            }else if(arr[mid] < key) {
                start = mid+1;
            

            }else{
                end = mid - 1;
            }
            
         }
         return -1;
    }
    
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int value =   binary_search(arr, 0);

       if(value == -1) { System.out.println("Not Found ");} else{ System.out.println("at index => "+ value );};
    }
}
