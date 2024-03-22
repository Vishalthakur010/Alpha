import java.util.*;

public class largestnumber84 {
    public static void largest(int number[]){
        int large=Integer.MIN_VALUE; // shows the smallest number
        int small=Integer.MAX_VALUE; // shows the largest number

        for(int i=0; i<number.length; i++){
            if(large<number[i]){
                large=number[i];
            }
            if(small>number[i]){
                small=number[i];
            }
        }
        System.out.println("largest number is : "+ large);
        System.out.print("smallest number is : "+ small);
    }
    public static void main(String[] args){
        int number[]={14,23,56,34,67,55,45};
        largest(number);
    }
}
