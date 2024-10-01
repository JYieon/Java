package if_;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력");
		num = input.nextInt();
		if(num > 100) {
			System.out.println("100보다 크다");
		}else if(num > 50) { //if(num > 50 && num < 100) <- 조건식도 길어지고 처리속도 느림
			System.out.println("50보다 크다");
		}else if(num > 0) {
			System.out.println("0보다 크다");
		}else {
			System.out.println("그 외의 값");
		}
		System.out.println("다음 문장들 실행~");
	}
}
