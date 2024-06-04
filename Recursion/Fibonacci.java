// print nth fibonacci number

public class Fibonacci {
    public static int fib(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        int fibn=fib(n-1)+fib(n-2);
        return fibn;
    }
    public static void main(String[] args){
        System.out.println("nth fibonacci no is : "+ fib(8));
    }
}
