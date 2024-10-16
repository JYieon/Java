package abstract_;

interface A02{
	//pubilc void test() {} //메소드라는 공간을 만드는게 error
	public void test();
	public int test2(); //실체화가 없는 공간을 만들어준다.
}
class B02 implements A02{

	@Override
	public void test() {
		System.out.println("test 실행");
		
	}

	@Override
	public int test2() {
		System.out.println("test22 실행");
		return 0;
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		B02 b = new B02();
		b.test();
		b.test2();
	}
}
