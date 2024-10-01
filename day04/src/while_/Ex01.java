package while_;

public class Ex01 {
	public static void main(String[] args) {
		
		for(int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
		
		int i = 0;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
		System.out.println("i : " + i); //i가 6이라 조건식을 빠져나온 것을 알 수 있다.
	}
}
