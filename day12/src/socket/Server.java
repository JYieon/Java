package socket;

import java.io.*;
import java.net.*;
import java.util.ArrayList;

class UserThread extends Thread{
	Socket sock = null;
	public UserThread(Socket sock) {
		System.out.println(sock.getInetAddress() + " 님이 접속했습니다.");
		this.sock = sock;	start(); //접속자 각각의 run 생성
	}
	@Override
	public void run() { //데이터 수신. 모든 사용자에게 전달
		InputStream in;  String readData=null;
		try {
			in = sock.getInputStream();
			DataInputStream dis = new DataInputStream(in);
			while(true) { //모든사용자에게 데이터를 전달하는 반복문
				readData = dis.readUTF();
				for(Socket s : Server.s) {
					OutputStream out = s.getOutputStream();
					DataOutputStream dos = new DataOutputStream(out);
					dos.writeUTF(readData);
				}
			}
		} catch (IOException e) {  e.printStackTrace();  }
		System.out.println("수신 데이터 : "+readData);
	}
}

public class Server {
	public static ArrayList<Socket> s = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(12345); 
		int i=0;
		while(true) {
			System.out.println("접속을 기다립니다");
			s.add(server.accept()); //사용자에 대한 정보 수집 -> ArrayList에 소켓형태로 저장
			new UserThread(s.get(i)); //UserThread에 사용자정보 전달
			i++;
		}
	}
}
