import java.util.Scanner;

//we have created this class for calculating area of different shapes.
public class Area {
	
	//this function calculates area of square .
	public static void areaOfSquare(double side)
	{
		System.out.println(String.format("%.2f",side*side));
	}
	
	//this function calculates area of rectangle .
	public static void areaOfRectangle(double length , double width)
	{
		System.out.println(String.format("%.2f", length*width));
	}
	
	//this functin calculates the area of circle .
	public static void areaOfCircle(double radius , double phi)
	{
		System.out.println(String.format("%.2f", phi*radius*radius));
	}
	
	//this function calculates area of triangle .
	public static void areaOfTriangle(double base , double height)
	{
		System.out.println(String.format("%.2f",(base*height)*1/2));
	}
	
	/* in main function we are taking user choice input and the taking required data from the user
	 * and then calling the function as per user choice .
	 */
	 public static void main (String[] args) 
	 {	int choice;
	 Scanner sc = new Scanner(System.in); 
	 
		 System.out.println("Enter your choice: \n 1:Area of Circle \n 2:Area of Triangle \n 3:Area of Rectangle \n 4: Area of Square");
		 
		 choice=sc.nextInt();
		if(choice>=1 && choice<=4) 
		{
		 if(choice==1)
		 { 
			 System.out.println("enter radius of circle");
			 double radius=sc.nextDouble();
			 double phi=3.14;
			 areaOfCircle(radius,phi);
		 }
		if(choice==2)
		{
			System.out.println("enter height and base of triangle");
			 double higth=sc.nextDouble();
			 double base=sc.nextDouble();

			 areaOfTriangle(base , higth);
		}
		if(choice==3)
		{
			System.out.println("enter length and width of Rectangle");
			 double length=sc.nextDouble();
			 double width=sc.nextDouble();

			 areaOfRectangle(length,width);
		}
		if(choice==4)
		{
			System.out.println("enter side of square");
			 double side=sc.nextDouble();
			 areaOfSquare(side);
		}
		}else{ 
			System.out.println("please enter a valid choice");
		 }
		
	 }
}
