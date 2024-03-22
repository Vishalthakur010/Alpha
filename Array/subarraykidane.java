// find the maximum sum from the subarray of an array using kidane's algorithm

public class subarraykidane{
    public static void kidane(int arr[]){
        int sum=0, max_sum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
            if(sum<0){
                sum=0;
            }
            if(max_sum<sum){
                max_sum=sum;
            }
        }
        System.out.println(max_sum);
    }
    public static void main(String[] args){
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        kidane(arr);
    }
}