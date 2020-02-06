import java.io.*;
class Circle
{
double x,y,r;
    double area()
{
   return(3.14*r*r);

}
double circumference()
{
   return(2*3.14*r);
}
 Circle(double x,double y,double r)

{ 
this.x=x;
this.y=y;
this.r=r;
}
 Circle(Double r)
{
this(0.0,0.0,5.0);
}
 Circle(Circle c)
{
 this(c.x,c.y,c.r);
}
 Circle()
{
this(0.0,0.0,6.0);
}
}
class CircleDemo
{
public static void main(String args[])
{

   Circle c=new Circle();


System.out.println("The area of Circle is="+c.area());
System.out.println("The cicumference of Circle is="+c.circumference());
}
 
