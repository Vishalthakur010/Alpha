// print numbers in decreasing order

public class decreasing_no {

    public static void decreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        decreasing(n-1);
    }
    public static void main(String[] args){
        decreasing(5);
    }
}