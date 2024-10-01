package operater;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		
		int num;
		String result;
		System.out.print("수 입력 : ");
		num = Input.nextInt();
		result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(num + " = " + result);
		result = num / 3 == 0 ? "3의 배수이다" : "3의 배수가 아니다";
		System.out.println(num + " = " + result);
		
		int num1, num2;
		System.out.print("두 수 입력 : ");
		num1 = Input.nextInt();
		num2 = Input.nextInt();
		System.out.println("num1 : " + num1 + " ,num2 : " + num2);
		
		result = num1 > num2 ? "num1이 num2보다 크다" : "num2가 num1보다 크다";
		System.out.println(result);	
	}
	
}
