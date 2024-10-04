package list_;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {
			System.out.println(i + ".번째 입력");
//			String n = input.next();
//			arr.add(n);
			arr.add(input.next()); //한줄로도 표현가능
		}
		System.out.println(arr);
		System.out.println("찾을 값 입력");
		String search = input.next();
		System.out.println("contains : " + arr.contains(search)); //값이 존재하는지 확은 true or false
		System.out.println("indexOf : " + arr.indexOf(search));  //값이 어디에 위치하는지 인덱스번호 출력.. 없으면 -1
		
		//[라면, 김밥, 떡볶이] 김밥을 변경하고 싶음.
		//김밥 존재?
		//김밥 삭제 후 순대 추가
		//[라면, 순대, 떡볶이]
		
		System.out.print("변경할 위치 입력 : ");
		int index = input.nextInt();
		System.out.print("변경할 데이터 입력 : ");
		String data = input.next();
		
		arr.set(index, data);
		System.out.println(arr);
	
	}

}
