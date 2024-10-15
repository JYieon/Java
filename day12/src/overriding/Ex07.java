package overriding;

import java.util.Scanner;

class Parents{
	public void familyName() {
		System.out.print("이");
	}
	public void name() {
		familyName();
		System.out.println(" 순신");
	}
}

class Daughter extends Parents{
	public void name() {
		familyName();
		System.out.println(" 국주");
	}
}
class Son extends Parents{
	public void name() {
		familyName();
		System.out.println(" 기광");
	}
}

public class Ex07 {
	public static void main(String[] args) {
		Parents p = null;//p는 참조형변수. p에는 주소가 저장됨.
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("1. 부모");
		System.out.println("2. 딸");
		System.out.println("3. 아들");
		System.out.println("선택하하세요 ");
		num = input.nextInt();
		if(num == 1) {
			p = new Parents();
			
		}
		else if(num == 2) {
			p = new Daughter();
		}
		else if(num == 3) {
			p = new Son();
		}
		
		p.name();
		
//		Parents p = new Parents();
//		p.name();
//		Daughter d = new Daughter();
//		d.name();
//		Son s = new Son();
//		s.name();
	}
}
