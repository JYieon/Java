package string;

public class Ex01 {
	public static void main(String[] args) {
		String str1;
		String str2 = new String();
		String str3 = "test";
		String str4 = new String("aaaa"); //3과 4는 같은 코드
//		System.out.println("str : " + str1); // 초기화하지 않아서 에러. 
		System.out.println("str : " + str2); // 초기화하지 않아도 ㄱㅊ new를 사용하여 뭐라도 저장된 것.
		System.out.println("str : " + str3);
		System.out.println("str : " + str4);
		
		str4 = "Kim"; // kim, KIM
		System.out.println(str4.equals("kim")); // 사용자가 입력한 값마다 if를 만들 수는 없음 -> 전부다 소문자 or 대문자로 만들어 비교
		
		System.out.println(str4.toUpperCase());
		System.out.println(str4.toLowerCase());  // s는 항상 동일한 값을 가지고 있음. 변환시켜서 출력만 하는 것
		System.out.println(str4);
		
		String s = str4.toUpperCase();
		
//		if( s.equals("KIM")){
		if(str4.toUpperCase().equals("KIM")) { //한번에 사용가능. 순차적으로 처리됨
			System.out.println("김씨");
		}else {
			System.out.println("아니군");
		}
	}
}
