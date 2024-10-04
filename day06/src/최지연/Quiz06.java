package 최지연;

public class Quiz06 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		for(; sum < 10000; i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		
		System.out.println("i : " + (i-1));
		System.out.println("총합 : " + sum);
	}
}
