package if_;

public class Ex02 {
	public static void main(String[] args) {
		int num;
		num = 11;
		if( num > 10 ) {
			System.out.println(num + " : 10보다 크다"); //{}가 없으면 바로 밑의 문장만 종속 문장으로 인식
			System.out.println("1. 다음 문장을 실행~");
			System.out.println("2. 다음 문장을 실행~");
			System.out.println("3. 다음 문장을 실행~");
		
		}
		System.out.println("4. 다음 문장을 실행~");
		
		if( num % 2 == 0) {
			System.out.println(num + "은 짝수다.");
		}
		System.out.println("5. 다음 문장");

		if( num % 2 != 0) {
			System.out.println(num + "은 홀수다.");
			System.out.println("6. 다음 문장");
		}
	}
}
