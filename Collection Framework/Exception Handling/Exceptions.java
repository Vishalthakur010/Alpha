import java.util.*;

public class Exceptions{
    public static void main(String[] args){
        int arr[]=  new int[5];

        System.out.println("hello vishal");

        // try{
        //     int result= 5/0;
        //     System.out.println(arr[12]);
        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("trying to access the out of bound index");
        // }
        // catch(ArithmeticException e){
        //     System.out.println(e.getStackTrace());
        //     System.out.println(e.getMessage());
        // }
        // System.out.println("Bye vishal");


        try{
                int result= 5/0;
                System.out.println(arr[12]);
            }
            //To handle multiple Exception
            // catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            //     System.out.println("trying to handle both exception");
            // }

            // to handle all the Runtime Exception
            // catch(RuntimeException e){
            //     System.out.println("Runtime Exception");
            // }

            // This is the parent of all exception class and used to handle all types of exception 
            catch(Exception e){
                System.out.println("All exceptions handled");
            }
            System.out.println("Bye vishal");
    }
}