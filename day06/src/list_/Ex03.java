package list_;

import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("111");
		arr.add("222");
		arr.add("333");
		
//		String [] id = {"aaa", "bbb"};
//		System.out.println( id[0].equals("bbb"));
//		System.out.println( id[1].equals("bbb")); //list는 값은 비굑하는 명령이 따로 있다.
		
		System.out.println("arr = " + arr);
		System.out.println(arr.contains("222")); //222라는 값이 존재하는지 찾음
		System.out.println(arr.contains("홍길동"));
		
		boolean bool = arr.contains("홍길동");
		System.out.println("bool : " + bool);
		
		System.out.println("삭제 전 arr" + arr);
		System.out.println("삭제 전 size" + arr.size());
		arr.remove(1); //index삭제
		System.out.println("삭제 1 arr : " + arr);
		System.out.println("삭제 1 size : " + arr.size());
		
		arr.remove("111"); //index삭제
		System.out.println("삭제 111 arr : " + arr);
		System.out.println("삭제 111 size : " + arr.size());
		
		
	}

}
