package if_;

import java.util.Scanner;

public class SelfQuiz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //입력받기 위한 Scanner
		int sel = 2000; //설레임 가격
		int wol =  1500; //월드콘 가격
		int jo = 500; //죠스바 가격
		int dda = 700; //따옴 가격
		int to = 5000; //투게더 가격
		int ha = 4500; //하겐다즈 가격
		int sum = 0; //총 금액
		
		System.out.println("-------- [아 이 스 크 림 할 인 점] --------");
		System.out.print("나한테 있는 돈 : ");
		int money = sc.nextInt(); // 내가 가지고 있는 돈
		System.out.println("설레임 : 2000원\n월드콘 : 1500원\n죠스바 : 500원\n따옴 : 700원\n투게더 : 5000원\n하겐다즈 : 4500원");
		System.out.println("---------------------------------------");
		System.out.println("먹고싶은 아이스크림의 갯수를 입력하시오(0개도 가능)");
		System.out.print("설레임 : ");
		int sel2 = sc.nextInt(); // 설레임 갯수 입력
		sum += sel*sel2; //총 금액에 먹고 싶은 설레임 갯수만큼 가격을 더해준다.
		System.out.print("월드콘 : ");
		int wol2 = sc.nextInt();  // 월드콘 갯수 입력
		sum += wol*wol2; //총 금액에 먹고 싶은 월드콘 갯수만큼 가격을 더해준다.
		System.out.print("죠스바 : ");
		int jo2 = sc.nextInt(); // 죠스바 갯수 입력
		sum += jo*jo2; //총 금액에 먹고 싶은 죠스바 갯수만큼 가격을 더해준다.
		System.out.print("따옴 : ");
		int dda2 = sc.nextInt(); // 따옴 갯수 입력
		sum += dda*dda2; //총 금액에 먹고 싶은 따옴 갯수만큼 가격을 더해준다.
		System.out.print("투게더 : ");
		int to2 = sc.nextInt(); // 투게더 갯수 입력
		sum += to*to2; //총 금액에 먹고 싶은 투게더 갯수만큼 가격을 더해준다.
		System.out.print("하겐다즈 : ");
		int ha2 = sc.nextInt(); // 하겐다즈 갯수 입력
		sum += ha*ha2; //총 금액에 먹고 싶은 하겐다즈 갯수만큼 가격을 더해준다.
		System.out.println("---------------------------------------");
		System.out.println("[내가 고른 아이스크림]\n설레임 "+sel2+"개\n월드콘 "+wol2+"개\n죠스바 "+jo2
				+"개\n따옴 "+dda2+"개\n투개더 "+to2+"개\n하겐다즈 "+ha2+"개"); // 내가 고른 아이스크림 갯수 출력
		System.out.println("---------------------------------------");
		System.out.println("총 결제금액 : "+sum+"원"); //총 결제금액 출력
		if(money<sum) {
			System.out.println("잔액이 부족합니다."); //만약 결제금액보다 돈이 없다면 잔액 부족 출력
		}else {
			System.out.println("결제완료. 거스름돈 : "+ (money - sum)); // 결제가능한 만큼 돈이 있다면 거스름돈 출력
		}
		
	}
}
