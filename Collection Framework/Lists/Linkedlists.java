import java.util.*;

public class Linkedlists {
    public static void main(String[] args){
        List<String> fruits= new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grapes");
        fruits.add("Blackberry");

        for(int i=0; i<fruits.size(); i++){
            System.out.println("fruit is "+ fruits.get(i));
        }
        for(String fruit : fruits){
            System.out.println("for each fruit "+ fruit);
        }

        Iterator<String> fruit= fruits.iterator();
        while(fruit.hasNext()){
            System.out.println("Iterator : "+fruit.next());
        }

        List<String> smallList= fruits.subList(1, 4);
        System.out.println(smallList);
    }

}
