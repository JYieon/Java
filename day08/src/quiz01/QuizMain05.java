package quiz01;

import java.util.ArrayList;
import java.util.HashMap;

public class QuizMain05 {
	// 3번의 내용을 Map를 각 기능별로 만들기
	public static void main(String[] args) {
		System.out.println("--- map 이용 ---");
		QuizTest05 t = new QuizTest05();
		HashMap<String, Integer> map = t.myInput();
		map = t.op( map );
		t.print( map );
	}
}
