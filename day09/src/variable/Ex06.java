package variable;

import common.CommonClass;

public class Ex06 {
	public static void main(String[] args) {
		//CommonClass c = new CommonClass(); //CommonClass에 있는 것을 사용하려면 무조건 객체화를 해야함
		//c.path가 static이면 딱히 객체선언 안해도됨.
		System.out.println(CommonClass.path + "위치에 저장");//클래스 이름으로 접근 가능
		CommonClass.path = "위치 변경 ~";
		
		//CommonClass.KOREA = "AAA"; //final이 붙어서 변경 불가능
		
	}
}
