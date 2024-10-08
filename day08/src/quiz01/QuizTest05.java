package quiz01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class QuizTest05 {
	public HashMap<String, Integer> myInput() {
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		System.out.println("첫 수 입력");
		int n1 = input.nextInt();
		map.put("n1",n1);
		System.out.println("두번째 수 입력");
		map.put("n2",input.nextInt());
		return map;
	}
	public HashMap<String, Integer> op(HashMap<String, Integer> map ) {
		int result = map.get("n1") + map.get("n2");
		map.put("sum", result);
		return map;
	}
	public void print(HashMap<String, Integer> map) {
		System.out.println(map.get("n1") +
				"+" + map.get("n2") + "=" 
				+ map.get("sum"));
	}
}
