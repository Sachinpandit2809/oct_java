package recursion;

public class print_fibonacci {
    public static int fibonacci(int n){
        int fib = 0 ;
        if (n == 0 || n == 1) {
            return n;
            
        }
        int nm1 = fibonacci(n-1);
       // System.out.println(nm1+  " .. " +"{ "+ n + " }");
        int nm2 = fibonacci(n-2);
       // System.out.print(nm2+  " __ " + "{ "+ n + " }");

         fib += nm1 + nm2;

        return fib;
    }
    public static void main(String[] args) {
        // int sum  =    print_first_n_natural_number.printFirstN_NaturalNumber(10);   
        // System.out.println(sum);
        int fib = print_fibonacci.fibonacci(10);
        System.out.println(fib);
    }
}
