package list_;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> num = new ArrayList<String>();
		String uname = null;
		String unum = null;
		
		while(true) {
			System.out.println("-----------------------------------------------");
			System.out.println("1. 연락처 등록");
			System.out.println("2. 이름 검색");
			System.out.println("3. 연락처 삭제");
			System.out.println("4. 모든 연락처 보기");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			String user = input.next();
			
			if(user.equals("1") | user.equals("연락처 등록")) {
				System.out.println("[연락처 등록]");
				System.out.print("등록할 이름 : ");
				uname = input.next();
				System.out.print("등록할 전화번호 : ");
				unum = input.next();
			
				if(num.contains(unum)) {
					System.out.println("이미 등록된 전화번호입니다.");
				}else {
					name.add(uname);
					num.add(unum);
					System.out.println("연락처가 등록되었습니다.");
				}
			}
			else if(user.equals("2") | user.equals("이름 검색")) {
				System.out.println("[이름 검색]");
				System.out.print("검색할 이름 : ");
				uname = input.next();
				if(name.contains(uname)) {
					int idx = name.indexOf(uname);
					System.out.println(name.get(idx) + ", " + num.get(idx));
				}else {
					System.out.println("목록에 없습니다.");
				}
			}
			else if(user.equals("3") | user.equals("연락처 삭제")) {
				System.out.println("[연락처 삭제]");
				System.out.print("삭제할 연락처(전화번호 입력) : ");
				unum = input.next();
				if(num.contains(unum)) {
					int del = num.indexOf(unum);
					num.remove(del);
					name.remove(del);
					System.out.println("연락처가 삭제되었습니다.");
				}else {
					System.out.println("목록에 없습니다.");
				}
			}
			else if(user.equals("4") | user.equals("모든 연락처 보기")) {
				System.out.println("[모든 연락처 보기]");
				if(name.size() == 0) {
					System.out.println("저장된 연락처가 없습니다.");
				}else {
					for(int i = 0; i < name.size(); i++) {
						System.out.println(name.get(i) + ", " + num.get(i));
					}
				}
			}
			else if(user.equals("5") | user.equals("종료")) {
				System.out.println("[종료]");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
		}
	}
}
