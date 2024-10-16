package singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

interface Int06{
	public int num = 1234;
	public final int num1 = 200;
	public static final int num2 = 300; //세 변수 다 같은 의미 
	
}

class A06{
	public int num = 100;
	public static int num1;
	public static final int num2 = 300;
	static {
		for(int i = 0; i < 5; i++) {
			num1 = i;
		}
			
	}
}

public class Ex05 {
	public static void main(String[] args) {
		System.out.println(Int06.num);
		ArrayList<String> arr = new ArrayList<String>();
		HashMap<String, String> map = new HashMap<String, String>();
		HashSet<String> set = new HashSet<String>();
	}
}
