package class_;

import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		System.out.println("main");
		TestClass08 t = new TestClass08();
		
		Scanner input = new Scanner(System.in);
		int num = 0, sum = 0;
		System.out.println("수 입력");
		num = input.nextInt();
		
		t.sumfunc(num);
		
		System.out.println("1 ~ " + num + " : " + sum);
		
		t.test1();
		t.test2(num,""); //항상 정해진 형식을 따라줘야함
		String s = t.get(11111);
		
		
	}
}
