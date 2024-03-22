import java.util.*;

public class palindromic_number {
    public static void number(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i);
                i--;
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number :");
        int n= sc.nextInt();
        number(n);
    }
}
