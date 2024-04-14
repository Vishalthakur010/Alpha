class redix{
    static int max(int arr[]){
        //Finding max
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
    static void count_sort(int arr[], int place){
        int max= max(arr);
        //Frequensy array
        int count[]= new int[10];
        for(int i=0; i<arr.length; i++){
            count[(arr[i]/place)%10]++;
        }
        //prefix of count
        for(int i=1; i<count.length; i++){
            count[i]=count[i]+ count[i-1];
        }
        //Find the index of each element in the original array and put it in the original array
        int output[]= new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            int index= count[(arr[i]/place)%10]-1;
            output[index]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        //copy all elements of output into original array
        for(int i=0; i<output.length; i++){
            arr[i]=output[i];
        }
    }
    static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void Radix_sort(int arr[]){
        int max= max(arr);
        //apply counting sort to sort elements based on place value
        for(int place=1; max/place>0; place *=10){
            count_sort(arr,place);
        }
    }
}

public class redix_sort {
    public static void main(String[] args){
        int arr[]={170,45,75,90,802,2};
        redix obj=new redix();
        obj.Radix_sort(arr);
        obj.print(arr);
    }
}
