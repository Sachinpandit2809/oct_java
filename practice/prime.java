package practice;

public class prime {
    public static boolean checkPrime(int num){
        boolean isPrime = true;

        if(num == 2){
            return  true;
        }else{
            for(int i  = 2 ; i<= Math.sqrt((double)num); i++){
                if(num % i == 0){
                    isPrime = false;
                }
            }
        }
        if (isPrime) { 
            // System.out.println("prime number");
            return isPrime;
            
        }else{
            // System.out.println("not a  prime number");
            return isPrime;

        }
        
    }


public static void main(String args[]){
    for(int i = 2;i<99;i++){
        //   boolean c  = checkPrime(11);
         System.out.println(i + " is s "+ checkPrime(i));
    }
}
}