public class Data_type{
    public static void main(String[] args){
        boolean b;//in boolean variable we can store two types of data.Either true or false.
        char c='a';
        int i=40;
        short s=3255;
        float f=20.567f;
        double d=25.98745;
        
        b=true;
        System.out.println("b="+b);
        System.out.println("i="+i);
        System.out.println("Short= "+s);
        System.out.println("Character= "+c);
        System.out.println("Float Value= "+f);
        System.out.println("Double value= "+d);
        
        /*if we want to print using printf method,we will have to use 
        format specifiers.Examples are below*/
        
        System.out.printf("b= %b\n",b);
        System.out.printf("i= %d\n",i);
        System.out.printf("Short= %d\n",s);
        System.out.printf("Character= %c\n",c);
        System.out.printf("Float Value= %0.2f\n",f);
        System.out.printf("Double value= %0.2f\n",d);
    }
}