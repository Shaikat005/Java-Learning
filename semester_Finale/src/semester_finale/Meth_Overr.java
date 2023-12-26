package semester_finale;

class People{
    String name;
    int id;
    void person1(String name,int id){
        this.name=name;
        this.id=id;
        System.out.println("Name= "+name+" Id= "+id);
    }
}

class Person extends People{
    int age=23;
    @Override
    void person1(String name,int id){
        this.name=name;
        this.id=id;
        System.out.println("Name= "+name+" Id= "+id+" Age= "+age);
    }
}

public class Meth_Overr{
    public static void main(String[] args){
            Person ob=new Person();
            ob.person1("Shaikat", 025);
    }
}