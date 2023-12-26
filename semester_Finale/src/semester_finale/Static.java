package semester_finale;
class Vehicle{
    static int tires;
    static int engines;
    
    static void Display(){
        System.out.println("Tires= "+tires+" Engines= "+engines);
    }
}

public class Static {
    public static void main(String[] args) {
        Vehicle.engines=2;
        Vehicle.tires=4;
        Vehicle.Display();
    }
}
