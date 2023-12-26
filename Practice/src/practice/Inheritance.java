package practice;
class animal{
    int age;
    int lifespan;
}

class Tiger extends animal{
    String name="Tiger";
    void Display(int age,int lifespan){
        this.name=name;
        this.age=age;
        this.lifespan=lifespan;
        System.out.println("Name= "+name+"  Age= "+age+"  Lifespan= "+lifespan);
    }
}

class Lion extends animal{
    String name="Lion";
    
    void Display(int age,int lifespan){
        this.name=name;
        this.age=age;
        this.lifespan=lifespan;
        System.out.println("Name= "+name+"  Age= "+age+"  Lifespan= "+lifespan);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Lion ob1=new Lion();
        Tiger ob=new Tiger();
        ob1.Display(23, 70);
        ob.Display(25,75);
    }
}
