class exe6
{
	public static void main(String[] args)
	{
		boolean ju = false;
		for(int i = 1; i <=4; i++)
		{
			for(int j = 1; j <=4-i; j++)
			{
				System.out.print(" ");
				
			}
			for(int k = 1; k <= 2*i-1; k++)
			{
				if(k==4&&i==4)
				{
					ju = true;
					k++;
				}
				if(ju)
				{
					System.out.print("+");
					k++;
				}
				
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		for(int l = 3; l >=1; l--)
		{
			for(int m = 3; m >= l; m--)
			{
			System.out.print(" ");	
			}
			for(int n = 1; n <= 2*l-1; n++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}