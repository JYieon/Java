package overriding;

import java.util.ArrayList;

class Test02 extends ArrayList<String>{
	public void test(){
		System.out.println("상속 외 추가 기능");
	}

	@Override //생략가능
	public boolean add(String e) {
		// TODO Auto-generated method stub
		System.out.println(e + " : 잘 추가 되었음!!");
		return super.add(e); //부모의 add로 추가해라~ 안써도 상관없음~
	}

	@Override
	public String get(int index) {
		// TODO Auto-generated method stub
		System.out.println(index + ".번째 돌려줄게요~");
		return "내가 쓰고 싶은 거";
	}
	
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t = new Test02();
		t.add("문자열");
		System.out.println(t.get(0));
		t.test();
	}
}
