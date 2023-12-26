package StaticORcompiletimePoly;
//Method overloading is a example of compile time polymorphism
public class Student {
    int mark1;
    int mark2;
    int mark3;
    
    Student(){
        System.out.println("Display");
    }
    
    Student(int m1,int m2,int m3){
        mark1=m1;
        mark2=m2;
        mark2=m3;
        System.out.println(m1+" "+m2+" "+m2);
    }
    Student(int m1,int m2){
       mark1=m1;
       mark2=m2;
       System.out.println(m1+" "+m2);
    }

}
