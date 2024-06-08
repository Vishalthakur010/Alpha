// write a progra to find the first occurence of an element in an array

public class first_occurence {
    public static int check_sort(int arr[], int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return check_sort(arr, key, i+1);
    }

    public static void main(String[] args){
        int arr[]= {3,4,1,3,7,5,9,1,7,5,4,9};
        int key=7;
        int i=0;
        System.out.println(check_sort(arr,key, i));
    }
}
