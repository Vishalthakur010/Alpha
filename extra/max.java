import java.util.*;

class number{
    Scanner sc= new Scanner(System.in);
    int max=0;
    int secmax=0;

    public void max(){

        System.out.println("enter number");
        for(int i=1;i<=4; i++){
            int num= sc.nextInt();
            if(max<num){
                secmax=max;
                max=num;
            }
        }
    }
    public void print(){
        System.out.println("max number is : " + max);
        System.out.println("second max number is : "+ secmax);
    }
}

class array{
    int arr[];
    
    public void maxarr(){
        Scanner sc= new Scanner(System.in);
        arr= new int[5];
        int max=Integer.MIN_VALUE;
        int sec_max=0;

        System.out.print("enter elements os array :");
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
            if(arr[i]>max){
                sec_max=max;
                max=arr[i];
            }
        }
        System.out.println("maximum number is :"+ max);
        System.out.print("second maximum number is :"+ sec_max);
    }
}

public class max{
    public static void main(String[] args){
        number obj= new number();
        // obj.max();
        // obj.print();
        array obj1= new array();
        obj1.maxarr();
    }
}