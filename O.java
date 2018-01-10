import java.io.*;

class O
{
	public static void main(String[] args)throws Exception
	{
		File file = new File("C:\\User\\admin\\Desktop\\hello.txt");
		if(!file.exists())
		{
			file.createNewFile();
		}
			OutputStream output = new FileOutputStream(file);
			byte[] data = "this is output data".getBytes();
			output.write(data);
			output.close();
		}
	}


