class MyDivide
{
	public static void main(String[] args)
	{
		System.out.println("divide start");
		MyDivide md = new MyDivide();
		try
		{
			int result = md.divide(args);
			System.out.println("divide result :" + result);
		}catch(Exception e)
		{
			System.out.println("args err: please checkit");
		}
		System.out.println("divide over");
	}
	public int divide(String[] args)
	{
		if(null == args || args.length < 2)
		{
			throw new IllegalArgumentException();
		}
		int num1 = 0;
		int num2 = 0;
		try{
			num1 = Integer.parseInt(args[0]);
			num2 = Integer.parseInt(args[1]);
		}catch(Exception e)
		{
			throw new NumberFormatException();
		}
		if(num2 == 0)
		{
			throw new IllegalArgumentException();
		}
		return num1/num2;
	}
}