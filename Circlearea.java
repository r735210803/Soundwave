import java.io.*;
class circle
{
    double x,y,r;
double area()
{
   return(2*3.14*r);
}
double circumference()
{
 return(3.14*r*r);
}
}
class Circlearea
{
public static void main(String args[])
{

 circle c=new circle();
c.x=0.0;
c.y=0.0;
c.r=5.0;
System.out.println("The Area of Circle is="+c.area());

System.out.println("The Circumference of Circle is="+c.circumference());
}
}
