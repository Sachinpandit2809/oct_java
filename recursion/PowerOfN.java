package recursion;

public class PowerOfN {
   public static long powerOf_n(long number , long power ){
    
        if(power == 0){
            return 1;
        }
      long squares = number * powerOf_n(number, power-1);
      

        return squares;
    }
    public static void main(String[] args) {
        System.out.println(powerOf_n(20, 15));
    }
}

