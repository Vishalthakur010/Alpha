public class _148_const_types {
    public static void main(String[] args){
        student s1= new student();
        s1.name="vishal001";
        s1.roll=52;
        s1.password="abcd";
        s1.marks[0]=100;
        s1.marks[1]=200;
        s1.marks[2]=300;

        // student s2= new student("vishal thakur");
        // student s3= new student(67);
        
        student s4= new student(s1);
        s1.marks[2]=400;
        for(int i=0; i<3; i++){
            System.out.println(s4.marks[i]);
        }
    }
}
class student{
    String name;
    int roll;
    String password;
    int marks[];

    // Non-parameterized
    student(){
        marks=new int[3];
        System.out.println("Non-parameterized constructor");
    }

    // Parameterized
    student(String name){
        marks= new int[3];
        this.name=name;
    }
    student(int roll){
        marks= new int[3];
        this.roll=roll;
    }

    //copy-constructor
    student(student s1){
        marks= new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
    }
}
