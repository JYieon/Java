package overriding;

final class A03{ //class앞 final : 상속할 수 없다. = overriding 할 수 없음. ex)String
	public void test() {
		System.out.println("a03 기본 기능");
	}
}

class B03 {
	private A03 a;
	public B03() {
		a = new A03();
	}
	public void b03() {
		System.out.println("b03 기능");
		a.test(); //overriding은 불가. 객체화해서 사용
	}
}

public class Ex03 {
	public static void main(String[] args) {
		B03 b = new B03();
		b.b03();
	}
}
