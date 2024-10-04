package 최지연;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int num = input.nextInt();
		
		if(num % 2 != 0 && num % 3 != 0)
			System.out.println("2의 배수도, 3의 배수도 아닙니다.");
		else if(num % 2 != 0)
			System.out.println("2의 배수가 아닙니다.");
		else if(num % 3 != 0)
			System.out.println("3의 배수가 아닙니다.");
		else
			System.out.println("2의 배수이면서 3의 배수 입니다.");
	}
}
