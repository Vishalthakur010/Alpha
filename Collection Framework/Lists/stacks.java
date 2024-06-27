import java.util.*;

public class stacks {
    public static void main(String[] args){
        Stack<String> fruits= new Stack<>();
        
        fruits.push("apple");
        fruits.push("banana");
        fruits.push("carrot");
        fruits.push("doracakes");

        System.out.println(fruits);
        System.out.println(fruits.pop());
        System.out.println(fruits.pop());
        System.out.println(fruits);
        fruits.push("cake");
        System.out.println(fruits.peek());

        System.out.println(fruits.empty());
    }
}
