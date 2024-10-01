package while_;

import java.util.Scanner;

public class login {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String id = null, pw = null;
		
		
		while(true) {
		
			System.out.print("1. 로그인\n2. 회원가입\n3. 종료\n>>>");
			
			int num = input.nextInt();
			
			if(num == 1) {
				System.out.print("아이디 입력 : ");
				String id2 = input.next();
				System.out.print("비밀번호 입력 : " );
				String pw2 = input.next();
				if(id2.equals(id) && pw2.equals(pw))
					System.out.println("인증 완료");
				else System.err.println("인증 실패");
					
			} else if (num == 2) {
				System.out.print("아이디 입력 : ");
				id = input.next();
				System.out.print("비밀번호 입력 : " );
				pw = input.next();
				System.out.println("회원가입 완료");
			} else if (num == 3) {
				break;
			}else {
				System.out.println("번호를 다시 입력하시오");
			}
		}
		System.out.println("-------------종료--------------"); 
		
		
		
		
	}
}
