package recursion;
// GIVEN N FRIENDS EACH ONE CAN REMAIN SINGLE OR CAN BE PAIRED UP WITH SOME OTHER
// FRIENDS . EACH FRIENDS CAN BE PAIRED ONLY ONCE . FIND THE TOTAL NUMBER OF WAYS IN 
// WHICH FRIENDS CAN REMAIN SINGLE OR CAN BE PAIRED UP 
public class FriendsPairing {
    public static int friendPair(int n){
        if(n == 1 || n ==2 ){
            return n;
        }
        // single
        int fnm1 = friendPair(n-1);
        // pair
        int pairSum  = (n-1) * friendPair(n-2);
        // Total_pair
        int totalPairSum = fnm1 + pairSum;
        // return totalPairSum;
        return friendPair(n-1) + (n-1) * friendPair(n-2);
    
    }
    public static void main(String[] args) {
        System.out.println(friendPair(5));
    }
}
