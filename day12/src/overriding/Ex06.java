package overriding;
//업캐스팅
class A06{
	public void test(){
		System.out.println("aaaa");
	}
}
class B06 extends A06{
	public void test() {
		System.out.println("bbbb");
	}
}

class C06 extends A06{
	public void test() {
		System.out.println("cccc");
	}
}

public class Ex06 {
	public static void main(String[] args) {
		A06 a;
//		B06 b;
//		C06 c;
//		a = new A06(); a.test();
//		b = new B06(); b.test();
//		c = new C06(); c.test();
		
		a = new A06(); a.test();
		a = new B06(); a.test();
		a = new C06(); a.test();
	}
}
