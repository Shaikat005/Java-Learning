package DynamicORruntimePoly;
public class Student_test extends Student{
    int mark3;
    void method(int mark1,int mark2,int mark3){
        //super.method(mark1, mark2);
        this.mark3=mark3;
        System.out.println(mark1+" "+mark2+" "+mark3);
    }
    public static void main(String[] args) {
        Student_test ob1=new Student_test();
        ob1.method(10,20,30);
        ob1.method(10,20);
    }
}
