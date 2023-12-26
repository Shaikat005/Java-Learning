package Inheritance;

public class Copy_Constructor {
    private int id;
    private String name;
    
    public Copy_Constructor(Copy_Constructor ob1){
        this.id=ob1.id;
        this.name=ob1.name;
    }
    
    public static void main(String[] args) {
        Copy_Constructor c1=new Copy_Constructor();
    }
}
