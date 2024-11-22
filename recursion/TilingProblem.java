package recursion;

public class TilingProblem {
    public static int tilingProblem(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        // work
        // ways to store the tile in verticle ways
        int fnm1 = tilingProblem(n-1);
        // ways to store the tile in horizontal ways
        int fnm2 = tilingProblem(n-2);
        // total ways to store the tile 
        int totalWays = fnm1 + fnm2;
        //  returning the total ways of storing the tile ;

        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println("Total ways to store tile " + tilingProblem(4));
    }
}
