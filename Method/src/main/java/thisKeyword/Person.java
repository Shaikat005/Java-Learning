package thisKeyword;
public class Person {
    String name;
    int age;
    int id;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    Person(String name,int age,int id){
        this(name,age);
        this.id=id;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(id);
    }
}
