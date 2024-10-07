package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Ex02 {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("111");
		set.add("222");
		set.add("333");
		
		boolean bool = set.remove("222111"); //데이터 삭제 완료 true. 삭제 실패 false 저장
		System.out.println("bool : " + bool);
		System.out.println("set : " + set);
		
		/*
		 * iterator = 반복자
		 * 컬렉션에 있는 값을 배열 형식으로 만들어준다
		 * 처음 위치는 bof, 마지막 위치는 eof
		 * bof : 시작점, eof : 끝나는 지점
		*/
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(111);
		arr.add(222);
		arr.add(333);
		Iterator<Integer> it = arr.iterator();
		/*
		 * System.out.println(it.hasNext()); //it가 알고 있는 index 다음위치에 값이 있나 true or false
		 * System.out.println(it.next()); //it가 알고 있는 위치의 다음 위치로 이동 + 다음 위치의 값 꺼내오기. it의
		 * 위 이동 System.out.println(it.next()); System.out.println(it.next());
		 * System.out.println(it.hasNext()); //false System.out.println(it.next());
		 * //error. 값 없음
		 */ 
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("------------------------");
		Iterator<String> its = set.iterator();
		while(its.hasNext()) {
			String s = its.next();
			System.out.println(s);
		}
	}
}
