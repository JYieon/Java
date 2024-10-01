package for_;
//1~100까지의 합 중에서 그 합이 528일 때 i의 값을 출력

public class Quiz02 {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
			if (sum == 528) {
				System.out.println("sum : " + sum);
				System.out.println("i : " + i);
			}
			
		}
	}
}
