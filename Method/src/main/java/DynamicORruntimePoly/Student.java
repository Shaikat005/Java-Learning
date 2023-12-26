package DynamicORruntimePoly;
//Method overridding is an example of runtime polymorphism.
public class Student {
    int mark1,mark2;
    
    void method(int mark1,int mark2){
        this.mark1=mark1;
        this.mark2=mark2;
        System.out.println(mark1+" "+mark2);
    }
    
    
}
