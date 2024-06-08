import java.util.*;

public class Arraylists{
    public static void main(String[] args){
        List<Integer> obj= new ArrayList<>();
        obj.add(10);
        obj.add(20);
        obj.add(30);
        obj.add(40);

        System.out.println(obj);

        // System.out.println(obj.get(2));
        // obj.set(2,25);
        // obj.add(2,25);
        // obj.remove(1);

        // System.out.println(obj.indexOf(30));
        System.out.println(obj.lastIndexOf(40));

        // List Methods
        // System.out.println(obj);
        // System.out.println(obj.size());
        // System.out.println(obj.isEmpty());
        // System.out.println(obj.contains(20));
        // System.out.println(obj.remove(2));
        // System.out.println(obj);

        // List<Integer> obj2= new ArrayList<>();
        // obj2.add(5);
        // obj2.add(10);
        // obj2.add(15);
        // obj2.add(25);
        // obj2.add(35);

        // // obj2.removeAll(obj);

        // // obj.addAll(obj2);

        // // obj.retainAll(obj2);
        // System.out.println(obj);

        // Object arr[]= obj.toArray();
        // for(Object V : arr){
        //     System.out.println(V);
        // }
    }
}