// print numbers in increasing order

public class increasing_no {

    public static void increasing(int n){
        // if(n>0){
        //     increasing(n-1);
        //     System.out.println(n);
        // }
        if(n==1){
            System.out.println(n);
            return;
        }
        increasing(n-1);
        System.out.println(n); 

    }
    public static void main(String[] args){
        increasing(10);
    }
}
