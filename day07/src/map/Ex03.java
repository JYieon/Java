package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("이름", "홍길동");
		map.put("나이", "20");
		System.out.println("map : " + map);
		
		System.out.println("key set : " + map.keySet());
		System.out.println("values : " + map.values());
		
		Set<String> set = map.keySet(); //Hashset과 사용법 같음
		System.out.println("set : " + set);
		
		Iterator<String> it = set.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		
		System.out.println(map.get("이름"));
		System.out.println(map.get("나이"));
		System.out.println("---------------");
		it = set.iterator();//it 처음 위치로 이동
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + " : " + map.get(key));
		}
	}
}
