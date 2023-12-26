package semester_finale;

class string{
    String name;
    int id;
    
    void Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    
    @Override
    public String toString(){
        return "Name= "+name+"\nId= "+id;
    }
}
public class tostring {
    public static void main(String[] args) {
        string ob=new string();
        ob.Person("Shaikat",201505);
        System.out.println(ob);
    }
}
