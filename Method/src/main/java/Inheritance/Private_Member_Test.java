package Inheritance;

public class Private_Member_Test extends Private_Member{
    String gender;
    void print(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(gender);
    }
    
    public static void main(String[] args) {
        Private_Member_Test ob1=new Private_Member_Test();
        ob1.setName("Shaikat");
        ob1.setAge(22);
        ob1.gender="Male";
        ob1.print();
    }
}
