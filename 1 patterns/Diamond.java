public class Diamond {
    public static void pattern(int n){
        // first half
        for(int i=1; i<=n; i++){
            // space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // second half
        for(int i=n; i>=1; i--){
            // space
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // star
            for(int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n=5;
        pattern(n);
    }
}
