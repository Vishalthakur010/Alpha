// string, input, output, length, concatnation
import java.util.*;

public class input_string {
    public static void letter(String Full_name){
        for(int i=0; i<Full_name.length(); i++){
            System.out.print(Full_name.charAt(i)+" ");
        }
    }
    public static void main(String[] args){
        // String str= "vishal";
        // String str2= new String("vishal");

        Scanner sc= new Scanner(System.in);
        String First_name;
        String Last_name;
        String Full_name;
        First_name= sc.nextLine();
        Last_name= sc.nextLine();
        Full_name= First_name+" "+Last_name;

        // System.out.print(name+" "+ name.length());
        System.out.println(Full_name);
        letter(Full_name);
    }
}
