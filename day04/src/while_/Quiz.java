package while_;

import java.util.Scanner;

public class Quiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean bool = true;
		
		System.out.println("------------ 아이스크림 할인점 ------------");
		System.out.print("나한테 있는 돈 : ");
		int money = input.nextInt(); // 내가 가지고 있는 돈
		
		while(bool) { //bool이 true인 동안 반복
			int sel = 0, selm = 2000; //설레임 가격
			int wol = 0, wolm =  1500; //월드콘 가격
			int jo = 0, jom = 500; //죠스바 가격
			int dda = 0, ddam = 700; //따옴 가격
			int to = 0, tom = 5000; //투게더 가격
			int ha = 0, ham = 4500; //하겐다즈 가격
			int sum = 0; //총 금액
			String notice = null; //안내문
			
			System.out.println("[아이스크림 종류]");
			System.out.println("설레임\t: 2000원\n월드콘\t: 1500원\n죠스바\t: 500원\n따옴\t: 700원\n투게더\t: 5000원\n하겐다즈\t: 4500원");
			System.out.println("\'장바구니\'를 입력하면 지금까지 고른 것을 확인할 수 있습니다");			
			System.out.println("다 고르셨으면 \'계산\'을 입력해주세요");
			
			while(true) {
				System.out.println("---------------------------------------");
				System.out.print("아이스크림을 고르시오 : ");
				String ice = input.next(); // 아이스크림 종류 입력
				
				if(ice.equals("계산")) { //입력한 값이 '계산'이면
					break; //현재 while문 탈출.
				}else if(ice.equals("장바구니")){ //입력한 값이 '장바구니'이면
					System.out.println("[장바구니]");
					System.out.println("설레임\t: "+sel+"개\n"+"월드콘\t: "+wol+"개\n"+"죠스바\t: "+jo+"개\n"+
										"따옴\t: "+dda+"개\n"+"투게더\t: "+to+"개\n"+"하겐다즈\t: "+ha+"개");
					continue; // 다시 아이스크림을 고르도록현재 while문의 처음 위치로 이동.
				}
				
				System.out.print("갯수를 입력하시오 : ");
				int num = input.nextInt(); //아이스크림 갯수 입력
				
				// 메뉴에 있는 아이스크림만 입력 가능.
				// 갯수와 총 금액 저장
				if(ice.equals("설레임")) {
					sel += num;
					sum += (selm * num);
				}else if(ice.equals("월드콘")) {
					wol += num;
					sum += (wolm * num);
				}else if(ice.equals("죠스바")) {
					jo += num;
					sum += (jom * num);
				}else if(ice.equals("따옴")) {
					dda += num;
					sum += (ddam * num);
				}else if(ice.equals("투게더")) {
					to += num;
					sum += (tom * num);
				}else if(ice.equals("하겐다즈")) {
					ha += num;
					sum += (ham * num);
				}else { // 정해진 입력값이 아니면 
					System.out.println("없는 상품입니다. 다시 입력해주세요");
					continue; // 다시 입력하도록 현재 while문의 처음으로 이동. 
				}
			}
			
			// 계산
			System.out.println("---------------------------------------");
			System.out.println("총 결제금액 : "+sum+"원"); //총 결제금액 출력
			if(money<sum) {
				System.out.println("잔액이 부족합니다."); //만약 결제금액보다 돈이 없다면 잔액 부족 출력
				notice = "다시"; //계산 후 나타날 안내문의 종류. '더'인지, '다시'인지 구분하여 안내문 출력하기 위함.
				sum = 0; // 재구매를 위해 sum값 초기화
			}else {
				System.out.println("결제완료. 거스름돈 : "+ (money - sum)); // 결제가능한 만큼 돈이 있다면 거스름돈 출력
				notice = "더"; //계산 후 나타날 안내문의 종류. '더'인지, '다시'인지 구분하여 안내문 출력하기 위함.
			}
			
			//구매여부
			while(true) {
				System.out.println("---------------------------------------");
				System.out.print(notice + " 구매하시겠습니까?(y/n) ");
				String yn = input.next(); // 구매여부 입력
				if(yn.equals("y")) { //다시 구매
					System.out.println("---------------------------------------");
					System.out.println("[[" + notice + " 고르기]]");
					System.out.println("내가 가진 돈 : " + (money - sum));
					money = money - sum; // 내가 가진 돈 초기화
					break;
				} else if(yn.equals("n")){ //구매 종료
					bool = false; // 모든 while문을 종료하기 위해 가장 상위의 while문의 조건 bool을 false로 바꿔준다.
					break;
				} else { // 잘못입력한 경우
					System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					continue; //다시 입력할 수 있도록 현재 while의 처음 위치로 돌아감.
				}
			}
			
		}
		System.out.println("아이스크림 구매를 종료합니다.");
	}
}
