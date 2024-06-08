// we create this using throw keyword

import java.util.Scanner;

public class custom_exception {
    public static void main(String[] args){
        
        Scanner sc= new Scanner(System.in);
        System.out.println("enter age : ");
        int age= sc.nextInt();

        try{
            if(age>100){
                throw new Myexception("my error is this");
            }
        }catch(Myexception e){
            // System.out.println("custom Exception handeled");
            System.out.println(e);
        }
    }
}
class Myexception extends Exception{
        public Myexception(String message){
            super(message);
        }
}
