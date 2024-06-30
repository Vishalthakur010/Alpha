import java.util.*;

public class sets {
    public static void main(String[] args){
        // Set<Integer> num = new HashSet<>();  O(n)
        // Set<Integer> num = new LinkedHashSet<>(); // uses linkedlist internally  O(1)
        Set<Integer> num = new TreeSet<>(); // uses Binary search tree internally and short in increasing order O(logn)
        num.add(50);
        num.add(30);
        num.add(20);
        num.add(40);
        System.out.println(num);

        Set<Integer> no = new HashSet<>();
        no.addAll(num);
        System.out.println(no);

        num.remove(30);
        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.contains(30));

    }
}
