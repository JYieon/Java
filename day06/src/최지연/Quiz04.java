package 최지연;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("세 수 입력 : ");
		int num = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		int fir = 0;
		int sec = 0;
		int last = 0;
		
		if(num > num2) {
			fir = num;
			if(num2 > num3) {
				sec = num2;
				last = num3;
			}else {
				sec = num3;
				last = num2;
				if(num3 > num) {
					fir = num3;
					sec = num;
					last = num2;
				}
			}
		}else if(num2 > num) {
			fir = num2;
			if(num > num3) {
				sec = num;
				last = num3;
			}else {
				sec = num3;
				last = num;
				if(num3 > num2) {
					fir = num3;
					sec = num2;
					last = num;
				}
			}			
		}
		
		System.out.println("가장 큰 수 : " + fir);
		System.out.println("두번째 큰 수 : " + sec);
		System.out.println("마지막 수 : " + last);
	}
}
