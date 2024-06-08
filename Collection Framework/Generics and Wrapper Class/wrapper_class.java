import java.util.*;

public class wrapper_class{
    public static void main(String[] args){
        
        // Integer obj= new Integer(23); // This is officially removed

        Integer obj2 = Integer.valueOf(25); // Autoboxing
        Integer obj3 = Integer.valueOf("25"); // Autoboxing
        System.out.println(obj3*4);

        Character ch= Character.valueOf('v'); // Autoboxing
        System.out.println(ch);

        Boolean boo= Boolean.valueOf(true); // Autoboxing
        System.out.println(boo);

        Integer obj4= 25; // Autoboxing (converted int to Integer)

        int age= obj3; // Unboxing (converted integer to int)
    }
}