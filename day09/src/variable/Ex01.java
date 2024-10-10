package variable;

import java.util.ArrayList;

class TestClass01{ //매개변수 개수가 다르거나 자료형이 다르면 다른 메소드로 인식
	public void sumfunc() {
		System.out.println("매개변수 없음");
	} 
	public void sumfunc(int n1, int n2) {
		System.out.println(n1 + n2);
	} 
	public void sumfunc(String s1, int n1) {
		System.out.println(n1 + s1);
	} 
}

public class Ex01 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		//arr.add();//add에도 여러가지 기능이 있다.
		TestClass01 t = new TestClass01();
		t.sumfunc();
		t.sumfunc(10, 10);
		t.sumfunc("안녕", 100);
	}
}
