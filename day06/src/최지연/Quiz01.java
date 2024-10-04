package 최지연;

import java.util.Scanner;

//짝, 홀 구분
public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("수 입력 : ");
		int num = input.nextInt();
		if(num % 2 == 0)
			System.out.println("짝수 입니다.");
		else
			System.out.println("홀수 입니다.");
	}
}
