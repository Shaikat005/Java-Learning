package semester_finale;

abstract class Message{
    void Display()
    {
        System.out.println("I'm non abstract method from Message");
    }
    abstract void send();
}

class shaikat extends Message{
    @Override
    void send(){
        System.out.println("I'm shaikat.");
    }
}

public class Abstract {
    public static void main(String[] args) {
        shaikat ob=new shaikat();
        ob.Display();
        ob.send();
    }
}
