package variable;

public class ExClass02 {

	public static void main(String[] args) {
		//문자열을 저장할 때는 "", 문자 하나는 ''를 사용한다.
		char ch = 'A';
		String str = "aaa";
		System.out.println(ch);
		System.out.println(str);
		ch = '안';
		str = "반갑습니다."; 
		System.out.println(ch);
		System.out.println(str);
			
		System.out.println("-----상수-----");
		//상수는 변경할 수 없는 값
		//변경되면 안되는 값을 상수화 시킨다. final = 값을 저장하면 값을 변경하지 못함.
		//상수화된 변수는 대문자로 이름을 지어준다는 규칙이 있음
		final String KOREA = "대한민국";
		System.out.println( KOREA );
		//KOREA = "미국";
		//System.out.println(korea);
		
		System.out.println("-----형 변환(type casting)-----");
		char ch02 = 'A';
		System.out.println(ch02); //A
		System.out.println((int)ch02); //65 : A가 int형(정수형)으로 변환되어 출력 (아스키코드)
	}

}
