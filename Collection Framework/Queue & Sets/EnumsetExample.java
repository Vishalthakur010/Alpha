import java.util.*;

public class EnumsetExample {
    enum Color{
        Red, yellow, blue;
    }

    public static void main(String[] args){
        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);
        System.out.println(enumSet);
    }
}
