// write a function to find the last occurence of an element of na array

public class last_occurance {

    public static int check(int arr[], int key, int i){
        // if(i==0) return -1;
        // if(arr[i] == key) return i;
        // return check(arr, key, i-1);

        if(i== arr.length) return -1;
        int Found= check(arr, key, i+1);
        if(Found== -1 && arr[i] == key) return i;
        
        return Found;
    }
    public static void main(String[] args){
        int arr[]= {3, 4, 1, 3, 7, 5, 9, 1, 7, 5, 4, 9};
        int key=4;
        // int i=arr.length-1;
        int i=0;

        System.out.println(check(arr, key, i));
    }
}
