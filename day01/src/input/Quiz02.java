package input;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		int korean = 100;
		int english = 98;
		int math = 75;
		
		System.out.print("당신의 이름은 무엇입니까? ");
		String name;
		name = Input.next();
		System.out.println( name + " 님의 국어 점수 : " + korean);
		System.out.println( name + " 님의 영어 점수 : " + english);
		System.out.println( name + " 님의 수학 점수 : " + math);
		System.out.println("\n");
		System.out.println("=======================");
		System.out.println("이 름 : " + name);
		System.out.println("=======================");
		System.out.println(" 국 어 : " + korean);
		System.out.println(" 영 어 : " + english);
		System.out.println(" 수 학 : " + math);
		System.out.println("=======================");
		System.out.println(" 합 계 : " + (korean + english + math));
		System.out.println("=======================");
		
		
		

	}

}
