package if_;

import java.util.Scanner;

public class Quiz02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if(num == 0) {
			System.out.println("0은 잘못 입력했습니다.");
		}else if(num % 12 == 0) {
			System.out.println("3의 배수이면서, 4의 배수에도 해당합니다.");
		}else if(num % 3 == 0) {
			System.out.println("3의 배수에만 해당합니다.");
		}else if(num % 4 == 0) {
			System.out.println("4의 배수에만 해당합니다.");
		}else {
			System.out.println("3의 배수도, 4의 배수도 해당안됩니다.");
		}
				
	}
}
