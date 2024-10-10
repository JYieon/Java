package variable;

import java.util.Scanner;

class Student{ //같은 파일에서는 public class 두개 존재 못함. 그냥 class로 만들어준다.
	Scanner scan = new Scanner(System.in);
	String name, addr;
	int kor, math, eng, sum;
	public void input() {
		
		System.out.print("이름 : ");
		name = scan.next();
		System.out.print("주소 : ");
		addr = scan.next();
		System.out.print("국어 : ");
		kor = scan.nextInt();
		System.out.print("영어 : ");
		eng = scan.nextInt();
		System.out.print("수학 : ");
		math = scan.nextInt();
	}
	public void sum() {
		sum = kor + eng + math;
		System.out.println("총점 : " + sum);
	}

}

public class Quiz01 {
	public static void main(String[] args) {
		Student s = new Student();
		s.input();
		s.sum();
		
	}
}
