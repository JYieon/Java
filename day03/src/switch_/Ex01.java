package switch_;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		switch( num ) { //매칭된 값을 찾아감
		case 1: System.out.println("1 입력");
		case 2: System.out.println("2 입력"); //break;
		case 3: System.out.println("3 입력"); //break;
		default : System.out.println(num + " 입력");
		}
		System.out.println("다음 문장들 실행");
		
		System.out.println("문자열 입력");
		String str = input.next();
		switch( str ){
		case "a":System.out.println("에이 입력");break;
		case "b":System.out.println("비 입력");break;
		
		} //실수값은 비교할 수 없다. 문자열, 정수, 문자char만 비교 가능(String, int, char)
		
		System.out.println("짝 홀 구분");
		System.out.println("수 입력");
		num = input.nextInt();
		switch (num % 2) { //결과값을 변수에 넣어서 사용하는 게  더 좋다. int rsesult = num % 2;
		case 0 : System.out.println("짝수");break;
		default : System.out.println("홀수");
		}
		
	}
}
