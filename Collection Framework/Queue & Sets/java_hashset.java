// java hashset of custom objects

import java.util.*;

public class java_hashset {

    static class student{
        int roll;
        String name;

        public student(int roll, String name){
            this.roll= roll;
            this.name= name;
        }
        @Override
     public String toString() {
        return "student{" +
                "roll=" + roll +
                ", name='" + name + '\'' +
                '}';
            }

            @Override
            public boolean equals(Object obj){
                if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            student other = (student) obj;
            return Objects.equals(roll, other.roll);
            }

            @Override
            public int hashCode(){
                return Objects.hash(roll);
            }

    }
    public static void main(String[] args){
        Set<student> s = new HashSet<>();

        student s1= new student(50, "chris");
        student s2= new student(50, "iko");

        System.out.println(s1.equals(s2));
        
        s.add(new student(52, "vishal"));
        s.add(new student(53, "sweta"));
        s.add(new student(52, "krishna"));

        System.out.println(s);
    }
}
