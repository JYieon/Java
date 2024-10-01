package while_;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String name = null;
		int i = 0;
		while(true) {
			i++;
			System.out.println(i+". 이름 입력");
			name = input.next();
			//System.out.println("출력 : " + name);
			switch( name ) {
			case "홍길동" : System.out.println("반갑다");break;
			default : System.out.println("존재하지 않는다");
			}
		}
	}
}
