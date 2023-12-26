package practice;
public class Overloading {
   String name;
   String gender;
   int age;
   
   void Display(String name,int age){
       this.name=name;
       this.age=age;
       System.out.println("Name= "+name);
       System.out.println("Age= "+age);
   }
   
   void Display(String name,int age,String gender ){
        this.name=name;
        this.age=age;
        this.gender=gender;
        System.out.println("Gender= "+gender);
        System.out.println("Name= "+name);
        System.out.println("Age= "+age);
   }
}

class test{
    public static void main(String[] args) {
        Overloading ob1=new Overloading();
        ob1.Display("Shaikat", 23);
        ob1.Display("Rakib", 23,"Venta");
    }
}
