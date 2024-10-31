package array;
import java.util.*;

public class basic_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [4];
        System.out.println("enter four numbers");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();  
        System.out.println("printing the enteres array " +  Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
    }
}
