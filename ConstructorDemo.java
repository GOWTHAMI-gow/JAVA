import java.io.*;
//import java.util.*;
class Rectangle{
int l,b,a;
Rectangle()
{
l=5;
b=8;
a=l*b;
}
}
public class ConstructorDemo{
public static void main(String args[]){
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle();
System.out.println("Area of rectangle1 is" +r1.a);
System.out.println("Area of rectangle2 is" +r2.a);
}
}