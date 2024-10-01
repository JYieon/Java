package while_;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		int i = 0;
		boolean bool = true;
		while(bool) {
			i++;
			if(i == 3) {
				//break; //바로 끝
				bool = false; //다시 조건식으로 올라가는 것까지는 실행
			}
			System.out.println(i);
		}
		System.out.println("다음 문장들 실행!!");
		
		Scanner input = new Scanner(System.in);
		String name1, name2;
		System.out.println("1. 이름 입력");
		name1 = input.next();
		System.out.println("2. 이름 입력");
		name2 = input.next();
		System.out.println("n1 == n2 : "+(name1 == name2)); //주소값 비교
		System.out.println("n1.equals(n2) : " + (name1.equals(name2))); //값만 비교
		
		if(name2.equals(name2)) { //문자열은 equals로 비교
			System.out.println("이름이 같다");
		}else {
			System.out.println("두 값은 다르다!!");
		}
		
		String n1 = null, n2 = "test";
		int n = 0;
		
		if(n2.equals(n1)) { //error=> n1이 null. null은 값이 아니기 떄문에 equals 사용 불가
			System.out.println("같다");
		} else {
			System.out.println("n1, n2 다르다");
		}
		//n1 = null 단순 null값 비교는 이렇게 하면 됨.
	}
}
