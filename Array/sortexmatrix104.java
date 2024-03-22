// search in sorted matrix

public class sortexmatrix104 {
    public static int binary(int arr[][],int key){
        
        for(int i=0; i<arr.length;i++){
            int start=0, end=arr[i].length;
        
            while(start<end){
                int mid=(start+end)/2;
                if(arr[i][mid]== key){
                    System.out.println("key is found at index : ("+ i+","+ mid + ")");
                }
                if(arr[i][mid]>key){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        }return -1;
    }
    public static void sortex(int arr[][], int key){
        int row=0, col=arr[0].length-1;

        while(row<arr.length && col>=0){
            if(arr[row][col]== key){
                System.out.print("key found at index : ("+ row+","+col+")");
                return;
            }
            else if(arr[row][col]> key){
                col--;
            }else{
                row++;
            }
        }
        System.out.print("key dosen't exists");
    }
    public static void main(String[] args){
        int key=48;
        int arr[][]={{10,20,30,40},
                    {15,25,35,45},
                    {27,29,37,48},
                    {32,33,39,50}};
                sortex(arr, key);
    }
}
