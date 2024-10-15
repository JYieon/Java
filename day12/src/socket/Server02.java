package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server02 {
	public static void main(String[] args) throws Exception{
		ServerSocket server = new ServerSocket(12345);
		
		System.out.println("접속 대기중...");
		Socket sock = server.accept(); //client와 연결을 위해 대기
		InputStream in = sock.getInputStream();
	//	in.read(); //int, byte형태만 받을 수 있음.
		DataInputStream dis = new DataInputStream(in); //InputStream의 확장형. 더 많은 기능 제공
		
		String readData = dis.readUTF(); //String을 받아줌
		System.out.println("수신 데이터 : " + readData);
		
		OutputStream os = sock.getOutputStream();
		DataOutputStream dos = new DataOutputStream(os);
		dos.writeUTF("서버에서 응답");
		
		
		dis.close(); sock.close(); server.close();
		
	}
}
