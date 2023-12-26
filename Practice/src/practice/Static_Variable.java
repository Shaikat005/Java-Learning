package practice;
public class Static_Variable {
    static String name;
    static private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    static void display(){
        System.out.println("Name= "+name);
        System.out.println("Age= "+age);
    }
}

class test{
    public static void main(String[] args) {
        Static_Variable ob1=new Static_Variable();
        ob1.setAge(23);
        Static_Variable.name="Shaikat";
        Static_Variable.display();
    }
}
