package semester_finale;

class Student{
    String name;
    int age;
    
    Student(String name,int age){
        this.name=name;
        this.age=age;
}   
    Student copy(){
        return new Student(this.name,this.age);
    }
}

public class Copy_Obj {
    public static void main(String[] args) {
        Student ob1=new Student("Shaikat",23);
        Student ob2=ob1.copy();
        
        System.out.println("Name= "+ob1.name+"  Age= "+ob1.age);
        System.out.println("Name= "+ob2.name+"  Age= "+ob2.age);
    }
}
