package recursion;

public class print_tribonacci {
    public static int printTribonacci(int n ){
        int tribonacci = 0;
        if(n == 0 || n == 1|| n == 2 ){
            return n ;
        }
        int nm1 = printTribonacci(n-1);
        int nm2 = printTribonacci(n-2);
        int nm3 = printTribonacci(n-3);
        tribonacci =+ nm1 + nm2 + nm3;

        return tribonacci;
        
    }
}
