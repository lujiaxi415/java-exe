import java.util.*;


abstract class Shape
{
	abstract double perimeter();
	abstract double area();
}

class Rectangle extends Shape
{
	double length;
	double width;
	Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	@Override
	double perimeter()
	{
		return 2*(length+width);
	}
	
	@Override
	double area()
	{
		return length*width;
	}
}

class Triangle extends Shape
{
	double botmar;
	double height;
	double lefmar;
	double rigmar;
	Triangle(double botmar, double height, double lefmar, double rigmar)
	{
		this.botmar = botmar;
		this.height = height;
		this.lefmar = lefmar;
		this.rigmar = rigmar;
	}
	@Override
	double perimeter()
	{
		return botmar + lefmar + rigmar;
	}
	@Override
	double area()
	{
		return botmar*height*0.5;
	}
}

class Pentagon extends Shape
{
	double line;
	double height;
	Pentagon(double line, double height)
	{
		this.line = line;
		this.height = height;
	}
	@Override
	double perimeter()
	{
		return 5*line;
	}
	@Override
	double area()
	{
		return 1.5*line*height;
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

class exe39
{
	public static void main(String[] args)
	{
		//Shape sp = new Shape();
		Rectangle rt = new Rectangle(2,4);
		Circle cl = new Circle(3);
		Pentagon p1 = new Pentagon(1.732,2);
		Triangle t1 = new Triangle(2,4,1.732,1.732);
		printShape(rt);
		printShape(cl);
		printShape(p1);
		printShape(t1);
	}
	
	public static void printShape(Shape shape)
	{
		System.out.println(shape.getClass() + " area is:" + shape.area());
		System.out.println(shape.getClass() + " b perimeter is:" + shape.perimeter());
	}
}