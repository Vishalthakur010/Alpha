import java.util.*;

public class pairs87 {
    public static void pair(int arr[]){
        int total=0; //for countng the total no of pairs
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("(" + arr[i]+ "," + arr[j] + ")");
                total++;
            }
            System.out.println();
        }
        System.out.println("total no of pairs are : "+ total);
    }
    public static void main(String[] args){
        int arr[]={2,4,6,8,10};
        pair(arr);
    }
}
