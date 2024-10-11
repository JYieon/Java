package dto;

import java.util.ArrayList;

class Test02{
	public Test02() {}//무조건 매개변수 없는 생성자는 만들어주는 게 좋음. 그래야 에러 안남
	public Test02(String s) {} //생성자를 만드는 순간 기본적으로 제공해주는 생성자는 사라짐(Test02()) -> 매개변수 없는 생성자가 없어진 것.
}

public class Ex02 {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		String s1 = new String();
		String s2 = new String("초기화");
		
		Test02 t = new Test02();
		
	}
}

