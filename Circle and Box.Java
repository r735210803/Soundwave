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
class Box
{
 double height,width,length;
double Boxarea()
{
   return(width*height+width*length+height*length);
}
double BoxCircumference()
{
 return(height*width*length);
}
}

class Circlearea
{
public static void main(String args[])
{
 Box b=new Box();
b.height=10;
b.length=20;
b.width=15;

 circle c=new circle();
c.x=0.0;
c.y=0.0;
c.r=5.0;
System.out.println("The Area of Circle is="+c.area());

System.out.println("The Circumference of Circle is="+c.circumference());
System.out.println("The Area of Box is="+b.Boxarea());

System.out.println("The Circumference of Box is="+b.BoxCircumference());
}
}
