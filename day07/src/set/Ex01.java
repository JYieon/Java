package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// set. 순서대로 저장되지 않음. 공간이 미리 만들어 지고 만들어진 공간에 랜덤으로 저장 -> index로 접근 불가
		
		HashSet<String> set = new HashSet<String>();
		ArrayList<String> arr = new ArrayList<String>();
		set.add("순대");
		set.add("김밥");
		set.add("순대");
		set.add("라면");
		
		arr.add("순대");
		arr.add("김밥");
		arr.add("순대");
		arr.add("라면");
		
		System.out.println("set : " + set);
		System.out.println("arr : " + arr); //중복 허용X
		
		System.err.println("--------------------------");
		//rotto
		
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		Random ran = new Random();
		for( ; 6 > arrInt.size() ; ) {
			int r = ran.nextInt(6) + 1;
			if(!arrInt .contains(r)) { //arrInt .contains(r)==false
				arrInt.add(r);//중복. 잘못만듬 -> if문 추가
				
			}
//			arrInt.add(ran.nextInt(6) + 1);//중복. 잘못만듬 -> if문 추가
		}
		System.out.println("arrInt : " + arrInt);
		
		HashSet<Integer> setInt = new HashSet<Integer>();
		for( ; 6 > setInt.size() ; ) {
			setInt.add(ran.nextInt(6) + 1);//중복X
		}
		System.out.println("setInt : " + setInt);
	}

}
