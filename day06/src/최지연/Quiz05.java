package 최지연;

import java.util.Scanner;

public class Quiz05 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		int ko = input.nextInt();
		System.out.print("영어 점수 : ");
		int en = input.nextInt();
		System.out.print("수학 점수 : ");
		int ma = input.nextInt();
		
		int sum = ko + en + ma; //점수 총합
		int avg = sum / 3; //평균점수
		char grade = ' '; //등급
		if(avg >= 90)
			grade = 'A';
		else if(avg >= 80)
			grade = 'B';
		else if(avg >= 70)
			grade = 'C';
		else if(avg >= 60)
			grade = 'D';
		else 
			grade = 'F';
		
		if(avg < 60) {
			System.out.println("[평균 불합격]");
		}else if(ko < 40) {
			System.out.println("[국어 불합격]"); 
		}
		else if(en < 40) {
			System.out.println("[영어 불합격]");
		}
		else if(ma < 40) {
			System.out.println("[수학 불합격]");
		}
		else {
			System.out.println("[합격]");
		}
		
		System.out.println("--------------------");
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("등급 : " + grade);
		
	}
}
