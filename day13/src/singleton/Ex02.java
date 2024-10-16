package singleton; //하나의 객체를 만들어 놓고 필요할 때 꺼내쓰는 것. 하나의 객체를 공유해서 쓰는 방식

class Test02{
	int num;
	static int cnt;
	public Test02() {
		cnt++;
		System.out.println(cnt + "객체 생성");
	}
}

public class Ex02 {
	public static void main(String[] args) {
		Test02 t01 = new Test02();
		Test02 t02 = t01;
		Test02 t03 = t02; //하나의 객체를 서로 공유
		
		System.out.println("t01 : " + t01);
		System.out.println("t02 : " + t02);
		System.out.println("t03 : " + t03);
		
		t01.num = 100;
//		t02.num = 200;
//		t03.num = 300;
		
		System.out.println("t01 : " + t01.num);
		System.out.println("t02 : " + t02.num);
		System.out.println("t03 : " + t03.num); //같은 공간을 공유하기 때문에 모두 같은 값이 저장되어 있음
	}
}
