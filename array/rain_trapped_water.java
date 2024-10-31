package array;

public class rain_trapped_water {
    public static void tp_water(int height[]){
        // calculation of leftMax array 
        // compare the left max with other max
        int length = height.length;
        int leftMax[] =new int [length];
        leftMax[0] = height[0];
        for(int i = 1 ;i<length;i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        // calculating the right max array
        int rightMax[] = new int[length];
        rightMax[length-1] = height[length-1] ;
        for(int j = length-2;j>=0;j--){
            rightMax[j] = Math.max(rightMax[j+1],height[j] );

        }
        int water = 0;
            // FOR FINDING TRAP WATER (MINNUM(LEFTmAX[I] , RIGHTmAX[I]) -HEIGHT[1]
            for(int i = 0; i< length;i++){
                water += Math.min(leftMax[i], rightMax[i])- height[i];

            }
            System.out.println(water);
    }
    
    public static void main(String[] args) {
        int height[] = { 4,2,0,6,3,2,5};
        tp_water(height);

    }
}
