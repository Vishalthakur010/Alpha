// print x^n

public class print_power {

    public static int power(int x, int n){
        if(n==0) return 1;
        return x*power(x, n-1);
    }
    public static void main(String[] args){
        int x=2, n=10;
        System.out.println(power(x,n));
    }
}
