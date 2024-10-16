package singleton;

class Test04{
	public static Test04 t; //t = new Test04();
	private Test04() {
		System.out.println("객체생성!!!");
	}
	public static Test04 test() { //getInstance
		if(t == null)
			t = new Test04();
		else
			System.out.println("객체 있습니다.");
		return t;
	}
}

public class Ex04 {
	public static void main(String[] args) {
		//Test04 t = new Test04(); //생성자가 private이기 때문에 new라는 연산 사용 못함
		//System.out.println(Test04.t);
		
		Test04 t01 = Test04.test();
		Test04 t02 = Test04.test();
		
		System.out.println("생성 전 : " + t01);
		System.out.println("생성 전 : " + t02);
		
		
		System.out.println("생성 후 : " + Test04.t);
		
		
	}
}
