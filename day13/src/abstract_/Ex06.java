package abstract_;

import java.util.Scanner;

class A06 implements Army04{ //지상군

	@Override
	public void attack() {
		System.out.println("지상군이 공격합니다.");
		
	}

	@Override
	public void defense() {
		System.out.println("지상군이 방어합니다.");
		
	}
	
}

class B06 implements Army04{ //공군

	@Override
	public void attack() {
		System.out.println("비행기가 공격합니다.");
		
	}

	@Override
	public void defense() {
		System.out.println("비행기가 방어합니다.");
		
	}
	
}

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Army04 a;
		//A06 = a new A06();
		//B06 b = new B06();
		
		System.out.println("적이 쳐들어왔습니다.");
		System.out.println("1 지상군, 2 공군");
		int choice = input.nextInt();
		if(choice == 1) {
			System.out.println("지상군이 선택 되었습니다.");
			a = new A06();
		} else {
			System.out.println("공군이 선택되었습니다.");
			a = new B06();
		}
		System.out.println("1 공격, 2 방어");
		int num = input.nextInt();
		if(num == 1) {
			a.attack();
		}else if(num == 2) {
			a.defense();
		}
//		if(choice == 2 && num == 1) {
//			b.attack();
//		}else if(choice == 2 && num == 2) {
//			b.defense();
//		}
	}
}
