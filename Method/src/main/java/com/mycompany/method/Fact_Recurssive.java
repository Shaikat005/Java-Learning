package com.mycompany.method;
public class Fact_Recurssive {
    
    int fibo(int a){
        if(a==0)
            return 1;
        else
             return a*fibo(a-1);
   }
    public static void main(String[] args){
        int n=5;
        Fact_Recurssive ob1=new Fact_Recurssive();
        System.out.println(ob1.fibo(n));
    }
}
