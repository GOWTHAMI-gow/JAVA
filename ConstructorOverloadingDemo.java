import java.io.*;
class Square{
    int s;
    Square(){
        //default constructor
        s=5;
    }
    Square(int x){
        //parameterized constructor
        s=x;
    }
    void area(){
        System.out.println("Area of square is "+(s*s));
    }
}
class ConstructorOverloadingDemo{
    public static void main(String args[]){
        Square s1=new Square();//default constructor is invoked
        Square s2=new Square(8);//parametrized constructor is invoked
        s1.area();
        s2.area();
    }
}