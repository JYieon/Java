package variable;

class Test04{
	String name; //여러 메소드에 사용한다면 전역변수로 선언하는 것이 좋다.
	public void inputData() {
		name = "홍길동";
	}
	public void printData() {
		System.out.println(name);
	}
}

public class Ex04 {
	public static void main(String[] args) {
		Test04 t = new Test04();
		t.inputData();
		t.printData();
	}
}
