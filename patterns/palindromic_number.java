// palindromic pattern with numbers

import java.util.*;

public class palindromic_number {
    public static void number(int n){
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=i; j<=n-1; j++){
                System.out.print(" ");
            }
            // descending
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            // ascending
            for(int j=2; j<=i; j++){
                System.out.print(j);
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
