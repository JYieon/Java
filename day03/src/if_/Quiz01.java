package if_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("주문하실 커피의 개수를 입력하시오 : ");
		int coffee = 2000;
		int num = input.nextInt();
		int price = 0;
		
		if(num > 10) {
			price += (coffee * 10);
			coffee = 1500;
			num = num - 10;
			price += (coffee * num);
		}else {
			price += (coffee * num);
		}
		
		
		System.out.println("커피 금액 : " + price);
	}
}
