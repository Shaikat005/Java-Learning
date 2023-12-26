package practice;
public class A {
    int X=10;
}

class B extends A{
        int X=5;
        void display(){
        System.out.println("X= "+super.X);
        }
}

class test{
    public static void main(String[] args) {
        B ob=new B();
        ob.display();
    }
}
