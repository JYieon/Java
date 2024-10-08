package quiz01;

import java.util.ArrayList;

public class QuizMain04 {
	// 3번의 내용을 ArrayList로 만들기
	public static void main(String[] args) {
		System.out.println("--- list 이용 ---");
		QuizTest04 t = new QuizTest04();
		ArrayList<Integer> arr = t.myInput();
		int result = t.op( arr.get(0), arr.get(1) );
		arr.add(result);
		t.print( arr );
	}
}
