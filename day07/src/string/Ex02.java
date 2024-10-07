package string;

public class Ex02 {
	public static void main(String[] args) {
		String str1 = "   test     ";
		String str2 = "t   e   s   t     ";
		System.out.println("111" + str1 + "111"); //111은 공백 확인하려고 붙인 것
		System.out.println("111" + str2 + "111");
		System.out.println(str1.equals(str2));
	
		System.out.println("-----------------------");
		String s1 = str1.trim();//제일 처음과 마지막의 공백을 지워줌
		String s2 = str2.trim();
		System.out.println("111" + s1 + "111"); //111은 공백 확인하려고 붙인 것
		System.out.println("111" + s2 + "111");
		
		
		System.out.println("-----------------------");
		String addr = "01234 서울 노원구 동일로1234";
		String[] s = addr.split(" ");//어떤 값을 기준으로 문자열을 자를 것인가. 배열형태로 출력
		System.out.println(s[0]);
		System.out.println(s[1]);
		
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
		System.out.println("-----------------------");
		
		String phone = "010-1234-1234";
		String replace = phone.replace("-", "?");//-를 ?로 변경
		System.out.println(replace);		
		
		
		System.out.println(phone.charAt(3)); //[0], .get 사용 불가
		
		
	}
}
