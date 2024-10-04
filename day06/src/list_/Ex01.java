package list_;

import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		//배열 선언시 자료형과 함께 선언, 같은 자료형만 사용 가능
		//arraylist
		//ArrayList<int> arr = new ArrayList<int>();//error  
		//ArrayList<String> arr = new ArrayList<String>();//문자열만 저장하겠다는 의미. AL에는 class라는 자료형만 저장 가능
		//class의 이름은 첫문자가 무조건 대문자 
		//그래서 나온게 Wrapper Class Primitive Type이 기본 자료형
		//int -> Integer라는 새로운 자료형을 만들어 Class 자료형을 만듬
		//저장하는 건 동일
		int num = 100;//기본 자료형
		//String s = num; //error
		Integer i = num;//Class 자료형
		System.out.println("i : " + i);
		System.out.println("num : " + num);
		
		ArrayList<Integer> arr = new ArrayList<Integer>();//가변. 크기를 따로 지정 X. 유연하게 처리 가능.배열보다는 처리속도가 느리긴함(고정적)
		arr.add(100);//값을 저장. 자료형에 맞춰서 값을 저장해야함.
		arr.add(300);
		System.out.println("arr : " + arr); 
		System.out.println("get(0) : " + arr.get(0));//값을 가져옴
		System.out.println("get(0) : " + arr.get(1));
		
		int n = arr.get(0);
		n += 100;
		if(n < 100) {
			
		}
		
		for(int k = 0; k < 2; k++) {
			System.out.println(arr.get(k));
		}
	}
}
