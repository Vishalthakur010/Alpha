public class _132_oddeven{
    public static void odd_even(int n){
        int bitmask=1;
        if((n & bitmask) == 1){
            System.out.println("odd number");
        }else{
            System.out.println("even number");
        }
    }
    public static void Get_Bit(int n, int i){
        int bitmask=1<<i;
        if((n & bitmask)== 1){
            System.out.println("bit is 1");
        }else{
            System.out.println("bit is 0");
        }
    }
    public static void set_bit(int n, int i){
        int bitwise= 1<<i;
        System.out.println(n|bitwise);
    }
    public static void clear_bit(int n, int i){
        int bitwise= 1<<i;
        System.out.print(n&(~bitwise));
    }

    public static void main(String[] args){
        // Get_Bit(15, 8);
        // set_bit(6, 3);
        clear_bit(10,1);
    }
}