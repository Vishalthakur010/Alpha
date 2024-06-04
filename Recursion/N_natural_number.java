// Sum of first n natural numbers 

public class N_natural_number {
    public static int natural(int n){
        if(n==1){
            return 1;
        }
        int sum= n+natural(n-1);
        return sum;
    }
    public static void main(String[] args){
        System.out.println("sum of first N natural number is : " + natural(5));
    }
}
