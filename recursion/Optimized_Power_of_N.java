package recursion;

import array.reverse_an_array;

public class Optimized_Power_of_N {
    public static int optimisedPowerOfN(int number, int power){
        if(power == 0){
            return 1;
        }
        int half_powerSquare = optimisedPowerOfN(number, power/2) * optimisedPowerOfN(number, power/2);
        if(power % 2 != 0){
            half_powerSquare = number * half_powerSquare;
        }
        return half_powerSquare;
    }
    public static void main(String[] args) {
        System.out.println(optimisedPowerOfN(2, 10));
    }
}

