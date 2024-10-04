package 최지연;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("두 수 입력 : ");
		int num = input.nextInt();
		int num2 = input.nextInt();
		int sum = num + num2;
		
		if(sum % 2 == 0 && sum % 3 == 0)
			System.out.println("두 수의 합은 짝수이면서 3의 배수입니다.");
		else
			System.out.println("두 수의 합은 짝수이면서 3의 배수가 아닙니다.");
	}
}
