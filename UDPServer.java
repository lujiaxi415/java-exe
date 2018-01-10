import java.io.*;
import java.net.*;

class UDPServer
{
	public static void main(String[] args) throws Exception 
	{
		DatagramSocket datagramSocket = new DatagramSocket(9999);
		
		byte[] recvBuf = new byte[1024];
		DatagramPacket recvPacket = new DatagramPacket(recvBuf, recvBuf.length);
		datagramSocket.receive(recvPacket);
		
		byte[] recvByte = recvPacket.getData();
		String upperStr = new String(recvByte ,0 ,recvByte.length).toUpperCase();
		System.out.println(upperStr);
	}
}

class UDPClient
{
	public static void main(String[] args) throws Exception
	{
		
		DatagramSocket clientSocket = new DatagramSocket();
		
		String sendStr = args[0];
		byte[] sendBuf = sendStr.getBytes();
		
		DatagramPacket sendPacket = new DatagramPacket(sendBuf, sendBuf.length, InetAddress.getByName("localhost"), 9999);
		clientSocket.send(sendPacket);
		clientSocket.close();
	}
}