package overriding;

public class Ex08 {
	public static void main(String[] args) {
		int num = 100;
		String str = "aaaa";
		
		Object obj01 = 111;//모든 값에 대한 조상. 모든 값을 받을 수 잇음. 업캐스팅
		Object obj02 = "aaaa"; //자료형을 정확히 알 수 없음.
		Object obj03 = 1.3424;
		Object obj04 = new Ex07();
		String s = obj02 + "bbbb";
		System.out.println((int)obj01 * 100); //연산안됨. 부모형태에서 자식형태로 다시 바꿔줘야함. 다운캐스팅
		
	}
}
