package semester_finale;

class superclass{
    superclass(){
        System.out.println("This is constructor from superclass.");
    }
}

class subclass extends superclass{
    subclass(){
        System.out.println("I'm subclass");
    }
}

public class Cons_Overr{
    public static void main(String[] args){
            subclass ob=new subclass();
    }
}