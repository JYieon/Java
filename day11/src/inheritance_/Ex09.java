package inheritance_;
/*
 	로그인 기능
 	
 	학생관리, 에어컨,,,,
 	
 	학생관리 들어갈때 로그인 인증 사용자만 접근하게 만드세요
 */



class A09{
	public void a() { System.out.println("aaaa"); }
}
class B09 extends A09{
	public void b() { System.out.println("bbbb"); }
}
class C09 extends B09{
	public void c() { System.out.println("ccccc"); }
}
public class Ex09 {
	public static void main(String[] args) {
		C09 c = new C09();
		c.c();
		c.a(); c.b();
	}
}











