interface Area<T extends Number>
{
	public double area(T a);
}

class Circle<T extends Number>implements Area<T>
{
	double i;
	public Circle(double i)
	{
		this.i = i;
	}
	public double area(T a)
	{
		double i = a.doubleValue();
		return i*i*Math.PI;
	}
}

class Square<T extends Number>implements Area<T>
{
	double i;
	public Square(double i)
	{
		this.i = i;
	}
	public double area(T a)
	{
		double i = a.doubleValue();
		return 1*1;
	}
}

class GetA<T extends Number>implements Area<T>
{
	double i;
	public GetA(double i)
	{
		this.i = i;
	}
	public double area(T a)
	{
		double b = a.doubleValue();
		return b*b;
	}
}

public class GetArea
{
	public static void main(String[] args)
	{
		Circle<Double> cir = new Circle<Double>(5);
		GA<Double> square = new GA<Double>(15);
		System.out.println("r = 5:" + cir.area(5.0));
		System.out.println("line = 15:" + square.area(15.0));
	}
}