import java.util.*;

class Bucket{
    void sort(float arr[]){
        int n=arr.length;
        ArrayList<Float>[] bucket = new ArrayList[n]; // bucket
        
        // create empty bucket
        for(int i=0; i<arr.length; i++){
            bucket[i]= new ArrayList<Float>();
        }
        //add elements in our buckets
        for(int i=0; i<n; i++){
            int bucketIndex= (int) arr[i]*n;
            bucket[bucketIndex].add(arr[i]);
        }

        // sort each bucket individually
        for(int i=0; i<arr.length; i++){
            Collections.sort(bucket[i]);
        }
        //merge all buckets to get final sorted array
        int index=0;
        for(int i=0; i<bucket.length; i++){
            ArrayList<Float> currbucket =bucket[i];
            for(int j=0; j<currbucket.size(); j++){
                arr[index++]=currbucket.get(j);
            }
        }
    }
}
public class Bucket_short {
    public static void main(String[] args){
        float arr[]={0.69f, 0.29f, 0.34f, 0.76f, 0.25f ,0.67f, 0.37f};
        Bucket obj=new Bucket();
        obj.sort(arr);

        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
}
