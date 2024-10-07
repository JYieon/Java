package random;

import java.util.Random;

public class Ex01 {
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println(Math.random()); //기본적으로 결과값은 더블형태로 출력(0.000..~0.999.. 까지의 값)
		}
		
		System.out.println("--------------------");
		
//		0.000001 ~ 0.99999 * 3
//		=> 0.000003 ~ 2.999999
//		=> int형변환 : 0 ~ 2
//		
		
		for(int i = 0; i < 5; i++) {
			double dou = Math.random() * 3; // 뒤의 숫자 : 몇개의 숫자를 뽑을거냐? 0~2(3개)
			System.out.println((int)dou); 
		}
		
		System.out.println("--------------------");
		Random ran = new Random();
		for(int i = 0; i < 5; i++) {
			int r = ran.nextInt(3); //0~2
			System.out.println(r + 10);
		}
		
		
		
	}
}
