class exe7
{
	public static void main(String[] args)
	{
		int i = 1;
		
		while (i<=4)
		{
			int j = 1;
			int k = 1;
			while (j <= 4-i)
			{
				System.out.print(" ");
				j++;
			}
			
			while (k <= 2*i-1)
			{
				if(k==4&&i==4)
				{
				
					System.out.print("+");
					k++;
				}
				else
				{
				System.out.print("*");
				k++;	
				}	
			}
			
			System.out.println(" ");
			i++;
		}
		int l = 3;
		while (l >= 1)
		{
			int m = 3;
			int n = 1;
			
			while(m >= l)
			{
				m--;
				System.out.print(" ");
			}
			while(n <= 2*l-1)
			{
				n++;
				System.out.print("*");
			}
			l--;
			System.out.println(" ");
		}
	}
}