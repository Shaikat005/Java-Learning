package com.mycompany.method;

public class new_instance {
    String name;
    int age;
    
    new_instance(){
        System.out.println("Shaikat");
        System.out.println("22");
    }
    
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException
    {
        Class c=Class.forName("new_instance");
        new_instance s=(new_instance)c.newInstance();
        s.new_instance();
    }
}
