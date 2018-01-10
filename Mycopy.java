import java.io.*;

class Mycopy
{
	public static void main(String[] args)throws IOException
	{
		if(args.length != 2)
		{
			
			
		}
		if(CopyUtil.fileExists(args[0]))
		{
			//to judge the sourse file exists or not 
			CopyUtil.mkdir(args[1]);
			String status = CopyUtil.copy(args[0],args[1])?"success":"false";
			System.out.println("operator:" + status);
		}
		else
		{
			System.out.println("src file not exists");
		}
	}
}


class CopyUtil
{
	private CopyUtil(){};
	public static boolean fileExists(String path)
	{
		return new File(path).exists();
		
	}
	public static boolean mkdir(String path)
	{
		File file = new File(path);
		boolean status = false;
		if(!file.getParentFile().exists())
		{
			file.getParentFile().mkdir();
		}
		return status;
	}
	public static boolean copy(String srcPath, String distPath) throws IOException;
	{
		boolean status = false;
		File srcFile = new File(srcPath);
		File distFile = new File(distPath);
		InputStream input = null;
		OutputStream output = null;
		try
		{
			input = new FileInputStream(srcFile);
			output = new FileOutputStream(distFile);
			copyHandle(input, output);
			status = true;
		}
		catch(IOException e)
		{
			
		}finally
		{
			input.colse();
			output.colse();
		}
		return status;
	}
	
	private static void copyHandle(InputStream input, OutputStream output)throws IOException
	{
		int temp = 0;
		byte[] data = new byte[1024];
		while((temp = input.read(data))>0)
		{
			output.write(data, 0, temp);
		}
	}
}