package class_;

import java.util.ArrayList;

import members_.MemberClass;

public class Ex01 {
	public static void main(String[] args) {
		Member m = new Member();
		m.name = "홍길동";
		System.out.println(m.name);
		System.out.println(m.addr); //기본적으로 null이 저장됨
		
		//ArrayList<String> s;
		//s.add(null); // 소괄호 있음 = 무언가 기능을 가지고 있다는 것.
		MemberClass mm = new MemberClass();
		mm.allPrint();
		mm.name = "111";
		mm.addr = "222";
		mm.allPrint();
	}
}
