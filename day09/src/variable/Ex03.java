package variable;

class Test03{
	int var = 100;
	public void test1() {
		//int var = 100;
		System.out.println(var + "1111");
	}
	public void test2() {
		System.out.println(var + "2222");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		Test03 t = new Test03();
		t.test1();
		t.test2();
		
		if(true) {
			int num = 100; //if문이 종료되면 사라짐. 일회성 변수. 이후에 안쓸건데 계속 있으면 메모리 낭비
		}
		int num = 200;
		
		num = 100;
		//int num = 100;
		
		//if(int i = 0; i < 5; i++) {}//일회성변수
	}
}
