package semester_finale;

class livings{
    private String name;
    private int id;
    
        
    public void setName(String name){
        this.name=name;
    }
    
    public String getName(){
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    void Display(){
        System.out.println("No info.");
    }
}

class People extends livings{
    int age=23;
    livings ob=new livings();

    @Override
    void Display(){
        System.out.println("Name=  "+ob.getName()+" Id= "+ob.getId());
    }
}

public class Private {
    public static void main(String[] args){
        livings ob1=new livings();
        ob1.setName("Shaikat");
        ob1.setId(23);
        People ob=new People();
        ob.Display();
    }
}
