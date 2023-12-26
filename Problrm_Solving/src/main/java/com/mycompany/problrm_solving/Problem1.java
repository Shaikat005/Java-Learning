package com.mycompany.problrm_solving;
public class Problem1 {
    double height,width,depth;
    Problem1(double h,double w,double d){
        height=h;
        width=w;
        depth=d;
    }
    void displayVol(){
        System.out.println(height*width*depth);
    }
    public static void main(String[] args){
        Problem1 box1=new Problem1(2.33,3.66,4.52);
        box1.displayVol();
        Problem1 box2=new Problem1(3.33,2.66,3.52);
        box2.displayVol();
    }
}
