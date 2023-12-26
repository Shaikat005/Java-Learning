package Inheritance;
public class Practice_Test extends Practice {
    String gender;

    @Override
        void display()
        {
            System.out.println("Name="+Name);
            System.out.println("Age="+age);
            System.out.println("Gender="+gender);
        }
    public static void main(String[] args) {
        Practice_Test ob1=new Practice_Test();
        ob1.Name="Shaikat";
        ob1.age=23;
        ob1.gender="Male";
        ob1.display();
        Practice ob2=new Practice();
        ob2.Name="Shaikat";
        ob2.age=23;
        ob2.display();
    }
}
