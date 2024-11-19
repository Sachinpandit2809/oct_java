package recursion;

public class print_first_n_natural_number {
    public static int printFirstN_NaturalNumber(int n){
        int sum = 0;
        int f_N_m_One = 0;
        if (n == 1) {
            return 1;           
        }
        f_N_m_One = printFirstN_NaturalNumber(n-1);
        sum += n + f_N_m_One;

return sum;
    }
}
