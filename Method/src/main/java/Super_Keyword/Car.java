package Super_Keyword;
public class Car extends Vehicle{
    int gear;

    public Car(String c, int w,int g) {
        super(c, w);
        gear=g;
        super.display();
        System.out.println(gear);
    }
    
}
