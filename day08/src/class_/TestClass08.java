package class_;

public class TestClass08 {
	public int sumfunc(int num) { //입력받는 변수와 매개변수의 자료형 일치, 반환자료형과 리턴하는 값의 자료형을 일치시킨다
		System.out.println("08");
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum+=i;
		}
		return sum; //메소드 종료 or 값을 돌려주는 역할
	}
	
	public void test1() {//void는 돌려주는 값이 없음
		
	}
	
	public void test2(int n, String s) {
		
	}
	public String get(int index) {
		return "abcd";
	}
}
