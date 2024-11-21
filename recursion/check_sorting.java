package recursion;

public class check_sorting {
    public static boolean checkSorting(int arr[], int i){
        if( i == arr.length - 1){
            return true;

        }
    
    if(arr[i]> arr[i+1]){
    
        return false;
    }
    return             checkSorting(arr, i+1);
    
}
}
