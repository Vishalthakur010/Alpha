import java.util.*;

// linear search

public class linearsearch83 {

    public static int linear(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linear2(String menu[], String dish) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == dish) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int number[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String menu[] = { "samosa", "dosa", "burger", "pizza", "momo" };
        String dish = "pizza";
        int key = 9;

        int answer = linear(number, key);
        if (answer == -1) {
            System.out.println("number not found");
        } else {
            System.out.println("number found at index : " + answer);
        }


        int answer2 = linear2(menu, dish);
        if (answer2 == -1) {
            System.out.print("dish not found");
        } else {
            System.out.print("dsih is founf at index : " + answer2);
        }
    }
}
