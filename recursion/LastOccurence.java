package recursion;

public class LastOccurence {
    public static int lastOccurence(int arr[] , int i , int key){
        // int array_[] = {1,2,3,4,15};

        if(arr.length == i){
            return -1;
        }
        int isFound = lastOccurence(arr, i+1, key);
     
        if(isFound == -1 &&  arr[i] == key){
            return i;
        }
        return isFound;
    }
}
