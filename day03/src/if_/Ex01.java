package if_;

public class Ex01 {
	public static void main(String[] args) {
		int num = 150;
		if( num > 0 && num < 100) {
			System.out.println("0 ~ 100 사이 수");
		}else {
			System.out.println("그 외의 값");
		}
		System.out.println("다음 문장들 실행~");
		
		num = 3;
		if( num > 0 ) {
			if( num <= 100) {
				System.out.println("0 ~ 100 사이 수");	
			}else {
				System.out.println("100보다 큰 양수");
			}
		}else {
			System.out.println("음수 입니다!!!");
		}
		System.out.println("다음 문장들 실행~");
	}
} 
// break point-> f11 : breal point 까지 실행 + f6 한줄씩 실행 f2 종료 break p 없애기
