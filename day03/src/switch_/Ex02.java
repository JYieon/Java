package switch_;

public class Ex02 {
	public static void main(String[] args) {
		String name = null;
		int num = 0;
		switch(num) {
		case 1: System.out.println("이름 저장");
			name = "홍길동"; break;
		case 2: System.out.println("출력");
		}
		System.out.println("이름 : " + name);
	}
}
