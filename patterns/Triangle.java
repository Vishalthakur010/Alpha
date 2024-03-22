import java.util.*;

class pattern{
    void triangle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of lines : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Triangle{
    public static void main(String[] args){
        pattern obj= new pattern();
        obj.triangle();
    }
}