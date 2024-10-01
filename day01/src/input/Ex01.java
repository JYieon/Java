package input;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		int num;
		num = Input.nextInt();
		System.out.println("입력 값 : " + num);
	
		double dou;
		System.out.print("실수 입력 : ");
		dou = Input.nextDouble();
		System.out.println("입력 실수 : " + dou);
		
		String str;
		System.out.print("문자열 입력 : ");
		str = Input.next();
		System.out.println("입력 문자열 : " + str);

	}

}
