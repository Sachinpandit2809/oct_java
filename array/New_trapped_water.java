package array;

public class New_trapped_water {
    public static void tpWaterFunction(int height[]){
        int length = height.length;
        // left max boundry 
        int leftaxBoundry[]  = new int [length];
        leftaxBoundry[0] = height[0];
        for(int i =1 ;i<length;i++){
            leftaxBoundry[i] = Math.max(leftaxBoundry[i-1], height[i]);
        }
        int rightMaxBoundry[] = new int [length];
        rightMaxBoundry[length-1] = height[length -1];
        for(int i = length-2; i>= 0; i--){
            rightMaxBoundry[i] = Math.max(rightMaxBoundry[i+1], height[i]);
        }

        // getting the trapped water 
            int trappedWatter = 0;
        for (int i = 0 ; i<length ;i++){
                trappedWatter += Math.min(leftaxBoundry[i], rightMaxBoundry[i]) - height[i];
        }
        System.out.println("trapped water = " + trappedWatter);
    }
    public static void main(String[] args) {
        int height [] = {4, 2, 0, 6, 3, 2, 5}; 
        tpWaterFunction(height);
    }
}
