public class Floydtriangle {
    public static void floyd(int n, int count){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        int n=5, count=1;
        floyd(n, count);
    }
}
