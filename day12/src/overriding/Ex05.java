package overriding;

import java.util.ArrayList;

class A05{
	public void test1() {
		
	}
}

class B05 extends A05{
	
}

class TestDTO{
	private String name;
	private int age;
	
	public TestDTO() {}
	public TestDTO(String name, int age) { //보통 기본 생성자랑 모든 값을 입력받는 생성자를 만든다.
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + ", " + age + "]";
	}
	
	
}

public class Ex05 {
	public static void main(String[] args) {
		TestDTO dto = new TestDTO("홍길동", 20); //객체를 만들면서 초기화
		
		System.out.println("dto : " + dto); //dto의 객체번호 출력
		System.out.println("toString : " + dto);
		
		int[] arr = {1, 2, 3};
		ArrayList arr02 = new ArrayList();
		arr02.add(111);
		arr02.add(222);
		
		System.out.println("배열 : " + arr); //객체에 대한 정보 
		System.out.println("리스트 : " + arr02); //객체가 가지고 있는 값 출력
		
		
		B05 b = new B05();
		System.out.println(".aaa".getClass()); //객체에 대한 타입을 알려줌
		System.out.println(b.getClass());
		System.out.println(b.toString());
		System.out.println(b);//toString 자동호출되며 출력된 것.
	}
}
