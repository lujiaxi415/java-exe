import java.util.*;
class Mycode
{
	public static void main(String[] args)throws Exception
	{
		System.getProperties().list(System.out);
		String str = "早上好";
		System.out.println(new String(str.getBytes("GBK")));
	}
}