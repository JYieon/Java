package while_;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int i = 0;
		while( i < 5 ) {
			i++;
			if(i == 3) {
				System.out.println(3333333);
				continue; //while의 처음으로 돌아감
			}
			System.out.println("i : " + i);
			
		}
		System.out.println("다음 문장들 실행!!!");
		
		System.out.println("---------");
		Scanner input = new Scanner(System.in);
		int num, sum = 0;
		while(true) {
			System.out.println("1~10 사이의 수 입력");
			num = input.nextInt();
			if( num > 0 && num <= 10) {
				break;
			}
			else if(num <= 0 || num > 10) {
				System.out.println("범위를 벗어남. 다시 입력");
				continue;
			}
		}
		
		
		for(i = 1; i <= num; i++) {
			num += i;
		}
		System.out.println("1 ~ " + num + "까지의 합 : " +sum);
	}
}
