package recursion;
public class FirstOccurence {
    public static int  firstOccurence(int arr[], int i, int key){
        // base class for recursion
        if(i == arr.length){
            return -1;

        }
        // Matching conditions for the key
        // comparing the array element with key
        if(arr[i] == key){
            return i;
        }
        return firstOccurence(arr, i+1, key);

    }
}
