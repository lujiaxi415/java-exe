class exe1
{
	public static void main(String[] args)
	{
		int i;
		System.out.println("readying");
		i = 10/0;
		System.out.println("10 / 0 is" + i);
		try{main();}
		catch(ArithmeticException i)
		{
			System.out.println("10 / 0 is" + i);
		}
	} 
}