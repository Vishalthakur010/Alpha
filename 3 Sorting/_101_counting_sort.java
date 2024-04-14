import java.util.*;

class sort {
    public static void count(int arr[]) {
        // |find max number in the array
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // assigning size of the new frequency array
        int count[] = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            // arr = 4 3 4 2
            // count indice = 0 1 2 3 4
            // count arr = 0 0 1 1 2
            count[arr[i]]++;
        }

        int k = 0;
        for (int i = 0; i < count.length; i++) { // 0 1 2 3 4
            for (int j = 0; j < count[i]; j++) { // 0 0 1 1 2
                arr[k++] = i;
            }
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class _101_counting_sort {
    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);
        // int arr[] = new int[8];
        // System.out.println("enter elements of array :");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
        int arr[]= {4,7,8,3,6,9,2,7,5,34};
        sort obj = new sort();
        obj.count(arr);
        obj.print(arr);
    }
}