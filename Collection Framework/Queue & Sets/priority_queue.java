import java.util.*;

public class priority_queue {
    public static void main(String[] args){

        Queue<Integer> p= new PriorityQueue<>();

        p.offer(50);
        p.offer(20);
        p.offer(40);
        p.offer(30);
        p.offer(10);

        System.out.println(p);
        System.out.println(p.poll());
        System.out.println(p);
    }
}
