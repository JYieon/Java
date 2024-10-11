package dto;

class Test01{
	//생성자는 클래스 이름과 똑같이 만들고 반환타입 지정 x
	//객체가 만들어지면 자동으로 실행
	
	private String name;
	
//	if(true) {
//		name = "홍길동";
//	}else {
//		name = "김개똥";
//	}
	
	public Test01(){ //외부 접근 불가.
		System.out.println("기본 생성자 실행");
	}
	public Test01(String name) { //입력받는 매개변수가 다르다면 다른 생성자로 인식
		System.out.println(name + " : 생성자 실행");
		this.name = name;
	}
	public String getName() {return name;}
	
	public void test() {}
	public void test(String s) {}
	public void test(int s) {}
}

public class Ex01 {
	public static void main(String[] args) {
		String name = "홍길동";
		Test01 t = new Test01(name);
		System.out.println("main : " + t.getName());
	}
}
