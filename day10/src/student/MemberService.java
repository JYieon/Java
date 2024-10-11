package student;

import java.util.Scanner;

public class MemberService {
	MemberDTO dto = new MemberDTO();
	
	Scanner input = new Scanner(System.in);
	int num = 0;
	String name = null;
	int k = 0, e = 0, m = 0;
	char g = 0;
	
	public void Input() {
		
		System.out.print("학생 이름 : ");
		name = input.next();
		dto.setName(name);
		System.out.print("국어 점수 : ");
		k = input.nextInt();
		dto.setKor(k);
		System.out.print("영어 점수 : ");
		e = input.nextInt();
		dto.setEng(e);
		System.out.print("수학 점수 : ");
		m = input.nextInt();
		dto.setMath(m);
	}
	
	public void Service() {
		
		while(true) {
			System.out.println("-------------------------------");
			System.out.println("1. 학생 등록");
			System.out.println("2. 학생 보기");
			System.out.println("3. 정보 수정");
			System.out.println("4. 회원 탈퇴");
			System.out.println("5. 종료");
			System.out.print(">>>");
			num = input.nextInt();
			
			if(num == 1) {
				if(dto.getName() == null) {
					System.out.println("[학생 등록]");
					Input();
				}
				else
					System.out.println("학생이 이미 등록되었습니다.");
				
			} else if(num == 2) {
				if(dto.getName() == null) 
					System.out.println("등록된 학생이 없습니다.");
				else
				{
					System.out.println("[학생 보기]");
					System.out.println("학생 이름 : " + dto.getName());
					System.out.println("국어 점수 : " + dto.getKor());
					System.out.println("영어 점수 : " + dto.getEng());
					System.out.println("수학 점수 : " + dto.getMath());
					System.out.println("점수 총합 : " + dto.getSum());
					System.out.println("학생 등급 : " + dto.getGrade());
				}
				
			} else if(num == 3) {
				
				if(dto.getName() == null) 
					System.out.println("등록된 학생이 없습니다.");
				else {
					System.out.println("[정보 수정]");
					Input();
				}
			} else if(num == 4) {
				if(dto.getName() == null) 
					System.out.println("등록된 학생이 없습니다.");
				else {
					System.out.println("[탈퇴 완료]");
					dto.setName(null);
					dto.setKor(0);
					dto.setEng(0);
					dto.setMath(0);
				}
				
			} else if(num == 5) {
				System.out.println("[종료]");
				break;
			} else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}	
