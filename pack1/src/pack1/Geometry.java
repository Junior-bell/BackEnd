package pack1;
//program to understand the Polymorphism oops concept
import java.util.Scanner;

public class Geometry 
{
  public double calculateArea(double radius)//area of a circle
  {
	  if(radius>0)
	  {
		  return 3.14*radius*radius;
	  }
	  else
	  {
		 System.out.println("invalid input");
		 return 0.0;
	  }
  }
  public Float calculateArea(float side)//area of a square
  {
	  if(side>0)
		  return side*side;
	  else
	  {
		  System.out.println("invalid input");
		  return 0f;
	  }
  }
  public Float calculateArea(float length,Float width)// area of rectangle 
  {
	  if(length>0 && width>0)
		  return (length*width);
	  else
	  {
		  System.out.println("invalid input");
		  return 0f;
	  }
  }
  double calculateArea(double height,Float base)//area of a triangle
  {
	  if(height>0 && base>0)
		  return 0.5*height*base;
	  else
	  {
		  System.out.println("invalid input");
		  return 0f;
	  } 
  }
  public static void main(String[] args) 
  {
	Scanner sc=new Scanner(System.in);
	Geometry obj=new Geometry();
	
	System.out.println("Enter the radius of a circle");
	System.out.println("area of a circle is : "+obj.calculateArea(sc.nextDouble()));
	
	System.out.println("Enter the side of square");
	System.out.println("Area of square is : "+obj.calculateArea(sc.nextFloat()));
	
	System.out.println("Enter the length and width  of a rectangle");
	System.out.println("Area of a rectangle is : "+obj.calculateArea(sc.nextFloat(), sc.nextFloat()));
	
	System.out.println("Enter the height and base of a triangle");
	System.out.println("The area of a triangle is: "+obj.calculateArea(sc.nextDouble(), sc.nextFloat()));
	sc.close();
}
}
/* output of above program on random input is as follows:
 Enter the radius of a circle
3.2
area of a circle is : 32.153600000000004
Enter the side of square
5
Area of square is : 25.0
Enter the length and width  of a rectangle
4
6
Area of a rectangle is : 24.0
Enter the height and base of a triangle
2.4
5.6
The area of a triangle is: 6.719999885559082
*/
