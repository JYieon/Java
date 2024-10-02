package array_;

import java.util.Scanner;

public class Quiz03 {
	public static void main(String[] args) {
		int arr[] = new int[] {10, 54, 13, 17, 25, 30};
		
		Scanner input = new Scanner(System.in);
		String odd_even = null;
		System.out.print("짝수, 홀수 입력 : ");
		odd_even = input.next();
		
//		if(odd_even.equals("짝수")) {
//			for(int i = 0; i < arr.length; i++) {
//				if(i  % 2 == 0)
//					System.out.println("짝수 : " + arr[i]);
//			}
//		} else if(odd_even.equals("홀수")) {
//			for(int i = 0; i < arr.length; i++) {
//				if(i  % 2 != 0)
//					System.out.println("홀수 : " + arr[i]);
//			}
//		}
		
		
		if(odd_even.equals("짝수")) {
			for(int i = 0; i < arr.length; i+=2) {
					System.out.println("짝수 : " + arr[i]);
			}
		} else if(odd_even.equals("홀수")) {
			for(int i = 1; i < arr.length; i+=2) {
					System.out.println("홀수 : " + arr[i]);
			}
		}
		
		
//		for( int i = odd_even.equals("짝")?0:1 ; i < arr.length ; i += 2) {
//		      System.out.println( arr[i] );
//		   }

	}
}
