class stable{
    public static void sort(int arr[]){
        //Finding max
        int max= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        //Frequency array
        int count[] = new int[max+1];
        for(int i=0; i<arr.length;i++){
            count[arr[i]]++;
        }
        //prefix of count
        for(int i=1; i<count.length; i++){
            count[i]= count[i]+count[i-1];
        }
        //new output array
        int output[]= new int[arr.length];
        
        //find the index of each element in the original array and put it in the output array
        for(int i=arr.length-1; i>=0; i--){
            int index=count[arr[i]]-1;
            output[index]=arr[i];
            count[arr[i]]--;
        }
        //copyt all elements of output into original array
        for(int i=0; i<output.length; i++){
            arr[i]=output[i];
        }
    }
    public static void print(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

public class stable_count_sort {
    public static void main(String[] args){
        int arr[]={4,3,1,5,3,1,3,5};
        stable obj= new stable();
        obj.sort(arr);
        obj.print(arr);
    }
}
