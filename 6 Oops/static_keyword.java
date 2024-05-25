public class static_keyword {
    public static void main(String[] args){
        student s1= new student();
        s1.school="Gsps";

        student s2= new student();
        // System.out.println(s2.school);

        student s3= new student();
        s3.school="Dps";

        System.out.println(s1.school);
    }
}
class student{
    static int percentage(int math, int physics, int chem){
        return (math+physics+chem)/3;
    }
    
    String name;
    int roll;
    static String school;

    void setname(String name){
        this.name=name;
    }
    String getname(){
        return name;
    }
}