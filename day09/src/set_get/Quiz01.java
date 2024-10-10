package set_get;

import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Quiz01_1 t = new Quiz01_1();
		
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		System.out.print("이름 입력 : ");
		name = input.next();
		System.out.print("나이 입력 : ");
		age = input.nextInt();
		
		t.setName(name);
		t.setAge(age);
		
		t.setManAge(age);
		
		name = t.getName();
		age = t.getAge();
		
		System.out.println(name + "님의 나이는 " + age + "살 입니다.");
	}
}
