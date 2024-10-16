package abstract_;

abstract class Test01{
//	public void yearCar() {
//		System.out.println("2024년식 자동차");
//	}
	public abstract void yearCar(); //추상화. 실체화가 없음. 해당 클래스를 상속받는 자식은 무조건 이 기능을 만들어야한다.
	public void speed() {
		System.out.println("잘 달립니다~");
	}
}

class A01 extends Test01{
	
	public void autoSystem() {
		System.out.println("자동운전 모드 실행~!!");
	}

	@Override
	public void yearCar() {
		System.out.println("2025년식 자동차");
		
	}
}

public class Ex01 {
	public static void main(String[] args) {
		A01 a = new A01();
		a.speed();
		a.yearCar();
		a.autoSystem();
	}
}
