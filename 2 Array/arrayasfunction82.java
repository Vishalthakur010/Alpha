import java.util.*;

public class arrayasfunction82{

    public static void array(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i]=marks[i]+1;
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int marks[]= {67,78,45,23};
        array(marks);

        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
    }
}
