// made a 2D array where i take input from the user, give the output, find the given element(key), and also find the largest number

import java.util.*;

public class Array2D97{
    public static int search(int arr[][], int key, int n, int m){
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]== key){
                    System.out.println("Found key at index"+"("+ i +"," +j+")");
                    return key;
                }
            }
        }
        return -1;
    }

    public static void largest(int arr[][], int n, int m){
        int largest=Integer.MIN_VALUE;

        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                if(arr[i][j]>largest){
                    largest=arr[i][j];
                }
            }
        }
        System.out.println("largest number is : "+ largest);
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int key=6;
        
        int arr[][]= new int [4][3];
        int n=arr.length, m= arr[0].length;

        // taking input from user of the 2D Array
        System.out.print("enter the elements of the array :");
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                arr[i][j]= sc.nextInt();
            }
        }

        // printing elements of the 2D Array
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        search(arr,key,n,m);
        largest(arr,n,m);
    }
}
