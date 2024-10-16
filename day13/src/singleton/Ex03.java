package singleton;

class Test03{
	int num;
	static int n; //프로그램이 시작하면 객체 없이도 만들어짐. 프로그램이 종료되면 없어짐
	public static void test1() {
		//num = 1000; //static class에서는 나중에 만든 값을 사용할 수 없음
	}public void test() {
		n = 1000;
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Test03.n = 1000;
		System.out.println(Test03.n);
		
		Test03 t01 = new Test03();
		Test03 t02 = new Test03();
		
		t01.n = 12345; //만들어진 하나의 n을 공유하며 사용
		System.out.println( Test03.n );
		System.out.println( t01.n );
		System.out.println( t02.n );
		
		
//		Test03 t01 = new Test03();
//		Test03 t02 = new Test03();
//		t01.num = 1000;
//		t02.num = 2000;
//		System.out.println(t01.num);
//		System.out.println(t02.num);
	}
}
