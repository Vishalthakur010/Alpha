public class Bit{
    public static void odd_even(int n){
        int bitmask=1;
        if((n & bitmask) == 1){
            System.out.println("odd number");
        }else{
            System.out.println("even number");
        }
    }
    public static int Get_Bit(int n, int i){
        int bitmask=1<<i;
        if((n & bitmask)== 1){
            return 1;
        }else{
            return 0;
        }
    }
    public static int set_bit(int n, int i){
        int bitmask= 1<<i;
        return n|bitmask;
    }
    public static int clear_bit(int n, int i){
        int bitmask= 1<<i;
        return n&(~bitmask);
    }
    public static int update_bit(int n, int i, int new_bit){
    //     // if(new_bit == 0){
    //         // return clear_bit(n, i);
    //     // }else{
    //         // return set_bit(n, i);
    //     // }
        n = clear_bit(n, i);
        int bitmask= new_bit << i;
        return n|bitmask;
    }
    //clear last ith bit
    public static int clear_last_bit(int n, int i){
        int Bitmask=(-1)<<i;
        return n & Bitmask;
    }
    //clear range of bit
    public static int clear_range(int n, int i, int j){
        int a= ((~0)<< (j+1));
        int b= (1<<i)-1;
        int bitmask= a|b;
        return n&bitmask;
    }
    //check if a number is a power of 2 or not
    public static void power(int n){
        if((n & (n-1))==0 ){
            System.out.println("number is power of 2");
        }else{
            System.out.println("number is not a power of 2");
        }
    }
    public static int set_bit_num(int n){
        int count=0;
    while(n>0){
    if((n&1) != 0){
        count++;
    }
        n=n>>1;
    }
    return count;
    }

    public static void main(String[] args){
        // odd_even(12);
        // System.out.println( Get_Bit(15, 8));
        // System.out.println(set_bit(6, 3));
        // System.out.println( clear_bit(10,1));
        // System.out.println(update_bit(10, 2, 1));
        // System.out.println(clear_last_bit(15, 2));
        // System.out.println(clear_range(10, 2, 4));
        // power(4);
        System.out.println(set_bit_num(10));
    }
}