import java.util.*;


interface GETAREA
{
	double getArea();
}


class Square implements GETAREA
{
	public double x;
	public Square(double x)
	{
		this.x = x;
	}
	public double getArea()
	{
		double result = x*x;
		return result;
	}
}


class Circle implements GETAREA
{
	public double x;
	public Circle(double x)
	{
		this.x = x;
	}
	public double getArea()
	{
		double result = x*x*Math.PI;
		return result;
	}
}


class Triangle implements GETAREA
{
	public double x;
	public Triangle(double x)
	{
		this.x = x;
	}
	public double getArea()
	{
		double result = Math.sqrt(3)*0.25*x*x;
		return result;
	}
}


public class CalcArea
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		GETAREA g;
		double area = 0;
		int s = 0;
		int c = 0;
		int t = 0;
		
		for(int i = 0;i < args.length; i+=2)
		{
			if(args[i].equals("square"))
			{
				g = new Square(Double.parseDouble(args[i+1]));
				area += g.getArea();
				s++;
			}
			else if(args[i].equals("triangle"))
			{
				g = new Triangle(Double.parseDouble(args[i+1]));
				area += g.getArea();
				t++;
			}
			else
			{
				System.out.println("the wrong input");
				System.exit(-1);
			}
		}
		System.out.println("the total number is: "+ args.length/2);
		System.out.println("the number of square is:" + s);
		System.out.println("the number of circle is:" + c);
		System.out.println("the number of triangle is:" + t);
		System.out.println("the total area is:" + area);
	}
}