public class error {
    public static void odd_even(int n){
        int bitmask=1;
        if((n & bitmask) == 1){
            System.out.println("odd number");
        }else{
            System.out.println("even number");
        }
    }
    public static void main(String[] args){
        odd_even(14);
    }
}
