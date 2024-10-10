package variable;

public class Ex02 {
	public static void main(String[] args) {
		//메소드 안에서 선언된 변수 : 지역변수
		String name = "홍길동";
		if(true) {
			name = "김개똥";
			String n = "1111";
		}
		System.out.println(name);
	}
}
