import java.util.*;

public class binarysearch85 {
    public static int binary(int arr[], int key){
        int start=0, end=arr.length;

        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>key){ //left
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[]={2,4,6,8,10,12,14,16};
        int key=12;
        System.out.println("number is at : "+binary(arr, key));
    }
}
