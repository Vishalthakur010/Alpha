public class _107_selection_sort {

    public static void selection(int arr[]){

        for(int i=0; i<=arr.length-2; i++){
            int min=i;

            for(int j=i+1; j<=arr.length-1; j++){
                if(arr[min]>arr[j]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
    }
    public static void print(int arr[]){
        for(int i=0; i<=arr.length-1; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        int arr[]= {5,4,1,3,2};
        selection(arr);
        print(arr);
    }
}
