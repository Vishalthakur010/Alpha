// trapping rainwater

public class trappingrainwater92 {
    public static void rainwater(int height[]){

        int left_max[]=new int[height.length];
        int right_max[]=new int[height.length];

        left_max[0]=height[0];
        right_max[height.length-1]=height[height.length-1];

        // assining values to left max array
        for(int i=1;i<height.length; i++){
            left_max[i]=Math.max(left_max[i-1], height[i]);
        }
        // assining values to right max array
        for(int i=height.length-2; i>=0; i--){
            right_max[i]= Math.max(right_max[i+1], height[i]);
        }

        int trapped_water=0;
        int watrelevel=0;
        for(int i=0; i<height.length; i++){
            // watrelevel= min(left max boundary, right max boundary)
            watrelevel=Math.min(left_max[i], right_max[i]);
            // trapped water= watrelevel - bar height
            trapped_water += watrelevel-height[i];
        }
        System.out.println(trapped_water);

    }
    public static void main(String[] args){
        int height[]={4,2,0,6,3,2,5};
        rainwater(height);
    }
}
