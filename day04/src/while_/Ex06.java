package while_;

public class Ex06 {
	public static void main(String[] args) {
		for(int k = 0;k < 3;k++) {
			System.out.println("--- 상위 반복 시작");
			for(int i = 0;i<3;i++) {
				System.out.println(i + ". 하위 for");
				
			}
			System.out.println("상위 반복 끝---");
		}
		System.out.println("-------------------");
		
		for(int i = 0; i<3; i++) {
			for(int k = 0; k<5; k++) {
				System.out.println(i + ", " + k);
			}
		}
		
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j);
			}
		}
		
		//1. 로그인(값 없으면 인증실패, 다른 값 입력하면 인증실패) 2. 회원가입 3. 나가기
	}
	
}
