package quiz01;

import java.util.Scanner;

public class QuizTest03 {
	public int[] myInput() {
		Scanner input = new Scanner(System.in);
		int[] arr = new int[3];
		System.out.println("첫 수 입력");
		arr[0] = input.nextInt();
		System.out.println("두번째 수 입력");
		arr[1] = input.nextInt();
		return arr;
	}
	public int op(int[] a) {
		return a[0] + a[1];
	}
	public void print(int a, int b, int c) {
		System.out.println(b+"+"+c+"="+a);
	}
}
