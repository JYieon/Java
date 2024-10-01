package for_;

public class Ex01 {
	//규칙적으로 동작한다면 반복문 고려
	//변수에 1을 저장 후 출력시 1씩 증가된 값으로 출력되게 만드세요
	//10까지. 결과 : 1,2,3,4,5,6,7,8,9,10
	public static void main(String[] args) {
		for(int i = 1;i<=10;i++) {//;만 있으면 문법적으로 에러 없음(내용 생략해도)
			System.out.println(i);
		}
		
		
		for(int i = 2;i<=10;i+=2) {
			System.out.println(i);
		}
		
		for(int i = 1;i<=10;i++) {
			if(i%2==0)
				System.out.println(i+" : 짝");
			else
				System.out.println(i+" : 홀");
		}
	
		int sum = 0;
		for(int i = 1;i<=10;i++) {
			sum += i;
			System.out.println(sum);
		}
		
		int sum2 = 0;
		int sum3 = 0;
		for(int i = 1;i<=10;i++) {
			if(i%2==0) {
				sum2 += i;
				System.out.println("짝수의 합 : "+sum2);
			}
			else {
				sum3 += i;
				System.out.println("홀수의 합 : "+sum3);
			}
		}
	}

	
}
