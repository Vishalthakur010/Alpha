public class _147_constructor {
    public static void main(String[] args){
        student s1=new student("vishal"); //constructor
        System.out.println(s1.name);

        boy s2= new boy();
    }
}
class student{
    String name;
    int roll;
    student(String name){
        this.name=name;
    }
}
class boy{
    String name;
    boy(){
        System.out.println("vishal Thakur");
    }
}
