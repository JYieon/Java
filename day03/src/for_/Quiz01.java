package for_;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		for (int i = 1; i<=num;i++) {
			System.out.println(i+". hello");
		}
	}
}
