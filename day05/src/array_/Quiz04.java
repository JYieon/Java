package array_;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		String[] id = new String[5]; //id가 저장될 배열
		String[] pwd = new String[5]; //pw가 저장될 배열
		String uid = null; //사용자에게 입력받을 id
		String upw = null; //사용자에게 입력받을 pw
		int lid = id.length - 1; //마지막 인덱스 번호 = 인덱스의 길이-1
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------------");
			System.out.println("1. 로그인");
			System.out.println("2. 회원가입");
			System.out.println("3. 모든 회원보기");
			System.out.println("4. 비밀번호 변경");
			System.out.println("5. 삭제");
			System.out.println("6. 종료");
			System.out.print(">>> : ");
			String num = input.next(); 
			// int로 입력받으니 문자열이 잘못 입력되면 에러나면서 종료됨. 
			// String으로 입력받아서 정해진 것 외에 잘못 입력되면 에러 안내 나갈 수 있도록 함
			
			//로그인
			if(num.equals("1") || num.equals("로그인")) {
				System.out.print("사용자 id : ");
				uid = input.next();
				System.out.print("사용자 pw : ");
				upw = input.next();
				
				for(int i = 0; i < id.length; i++) {
					if(uid.equals(id[i])) { //저장된 id에 입력한 값이 존재
						if(upw.equals(pwd[i])) { //같은 위치의 pwd도 입력한 값과 일치하는지 확인
							System.out.println("인증 통과"); 
							break;
						}
						else { //저장된 pwd와 pw가 일치하지 않는다면
							System.out.println("비밀번호가 틀렸습니다.");
							break; //비밀번호 틀림. for문 탈출
						}
					}
					else if(i == lid) { //저장된 id가 uid와 같지 않은데 마지막 인덱스였다면 
						System.out.println("존재하지 않는 아이디입니다."); //입력된 아이디는 저장된 id배열에 존재하지 않음
						break; //for문 탈출. 사실 가장 마지막에 실행되기 때문에 없어도 무방
					}
				}
				
			}
			//회원가입
			else if(num.equals("2") || num.equals("회원가입")) {
				System.out.print("새로운 id : ");
				uid = input.next();
				System.out.print("새로운 pw : ");
				upw = input.next();
				
				for(int i = 0; i < id.length; i++) {
					if(id[i] != null) {//id의 i번째 index에 값이 존재하면
						if(uid.equals(id[i])) {//입력된 id값과 동일한지 확인
							System.out.println("동일한 아이디가 존재합니다.");
							break;//동일한 아이디가 있다면 회원가입 실패. 반복문 탈출
						}//id가 동일하지 않으면 다시 for문 반복 = 빈자리 찾기
						else if(i == lid) //i에 값이 있는데 마지막 인덱스였다면
							System.out.println("더 이상 저장할 공간이 없습니다.");
					}else{//i번째 index에 값이 없다면 새로운 id, pwd 저장
						id[i] = uid;
						pwd[i] = upw;
						System.out.println("[회원가입이 완료되었습니다]");
						
						break;
					}
				} 
				
			}
			
			//모든 회원보기
			else if(num.equals("3") || num.equals("모든 회원보기")) {
				System.out.println("[모든 회원보기]");
				if(id[0] == null) {
					System.out.println("회원이 존재하지 않습니다.");
				}
				for(int i = 0; i < id.length; i++) {
					if(id[i] == null) continue; //id 값이 null이면 출력X
					System.out.println(id[i]);
				}
				
			}
			//비밀번호 수정
			else if(num.equals("4") || num.equals("비밀번호 변경")) {
				System.out.print("변경할 아이디  : ");
				uid = input.next();
				for(int i = 0; i < id.length; i++) {
					if(uid.equals(id[i])) {
						System.out.print("비밀번호 확인 : ");
						upw = input.next();
						if(upw.equals(pwd[i])) {
							System.out.print("비밀번호 변경 : ");
							String npw = input.next();
							pwd[i] = npw;
							break;
						} else {
							System.out.println("비밀번호가 틀렸습니다.");
							break;
						}
							
						
					}else if(i == lid) {
						System.out.println("해당 id는 존재하지 않습니다.");
					}
				}
				
			}
			//삭제
			else if(num.equals("5") || num.equals("삭제")) {
				System.out.print("삭제할 아이디  : ");
				uid = input.next();
				for(int i = 0; i < id.length; i++) {
					if(uid.equals(id[i])) {
						System.out.print("비밀번호 확인 : ");
						upw = input.next();
						if(upw.equals(pwd[i])) {
							id[i] = null;
							pwd[i] = null;
							System.out.println("[삭제 완료]");
							break;
						}else {
							System.out.println("비밀번호가 틀렸습니다.");
							break;
						}
					}else if(i == lid) {
						System.out.println("해당 id는 존재하지 않습니다.");
					}
				}
				
			}
			
			//종료
			else if(num.equals("6") || num.equals("종료")) {
				System.out.println("[종료합니다]");
				break;
			}
			
			else 
				System.out.println("잘못 입력하셨습니다.");
		}
		
		
	}
}
