import java.util.*;

public class Deque {
    public static void main(String[] args){
        ArrayDeque<Integer> num = new ArrayDeque<>();
        num.offer(50); 
        num.offer(60); 
        num.offer(70);

        //Array Deque or Queue operations
        System.out.println("Queue operations");
        System.out.println(num);

        num.offerFirst(40);
        num.offerLast(80);
        System.out.println(num);

        num.pollFirst();
        num.pollLast();
        System.out.println(num);

        System.out.println(num.peekFirst());
        System.out.println(num.peekLast());

        // Stack Operations

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        System.out.println("stack operations");
        stack.push(40);
        stack.push(30);
        stack.push(20);
        stack.push(10);

        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());

    }
}
