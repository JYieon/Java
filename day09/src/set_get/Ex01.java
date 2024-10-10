package set_get;

class Test01{
	int num = 12345;
	public void abcd() {
		System.out.println("abcd 호출");
	}
	
	public void test() {
		this.abcd(); //가독성을 높일 때(나에게 있는 값이다~), 변수의 이름이 똑같을 때 사용
		abcd(); //내부에 있는 기능은 바로 호출가능
		int num = 500;
		System.out.println("test num : " + num); //모든 값은 자기 범위에 속한 값이 우선
		System.out.println("this : " + this); //t와 같은 값 출력. 자기 자신에 대한 정보를 가지고 있다.
		System.out.println("test.num : " + this.num); 
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Test01 t = new Test01();
		System.out.println("t : " + t);  //t의 위치 출력
		System.out.println("t.num : " + t.num);
		
		t.test();
		t.abcd();
	}
}
