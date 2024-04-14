public class _109_Insertion_sort {
    public static void insertion(int arr[]) {
        for (int i = 1; i <= arr.length - 1; i++) {
            int curr = arr[i]; // unsorted part
            int prev = i - 1; // sorted part
            // finding out the correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void insert(int arr[]){
        for(int i=1; i<=arr.length-1; i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                // swap
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }

    public static void print(int arr[]) {
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 4, 1, 3, 2 };
        insert(arr);
        print(arr);
    }
}