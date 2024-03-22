// find the maximum sum from the subarray of an array

public class maxsubarraysum89 {
    public static void array(int arr[]){
        int sum=0, max_sum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i;j<arr.length;j++ ){
                sum=0;
                for(int k=i; k<=j;k++){
                    sum=sum+arr[k];
                }
                System.out.print(sum+", ");
                if(max_sum<sum){
                    max_sum=sum;
                }
            }
            System.out.println();
        }
        System.out.println("max sum is :"+max_sum);
    }
    public static void main(String[] args){
        int arr[]={1,-2,6,-1,3};
        array(arr);
    }
}
