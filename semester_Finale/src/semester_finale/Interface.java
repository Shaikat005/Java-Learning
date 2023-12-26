package semester_finale;

interface Message{
    abstract void send();
}

class shaikat implements Message{
    @Override
    public void send(){
        System.out.println("Hi,I'm shaikat."); 
    }
}

class ifti implements Message{
    @Override
    public void send(){
        System.out.println("Hi,I'm Raja."); 
    }
}

public class Interface {
    public static void main(String[] args) {
        ifti ob1=new ifti();
        ob1.send();
        shaikat ob2=new shaikat();
        ob2.send();
    }
}
