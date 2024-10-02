package array_;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = new int[5]; 
		//arr = [0, 0, 0, 0, 0] 각각에 공간은 0으로 자동으로 초기화 됨.
		      // 0  1  2  3  4
		arr[3] = 4000;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		double dos[] = new double[] {1.11, 2.22, 3.33}; //해당하는 값으로 초기화
		//dos = [1.11, 2.22, 3.33]
		    //   0     1     2
		
//		for(int i = 0; i <= 3; i++) { //arrayindexout에러. index 범위를 넘어감. length사용
//			System.out.println(i + " = " + dos[i]);
//		}
		
		System.out.println("length : " + dos.length);
		
		System.out.println("------------");
		
		String[] str = new String[3]; //전부 null로 초기화됨
		System.out.println("str[0] : " + str[0]);
		System.out.println("length : " + str.length);
		
		Scanner input = new Scanner(System.in);
		for(int i = 0; i<str.length; i++) {
			System.out.println(i+".번째 입력");
			str[i] = input.next();
		}
		System.out.println("--- 출력 ---");
		for(int i = 0; i < str.length; i++) {
			System.out.println(i+"."+str[i]);
		}
	}
}
