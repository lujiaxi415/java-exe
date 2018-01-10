import java.io.*;
import java.net.*;

class TCPServer
{
	public static void main(String[] args) throws Exception{
		
		ServerSocket serverSocket = new ServerSocket(8888);
		System.out.println("server finished, waiting Client");
		while(true)
		{
		Socket client = serverSocket.accept();
		
		DataInputStream dis = new DataInputStream(client.getInputStream ());
		String inputStr = dis.readUTF();
		System.out.println(inputStr);
		
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF("[Echo]:" + inputStr);
		
		dos.close();
		client.close();
		}
		//serverSocket.close();
	}
	
}
class TCPClient
{
	public static void main(String[] args) throws Exception
	
	{
		String str = args[0];
		Socket client = new Socket("localhost", 8888);
		
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF(str);
		
		DataInputStream dis = new DataInputStream(client.getInputStream());
		System.out.println(dis.readUTF());
		
		client.close();
	}
}