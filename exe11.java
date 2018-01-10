package xaut.computer.lujiaxi
import java.util.*;

abstract class Shape
{
	abstract double perimeter();
	abstract double area();
}
/*
class Square extends Shape
{
	double length;
	Square(double length)
	{
		this.length = length;
	}
	
	@Override
	double perimeter()
	{
		return 4*(length);
	}
	
	@Override
	double area()
	{
		return length*length;
	}
}
*/
class Triangle extends Shape
{
	double botmar;
	double height;
	Triangle(double botmar, double height)
	{
		this.botmar = botmar;
		this.height = height;
	}
	@Override
	double perimeter()
	{
		return botmar*3;
	}
	@Override
	double area()
	{
		return botmar*height*0.5;
	}
}

class Circle extends Shape
{
	double radius;
	Circle(double radius)
	{
		this.radius = radius;
	}
	@Override
	double perimeter()
	{
		return 2*Math.PI*radius;
	}
	double area()
	{
		return Math.PI*radius*radius;
	}
	
}

class exe11
{
	public static void main(String[] args)
	{
		//Shape sp = new Shape();
		//Scanner sc1 = new Scanner(System.in);
		
		Square rt = new Square(2);
		Circle cl = new Circle(3);
		Triangle t1 = new Triangle(4,3.464);
		printShape(rt);
		printShape(cl);
		printShape(t1);
	}
	
	public static void printShape(Shape shape)
	{
		System.out.println(shape.getClass() + " area is:" + shape.area());
		System.out.println(shape.getClass() + " perimeter is:" + shape.perimeter());
	}
}