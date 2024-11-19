package recursion;

public class print_1_to_10 {
    public static void printIncrease(int n ){
        if( n == 20){
            System.out.print(n + "");
            return;
        }
        // System.out.print(n + " ");
        printIncrease( n + 1);
        System.out.print(n + " ");

    }
    public static void main(String[] args) {
        printIncrease(1);
    }
}
