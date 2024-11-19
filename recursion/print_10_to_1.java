package recursion;




public class print_10_to_1 {
    public static void printDec(int n){
        if(n==1){
            System.out.print(n + " ");
            return;
        }
        System.out.print(n+ " ");
        printDec(n-1);
        // System.out.print(n + " ");



    }
    public static void main(String[] args) {
        printDec(10);
    
        print_1_to_10.printIncrease(0);
      
    
    }
}
