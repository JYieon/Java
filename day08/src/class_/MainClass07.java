package class_;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass07 {
	public static void main(String[] args) {
		System.out.println("main");
		TestClass07 t = new TestClass07();
		
		Scanner input = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.println("수 입력");
		num = input.nextInt();
		
		t.sumfunc(num);
	}
}
