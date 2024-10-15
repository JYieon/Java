package overriding;

class Ferrari{
	private int ye;
	public Ferrari(int ye) { this.ye = ye; }
	public int getYe() { return ye; }
	public void speed() {
		System.out.println(ye + "년식 페라리 속도 : 300km");
	}
}

class NewFerrari extends Ferrari{ //새로운 기능을 상속받아서 새로운 기능만 추가
	public NewFerrari(int ye) {
		super(ye);
	}
	public void autoSystem() {
		System.out.println("자동 운전 모드 실행!!!");
	}
//	public void newSpeed() { //기존 코드는 speed를 실행하기 때문에 부모의 speed출력. newSpeed를 따로 호출해줘야됨.
//		System.out.println(getYe() + "년식 페라리 400km");
//	}
	public void speed() { //Overriding. 부모의 메소드를 수정하는 방식.
		System.out.println(getYe() + "년식 페라리 500km");
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Ferrari fe = new Ferrari( 2024 );
		fe.speed();
		NewFerrari nfe = new NewFerrari(2025);
		nfe.speed();
		nfe.autoSystem();
	}
}
