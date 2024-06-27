import java.util.*;

public class queue{
    public static void main(String args[]){
        Queue<Integer> fruit = new LinkedList<>();

        fruit.add(10);
        fruit.offer(20); // recomended offer
        fruit.offer(30);
        fruit.offer(40);
        fruit.offer(50);
        System.out.println(fruit);

        while(!fruit.isEmpty()){
            System.out.println(fruit.poll());
        }

        // System.out.println(fruit.remove());
        // System.out.println(fruit.poll()); // recomended poll
        // System.out.println(fruit);

        // System.out.println(fruit.element());
        // System.out.println(fruit.peek()); // recoommeded peek
        // System.out.println(fruit);
    }
}