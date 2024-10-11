package Login;

import java.util.Scanner;

public class LoginService03 {
	LoginDTO03 dto = new LoginDTO03();
	Scanner input = new Scanner(System.in);
	int num = 0;
	String id = null, pw = null;
	
	public void Input() {
		System.out.print("아이디 입력 : ");
		id = input.next();
		System.out.print("비밀번호 입력 : ");
		pw = input.next();
	}
	
	public void display() {
		while(true) {
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 탈퇴");
			System.out.print(">>> ");
			num = input.nextInt();
			
			if(num == 1) { //로그인
				if(dto.getId() == null) {
					System.out.println("회원가입 먼저 하세요!!!");
				}else {
					Input();
					if(dto.getId().equals(id)) {
						if(dto.getPwd().equals(pw)) {
							System.out.println("인증 통과!!!");
						} else {
							System.out.println("비밀전호가 틀렸습니다.");
						}
					} else {
						System.out.println("존재하지 않는 id입니다.");
					}
				}
			} else if(num == 2) {
				if(dto.getId() != null) {
					System.out.println("사용자가 존재합니다. 탈퇴 후 진행하세요!!");
				} else {
					Input();
					dto.setId(id);
					dto.setPwd(pw);
					System.out.println("회원가입 완료");
				}
			} else if(num == 3) {
				if(dto.getId() == null) {
					System.out.println("회원가입 먼저 진행하세요!!!");
				} else {
					dto.setId(null);
					dto.setPwd(null);
					System.out.println("탈퇴 완료");
				}
			}else {
				System.out.println("잘못 입력하셨습니다");
			}
		}
	}
}
