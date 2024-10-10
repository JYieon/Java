package variable;

class Test05{ //키워드가 없음. default. 같은 패키지에서만 사용 가능
	public int num = 100; //인스턴스 변수. 객체를 만들고 사용 가능. 객체 안만들면 접근 불가. 생성이 안됨
	public static String name = "홍길동"; //static이 무조건 제일 먼저 생성
	//보통 공통적으로 쓰는 값을 static으로 사용
	public void test05() {
		
		System.out.println("test05 실행!!!");
	}
}

public class Ex05 {
	int num;//static보다 나중에 생성.new라는 연산을 만나야지 생성됨
	public static void main(String[] args) {
		Test05 t = new Test05();
		t.test05();
		//Common //CommonClass만 보임. 다른 패키지이기 때문에 default인 CommonClass02는 안보임.
		
	}
}
