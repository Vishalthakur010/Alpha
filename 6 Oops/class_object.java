public class class_object{
    public static void main(String[] args){
        pen p1= new pen(); //created object p1 of the pen class
        p1.setcolor("blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="yellow";
        System.out.println(p1.color);
    }
}
//property + Function
class pen{
    // propery
    String color;
    int tip;

    // Function
    void setcolor(String newcolor){
        color=newcolor;
    }
    void setTip(int newtip){
        tip=newtip;
    }
}
class school{
    String name;
    int age;
    float cgpa;

    void calcgpa(int phys, int chem, int math){
        cgpa=(phys+chem+math)/+3;
    }
}