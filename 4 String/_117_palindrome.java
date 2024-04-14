//check if a string is palindrome Ex:- racecar, noon, madam 

public class _117_palindrome {
    public static boolean check(String name){

        int n=name.length();
        for(int i=0; i<n/2; i++){
            if(name.charAt(i) !=name.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        String name="racecar";
        System.out.print(check(name));
    }
}
