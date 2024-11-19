package recursion;

public class print_factorial {
    public static int printFac(int n){
        int factorial= 0;
        int f_N_m_One = 0;
        if(n == 0){
            return 1;
        }
         f_N_m_One = printFac(n-1) ;
        System.out.println(f_N_m_One);

         factorial  +=  n * f_N_m_One;
         return factorial;
    }
    public static void main(String[] args) {
    System.out.println(printFac(5)); 
    }
}
