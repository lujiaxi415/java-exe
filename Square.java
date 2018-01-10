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
