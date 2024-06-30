package comparable;

public class Animal implements Comparable<Animal>{
    int age;
    String name;
    int weight;

    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }
    public int getweight(){
        return weight;
    }

    public Animal(int age, String name, int weight){
        this.age=age;
        this.name=name;
        this.weight=weight;
    }

    @Override
    public String toString() {
        return "Animal{"+
                    "age="+ age +
                    " name="+ name +
                    " weight="+ weight+
                    "}"+"\n";
    }

    @Override
    public int compareTo(Animal obj){
        // return  this.name.compareTo(otherAnimal.name);
        if(this.age==obj.age){
            return this.name.compareTo(obj.name);
        }
        return this.age- obj.age;
    }
}
