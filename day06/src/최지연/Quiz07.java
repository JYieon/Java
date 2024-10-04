package 최지연;

import java.util.Scanner;

public class Quiz07 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		
		while(true) {
			System.out.print("수 입력 : ");
			int a = input.nextInt();
			if(a >= 10 && a <= 20) {
				for(int i = 1; i <= a; i++) {
					sum += i;
				}
				System.out.println("입력 받은 수까지의 합 : " + sum);
				break;
			}else
				System.out.println("다시 입력해주세요.");
		}
	}
}
