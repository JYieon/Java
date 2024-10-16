package abstract_;

class A03{ //지상군
	public void 공격() {
		System.out.println("지상군이 공격합니다.");
	}
	public void 지상군() {
		System.out.println("지상군이 방어합니다.");
	}
}

class B03{ //공군
	public void attack() {
		System.out.println("비행기가 공격합니다.");
	}
	public void def() {
		System.out.println("비행기가 방어합니다.");
	}
}

public class Ex03 {
	public static void main(String[] args) {
		A03 a = new A03(); //지상군
		B03 b = new B03(); //공군
		
		a.공격();
		b.def();
	}
}
