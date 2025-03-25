package practice;

public class divideAndQ {
    public static boolean findTarget(int arr[] , int target){
        int start=0 , end= arr.length-1;
           while(start<=end){
            int mid = (start + end )/2;

            if(target == arr[mid]){
                System.out.println("target matched  at index"+ mid);
                return true;
            }else if(target < arr[mid]){
             
                end = mid -1;
               
                // return false;
            }else{
                start = mid + 1;
              
              
                // return false;
            }
           }
           return false;
            
        }
        public static void main(String[] args) {
            int arrs[]  = {1,2,3,4,5,6,7,8,9,};
    
            System.out.println(findTarget(arrs, 3));
        
    }
}
