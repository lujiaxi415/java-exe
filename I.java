import java.io.*;

class I
{
	public static void main(String[] args)throws Exception
	{
		File file = new File("C:\\User\\admin\\Desktop\\hello.txt");
		if(file.exists())
		{
			InputStream input = new FileInputStream(file);
			byte[] data = new byte[3];
			input.read(data);
			System.out.println(new String(data));
			input.close();
		}
	}
}