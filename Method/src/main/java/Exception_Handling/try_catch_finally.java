package Exception_Handling;
public class try_catch_finally {
    public static void main(String[] args) {
        try{
            int x=10;
            int y=0;
            int result=x/y;
            System.out.println("Result= "+result);
        }
        catch(Exception e){
            System.out.println("Exception: "+e);
        }finally{
            System.out.println("Last line of programe.");
        }  
    }
}
