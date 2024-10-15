package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client02 {
	public static void main(String[] args) throws Exception{
		Socket sock = new Socket("192.168.51.10", 12345);
		Scanner input = new Scanner(System.in);
		OutputStream out = sock.getOutputStream();
		
		System.out.println("송신 데이터 입력");
		String msg = input.next();
		DataOutputStream dos = new DataOutputStream(out);
		dos.writeUTF(msg);
		System.out.println("전송 완료");
		
		InputStream in = sock.getInputStream();
		DataInputStream dis = new DataInputStream(in);
		msg = dis.readUTF();
		System.out.println("받은 데이터 : " + msg);
		
		dos.close(); out.close(); sock.close();
	}
}
