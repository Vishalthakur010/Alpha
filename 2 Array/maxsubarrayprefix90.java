// find the maximum sum from the subarray of an array using prefix sum

public class maxsubarrayprefix90 {
    public static void array(int arr[]) {

        int sum = 0, max_sum=Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];

        // calculating prefix array
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = start; j < arr.length; j++) {
                int end = j;
                if (start == 0) {
                    sum = prefix[end];
                } else {
                    sum = prefix[end] - prefix[start - 1];
                }
                System.out.print(sum+" ");

                if(max_sum<sum){
                    max_sum=sum;
                }
            }
            System.out.println();
        }
        System.out.print("max sum is : "+ max_sum);
    }

    public static void main(String[] args) {
        int arr[] = { 1, -2, 6, -1, 3 };
        array(arr);
    }
}