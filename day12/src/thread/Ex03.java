package thread;

class A03 extends Thread{
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("A03 : " + i);
		}
	}
	
}

class B03 extends Thread{
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("B03 : " + i);
		}
	}
}
public class Ex03 {
	public static void main(String[] args) {
		A03 a = new A03();
		B03 b = new B03();
		a.start();
		b.start(); //개별동작가능
	}
	
}
